package discordBot.main;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.common.base.Stopwatch;

import discordBot.main.events.command.Command;
import discordBot.main.events.command.CommandHandler;
import discordBot.main.events.command.CommandListener;
import discordBot.main.events.command.commands.CommandsCommand;
import discordBot.main.events.command.commands.DropsCommand;
import discordBot.main.events.command.commands.InfoCommand;
import discordBot.main.events.command.commands.OffersCommand;
import discordBot.main.events.command.commands.OnlineCommand;
import discordBot.main.events.command.commands.PlayersCommand;
import discordBot.main.events.command.commands.StaffCommand;
import discordBot.main.events.command.commands.StatsCommand;
import discordBot.main.events.command.commands.WealthCommand;
import discordBot.main.events.ingame.GEOffersListener;
import discordBot.main.events.ingame.LoyaltyListener;
import discordBot.main.events.listeners.MemberListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.Game.GameType;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 */
public class Main extends ListenerAdapter {

	/**
     * The {@link Logger} used to display important information regarding the
     * server up-time.
     */
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    
    /**
     * Represents the JDA 
     */
    public static JDA bot;
    
    /**
     * Represents the message channel
     */
    public static MessageChannel channel;
    
    /**
     * Represents the Instance of this Class
     */
    private static Main instance;


	public static void init() {
		logger.info("Started the " + Constants.NAME + " DiscordBot!");
		Stopwatch stopwatch = Stopwatch.createStarted();
		setInstance(getInstance());
        try {
        	getInstance().initDiscordBot();
        	getInstance().initCommands();
        	getInstance().initListeners();
        } catch (Throwable throwable) {
            logger.log(Level.SEVERE, "There was an error while launching the bot server.", throwable);
            System.exit(-1);
        }
        logger.info(Constants.NAME + " BotMain => LoadedTime=" + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms]");
        System.gc();
	}
	
	/**
	 * @return
	 */
	public boolean initDiscordBot() {
		try {
			bot = new JDABuilder(AccountType.BOT).setToken(Constants.TOKEN).build();
			bot.setAutoReconnect(true);
			bot.getPresence().setStatus(OnlineStatus.ONLINE);
			bot.getPresence().setGame(Game.of(GameType.DEFAULT, Constants.MESSAGE));
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info(Constants.NAME + " Discord Bot Successfully loaded!");
		return true;
	}
	
	/**
	 * @return
	 */
	public boolean initCommands() {
		CommandHandler.COMMAND_MAP.put("staff", new StaffCommand());
		CommandHandler.COMMAND_MAP.put("stats", new StatsCommand());
		CommandHandler.COMMAND_MAP.put("wealth", new WealthCommand());
		CommandHandler.COMMAND_MAP.put("players", new PlayersCommand());
		CommandHandler.COMMAND_MAP.put("online", new OnlineCommand());
		CommandHandler.COMMAND_MAP.put("drops", new DropsCommand());
		CommandHandler.COMMAND_MAP.put("commands", new CommandsCommand());
		CommandHandler.COMMAND_MAP.put("info", new InfoCommand());
		CommandHandler.COMMAND_MAP.put("offers", new OffersCommand());
		String message = "";
		for (Map.Entry<String, Command> command : CommandHandler.COMMAND_MAP.entrySet()) {
			message += "\nCommand: '" + command.getKey().toString() + "' Sucessfully Loaded!";
		}
		logger.info(message);
		logger.info(Constants.NAME + " Successfully loaded [" + CommandHandler.COMMAND_MAP.size() + "] Commands!");
		return true;
	}
	
	/**
	 * @return
	 */
	public boolean initListeners() {
		bot.addEventListener(
					new Main(),
					new CommandListener(),
					new MemberListener(),
					new GEOffersListener(),
					new LoyaltyListener()
				);
		logger.info(Constants.NAME + " Successfully loaded [" + bot.getRegisteredListeners().size() + "] Listeners!");
		return true;
	}
    
    /**
     * @param instance the instance to set
     */
    public static void setInstance(Main instance) {
    	Main.instance = instance;
    }
    

	 /**
    * @return
    */
   public static Main getInstance() {
       if (instance == null) {
           try {
               instance = new Main();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       return instance;
   }

}

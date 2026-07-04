package com.rs.tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Utils;

public class ItemListDumper {

	public static final void main(String[] args) throws IOException {
		Cache.init();
		BufferedWriter writer = new BufferedWriter(new FileWriter("lists/itemList881.txt"));
		for (int i = 0; i < Utils.getItemDefinitionsSize(); i++) {
			ItemDefinitions defs = ItemDefinitions.getItemDefinitions(i);
			if (defs != null && defs.getName() != null) {
				writer.flush();
				writer.newLine();
				writer.write(defs.id + " - " + defs.name);
			}
		}
	}
}
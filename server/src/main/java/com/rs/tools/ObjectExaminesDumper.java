package com.rs.tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.utils.Utils;

public class ObjectExaminesDumper {

	public static final void main(String[] args) throws IOException {
		Cache.init();
		BufferedWriter writer = new BufferedWriter(new FileWriter("lists/objectExamines881.txt"));
		for (int i = 0; i < Utils.getObjectDefinitionsSize(); i++) {
			ObjectDefinitions defs = ObjectDefinitions.getObjectDefinitions(i);
			if (defs != null && defs.name != null) {
				writer.flush();
				writer.newLine();
				writer.write(i + " - " + defs.name);
			}
		}
	}
}
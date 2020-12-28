package com.dataprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.dataprocessing.events.CsvImporter;

public class Runner {

	private static String PROPERTIES_FILE_PATH = "src/main/resources/application.properties";

	public static void main(String[] args) throws FileNotFoundException, IOException {

		if (args.length > 1) {
			String inputPAth = args[0];
			String outputPAth = args[1];
			if (new File(inputPAth).exists()) {
				CsvImporter csvImporter = new CsvImporter(inputPAth, outputPAth, PROPERTIES_FILE_PATH);
				csvImporter.startImport();
				System.out.println("CSV processing is Ended...");
			} else {
				System.out.println("file not available in input folder");
			}
		} else {
			System.out.println("run with inputs");
		}

	}

}
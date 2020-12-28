package com.dataprocessing.events;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

	private String inputPAth;

	public CsvReader(String inputPAth) {
		this.inputPAth = inputPAth;
	}

	public List<Person> StartReading() {
		List<Person> listOfRecords = new ArrayList<Person>();
		String csvFile = inputPAth;
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {

				String[] column = line.split(cvsSplitBy);

				int c = 0;

				if (column.length == 10) {
					listOfRecords.add(new Person(Integer.parseInt(column[c++]), column[c++], column[c++],
							Integer.parseInt(column[c++]), Float.parseFloat(column[c++]),
							Float.parseFloat(column[c++]), Float.parseFloat(column[c++]), column[c++], column[c++],
							Float.parseFloat(column[c++])));
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return listOfRecords;

	}

}
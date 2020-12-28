package com.dataprocessing.events;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.dataprocessing.util.LoadProperties;

public class CsvImporter {

	private String inputPAth;

	private String outputPAth;

	private String propertiesFilePath;

	public CsvImporter(String inputPAth, String outputPAth, String propertiesFilePath) {
		this.inputPAth = inputPAth;
		this.outputPAth = outputPAth;
		this.propertiesFilePath = propertiesFilePath;
	}

	public void startImport() throws FileNotFoundException, IOException {
		CsvReader csvReader = new CsvReader(inputPAth);
		List<Person> listOfPersons = csvReader.StartReading();
		listOfPersons = sortListOfRecords(listOfPersons);
		List<String> listOfCountries = getCountries(listOfPersons);
		LoadProperties loadProperties = new LoadProperties(this.propertiesFilePath);
		CsvWriter csvWriter = new CsvWriter(outputPAth, listOfPersons, listOfCountries,loadProperties.getPoperties());
		csvWriter.StartWriting();
	}
	
	private List<String> getCountries(List<Person> listOfPersons) {
		Set<String> listOfCountry = new HashSet<String>();
		for(Person person:listOfPersons) {
			listOfCountry.add(person.getCountry().replaceAll(" ", ""));
		}
		List<String> sortListOfCountry= new ArrayList<String>(listOfCountry);
		Collections.sort(sortListOfCountry);
		return sortListOfCountry;
	}

	private List<Person> sortListOfRecords(List<Person> listOfPersons) {
		Collections.sort(listOfPersons);	
		return listOfPersons;
	}

}

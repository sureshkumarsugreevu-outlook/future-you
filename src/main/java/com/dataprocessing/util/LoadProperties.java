/**
 * 
 */
package com.dataprocessing.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.dataprocessing.events.CsvFontFamily;

public class LoadProperties {

	private String filePath;

	public LoadProperties(String filePath) {
		this.filePath = filePath;
	}

	public CsvFontFamily getPoperties() {
		CsvFontFamily csvFontFamily = new CsvFontFamily();
		try (InputStream input = new FileInputStream(this.filePath)) {

			Properties prop = new Properties();

			prop.load(input);

			csvFontFamily.setHeaderBackgroundColor(prop.getProperty("header.background.color"));
			csvFontFamily.setHeaderFontColor(prop.getProperty("header.font.color"));
			csvFontFamily.setHeaderFontStyle(prop.getProperty("header.font.style"));
			csvFontFamily.setHeaderFontName(prop.getProperty("header.font.name"));
			csvFontFamily.setHeaderFontHeight(prop.getProperty("header.font.height"));

			csvFontFamily.setRowFontStyle(prop.getProperty("row.font.style"));
			csvFontFamily.setRowBackgroundColor(prop.getProperty("row.background.color"));
			csvFontFamily.setRowFontColor(prop.getProperty("row.font.color"));
			csvFontFamily.setRowFontName(prop.getProperty("row.font.name"));
			csvFontFamily.setRowFontHeight(prop.getProperty("row.font.height"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return csvFontFamily;
	}
}

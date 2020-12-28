/**
 * 
 */
package com.dataprocessing.events;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.dataprocessing.util.FontStyleConstants;

public class CsvWriter {

	private String outputPAth;

	File file;

	List<Person> listOfPeople;

	CsvFontFamily csvFontFamily;

	List<String> listOfCountries;

	public CsvWriter(String outputPAth, List<Person> listOfPeople, List<String> listOfCountries,
			CsvFontFamily csvFontFamily) {
		this.outputPAth = outputPAth;
		this.listOfPeople = listOfPeople;
		this.listOfCountries = listOfCountries;
		this.csvFontFamily = csvFontFamily;
	}

	public void StartWriting() throws FileNotFoundException, IOException {
		writing();
	}

	private void writing() throws FileNotFoundException, IOException {
		int rowCount = 0;
		for (String country : listOfCountries) {
			if (new File(outputPAth + File.separator + country + ".xls").exists()) {

			} else {

				String path = outputPAth + File.separator + country;
				
				File file = new File(path);
				
				if(!file.exists()) {
					file.mkdirs();
				}
				
				Workbook wb = new HSSFWorkbook();

				OutputStream fileOut = new FileOutputStream(path + File.separator + country+java.time.LocalDate.now()+ ".xls");

				Sheet sheet = wb.createSheet("Contry wise list");

				Row row1 = sheet.createRow(rowCount);

				CellStyle style = wb.createCellStyle();
				Font font = wb.createFont();
				for (IndexedColors env : IndexedColors.values()) {
					if (env.name().equalsIgnoreCase(csvFontFamily.getHeaderFontColor().toUpperCase())) {
						IndexedColors indexedColors = IndexedColors.valueOf(env.name());
						font.setColor(indexedColors.getIndex());
						if (csvFontFamily.getHeaderFontStyle().toUpperCase()
								.equalsIgnoreCase(FontStyleConstants.BOLD_FONT_STYLE)) {
							font.setBold(true);

						} else if (csvFontFamily.getHeaderFontStyle().toUpperCase()
								.equalsIgnoreCase(FontStyleConstants.ITALIC_FONT_STYLE)) {
							font.setItalic(true);
						}
					}

					if (env.name().equalsIgnoreCase(csvFontFamily.getHeaderBackgroundColor().toUpperCase())) {
						IndexedColors sitUrl = IndexedColors.valueOf(env.name());
						style.setFillForegroundColor(sitUrl.getIndex());
						style.setFillPattern(CellStyle.SOLID_FOREGROUND);

					}
				}

				font.setFontName(csvFontFamily.getHeaderFontName());
				font.setFontHeight((short) Integer.parseInt(csvFontFamily.getHeaderFontHeight()));
				style.setFont(font);
				int c = 0;
				Cell cell = row1.createCell(c++);
				cell.setCellValue("S.No.");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Item");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Name");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Value1");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Value2");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Value3");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Value4");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Country");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Department");
				cell.setCellStyle(style);
				cell = row1.createCell(c++);
				cell.setCellValue("Value5");
				cell.setCellStyle(style);

				for (Person person : listOfPeople) {
					rowCount = rowCount +1;
					if (person.getCountry().equals(country)) {
						Row row = sheet.createRow(rowCount);

						int columnCount = 0;

						cell = row.createCell(columnCount);
						cell.setCellValue(person.getId());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getItem());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getName());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getValue1());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getValue2());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getValue3());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getValue4());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getCountry());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getDepartment());
						cell.setCellStyle(style);
						cell = row.createCell(++columnCount);
						cell.setCellValue(person.getValue5());
						cell.setCellStyle(style);
					}
				}
				
				wb.write(fileOut);
				fileOut.close();
				wb.close();
			}

		}

	}
}

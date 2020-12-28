/**
 * 
 */
package com.dataprocessing.events;

public class CsvFontFamily {

	private String rowNum;
	private String headerBackgroundColor;
	private String headerFontColor;
	private String headerFontStyle;
	private String headerFontName;
	private String headerFontHeight;
	private String rowBackgroundColor;
	private String rowFontColor;
	private String rowFontStyle;
	private String rowFontName;
	private String rowFontHeight;

	public String getRowNum() {
		return rowNum;
	}

	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
	}

	public String getHeaderBackgroundColor() {
		return headerBackgroundColor;
	}

	public void setHeaderBackgroundColor(String headerBackgroundColor) {
		this.headerBackgroundColor = headerBackgroundColor;
	}

	public String getHeaderFontColor() {
		return headerFontColor;
	}

	public void setHeaderFontColor(String headerFontColor) {
		this.headerFontColor = headerFontColor;
	}

	public String getHeaderFontStyle() {
		return headerFontStyle;
	}

	public void setHeaderFontStyle(String headerFontStyle) {
		this.headerFontStyle = headerFontStyle;
	}

	public String getRowBackgroundColor() {
		return rowBackgroundColor;
	}

	public void setRowBackgroundColor(String rowBackgroundColor) {
		this.rowBackgroundColor = rowBackgroundColor;
	}

	public String getRowFontColor() {
		return rowFontColor;
	}

	public void setRowFontColor(String rowFontColor) {
		this.rowFontColor = rowFontColor;
	}

	public String getRowFontStyle() {
		return rowFontStyle;
	}

	public void setRowFontStyle(String rowFontStyle) {
		this.rowFontStyle = rowFontStyle;
	}

	public String getHeaderFontName() {
		return headerFontName;
	}

	public void setHeaderFontName(String headerFontName) {
		this.headerFontName = headerFontName;
	}

	public String getHeaderFontHeight() {
		return headerFontHeight;
	}

	public void setHeaderFontHeight(String headerFontHeight) {
		this.headerFontHeight = headerFontHeight;
	}

	public String getRowFontName() {
		return rowFontName;
	}

	public void setRowFontName(String rowFontName) {
		this.rowFontName = rowFontName;
	}

	public String getRowFontHeight() {
		return rowFontHeight;
	}

	public void setRowFontHeight(String rowFontHeight) {
		this.rowFontHeight = rowFontHeight;
	}

	@Override
	public String toString() {
		return "CsvFontFamily [rowNum=" + rowNum + ", headerBackgroundColor=" + headerBackgroundColor
				+ ", headerFontColor=" + headerFontColor + ", headerFontStyle=" + headerFontStyle
				+ ", rowBackgroundColor=" + rowBackgroundColor + ", rowBackgroundColor=" + rowBackgroundColor
				+ ", rowFontColor=" + rowFontColor + ", rowFontStyle=" + rowFontStyle + "headerFontName="
				+ headerFontName + "headerFontHeight=" + headerFontHeight + "rowFontName=" + rowFontName
				+ " rowFontHeight=" + rowFontHeight + "]";
	}
}

package com.dataprocessing.util;

public enum CsvFontFamilyConstraints {

	BLACK("BLACK"),
    WHITE("WHITE"),
    RED("RED"),
    BRIGHT_GREEN("BRIGHT_GREEN"),
    BLUE("BLUE"),
    YELLOW("YELLOW"),
    PINK("PINK"),
    TURQUOISE("TURQUOISE"),
    DARK_RED("DARK_RED"),
    GREEN("GREEN"),
    DARK_BLUE("DARK_BLUE"),
    DARK_YELLOW("DARK_YELLOW"),
    VIOLET("VIOLET"),
    TEAL("TEAL"),
    GREY_25_PERCENT("GREY_25_PERCENT"),
    GREY_50_PERCENT("GREY_50_PERCENT"),
    CORNFLOWER_BLUE("CORNFLOWER_BLUE"),
    MAROON("MAROON"),
    LEMON_CHIFFON("LEMON_CHIFFON"),
    ORCHID("ORCHID"),
    CORAL("CORAL"),
    ROYAL_BLUE("ROYAL_BLUE"),
    LIGHT_CORNFLOWER_BLUE("LIGHT_CORNFLOWER_BLUE"),
    SKY_BLUE("SKY_BLUE"),
    LIGHT_TURQUOISE("LIGHT_TURQUOISE"),
    LIGHT_GREEN("LIGHT_GREEN"),
    LIGHT_YELLOW("LIGHT_YELLOW"),
    PALE_BLUE("PALE_BLUE"),
    ROSE("ROSE"),
    LAVENDER("LAVENDER"),
    TAN("TAN"),
    LIGHT_BLUE("LIGHT_BLUE"),
    AQUA("AQUA"),
    LIME("LIME"),
    GOLD("GOLD"),
    LIGHT_ORANGE("LIGHT_ORANGE"),
    ORANGE("ORANGE"),
    BLUE_GREY("BLUE_GREY"),
    GREY_40_PERCENT("GREY_40_PERCENT"),
    DARK_TEAL("DARK_TEAL"),
    SEA_GREEN("SEA_GREEN"),
    DARK_GREEN("DARK_GREEN"),
    OLIVE_GREEN("OLIVE_GREEN"),
    BROWN("BROWN"),
    PLUM("PLUM"),
    INDIGO("INDIGO"),
    GREY_80_PERCENT("GREY_80_PERCENT"),
    AUTOMATIC("AUTOMATIC");
 
    private String fontConstraint;
 
    CsvFontFamilyConstraints(String fontConstraint) {
        this.fontConstraint = fontConstraint;
    }
 
    public String getFontConstraint() {
        return fontConstraint;
    }
	
}

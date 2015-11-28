package org.example.color.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import 	org.json.simple.JSONObject;
import  org.json.simple.parser.JSONParser;
import 	org.json.simple.parser.ParseException;

public class ManageJson {
	
	private static final String COLORS_PATH = ".\\config\\colors.json";
	
	public static JSONObject getSettingColors()throws ParseException, FileNotFoundException, IOException {
		JSONParser loadJson = new JSONParser();
		return (JSONObject) loadJson.parse(new FileReader(COLORS_PATH));
	}
}

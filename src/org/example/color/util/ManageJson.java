package org.example.color.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.example.interfaces.LoadJson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ManageJson implements LoadJson {
	
	private String path;
	
	public ManageJson(String path) {
		this.path = path;
	}
	
	@Override
	public JSONObject getJson() throws FileNotFoundException,
			IOException, ParseException {
		JSONParser loadJson = new JSONParser();
		return (JSONObject) loadJson.parse(new FileReader(path));
	}


}

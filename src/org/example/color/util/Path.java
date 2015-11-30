package org.example.color.util;

import org.example.interfaces.LoadJson;
import org.json.simple.JSONObject;

public class Path {
	
	private LoadJson loader;

	public Path(LoadJson load) {
		this.loader = load;
	}
	
	public String getPath(String colorName) throws Exception {
		return loader.getJson().get(colorName.toUpperCase()).toString();
	}
}

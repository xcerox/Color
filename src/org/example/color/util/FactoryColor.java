package org.example.color.util;

import org.example.color.interfaces.Color;
import org.json.simple.JSONObject;

public class FactoryColor {
	public static Color createColor(String colorName) throws Exception {
		JSONObject filePaths = ManageJson.getSettingColors();
		String path = filePaths.get(colorName).toString();

		Class<?> colorClass = Class.forName(path);
		Object colorInstance = colorClass.newInstance();
		
		if(colorInstance instanceof Color)
			return (Color)colorInstance;

		throw new RuntimeException("No se encontro");
	}
}

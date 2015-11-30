package org.example.color.util;

import org.example.interfaces.Color;
import org.example.interfaces.LoadJson;
import org.json.simple.JSONObject;

public class FactoryColor {

	private LoadJson loader;

	public FactoryColor(LoadJson load)
	{
		this.loader = load;
	}

	public Color createColor(String colorName) throws Exception {
		JSONObject filePaths = loader.getJson();
		String path = filePaths.get(colorName.toUpperCase()).toString();

		Class<?> colorClass = Class.forName(path);
		Object colorInstance = colorClass.newInstance();

		if (colorInstance instanceof Color)
			return (Color) colorInstance;

		throw new RuntimeException("No se encontro");
	}
}

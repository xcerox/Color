package org.example.color.util;

import org.example.exception.NotFindException;
import org.example.interfaces.Color;
import org.example.interfaces.LoadJson;
import org.json.simple.JSONObject;

/**
 * @author J.Reyes<ing.jairoreyes@gmail.com> Factoria de Colores
 */
public class FactoryColor {


	/**
	 * @param colorName
	 * @return new Color object from path;
	 * @throws Exception
	 */
	public static Color create(String path) throws Exception {
		Class<?> colorClass = Class.forName(path);
		return (Color)colorClass.newInstance();
	}
}

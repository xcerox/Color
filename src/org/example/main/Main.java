package org.example.main;

import java.util.Scanner;

import org.example.color.util.FactoryColor;
import org.example.color.util.ManageJson;
import org.example.color.util.Path;
import org.example.exception.NotFindException;
import org.example.interfaces.Color;
import org.example.interfaces.LoadJson;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escribe un color");
		String colorName = new Scanner(System.in).next();

		String pathJson = ".\\config\\colors.json";
		LoadJson jsonSetting = new ManageJson(pathJson);
		Path paths = new Path(jsonSetting);

		try {
			Color color = FactoryColor.create(paths.getPath(colorName));
			System.out.println(color.getName());
		} catch (NullPointerException notFind) {
			System.out.println("no se encontro el color: " + colorName);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}

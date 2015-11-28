package org.example.main;

import java.util.Scanner;

import org.example.color.interfaces.Color;
import org.example.color.util.FactoryColor;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escribe un color");
		String colorName = new Scanner(System.in).next();
		
		try{
		Color color = FactoryColor.createColor(colorName);
		System.out.println(color.getName());
		}catch(NullPointerException nullpoint){
			System.out.println("no se encontro el color: " + colorName);
		}catch(Exception exception){
			System.out.println(exception.getMessage());
		}
	}
}

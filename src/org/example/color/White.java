package org.example.color;

import java.util.Objects;

import org.example.color.interfaces.Color;

public class White implements Color{
	
	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public String toString() {
		return "Color: " + getName();
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}
	
}

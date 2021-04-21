package com.krith.SpringAOP.model;

import com.krith.SpringAOP.aspect.Loggable;

public class BodyPlate {

	private String color;

	public String getColor() {
		return color;
	}

	@Loggable
	public void setColor(String color) {
		this.color = color;
		//throw(new RuntimeException());
	}
}

package com.krith.SpringAOP;

import com.krith.SpringAOP.model.BodyPlate;
import com.krith.SpringAOP.model.Tyre;

public class CarPartsProvider {
	
	private Tyre tyre;
	private BodyPlate bodyplate;
	
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public BodyPlate getBodyplate() {
		return bodyplate;
	}
	public void setBodyplate(BodyPlate bodyplate) {
		this.bodyplate = bodyplate;
	}

}
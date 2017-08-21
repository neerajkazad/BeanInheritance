package com.bi.beans;

public class Car {
	private int id;
	private String model;
	private String manufecture;
	private String color;
	private String fuelType;

	
	
	





	public Car(int id, String model, String manufecture, String color,
			String fuelType) {
		this.id = id;
		this.model = model;
		this.manufecture = manufecture;
		this.color = color;
		this.fuelType = fuelType;
	}



	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Id: "+id);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
		System.out.println("Model: "+model);
	}

	public String getManufecture() {
		return manufecture;
	}

	public void setManufecture(String manufecture) {
		this.manufecture = manufecture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}*/

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", manufecture="
				+ manufecture + ", color=" + color + ", fuelType=" + fuelType
				+ "]";
	}

	

}

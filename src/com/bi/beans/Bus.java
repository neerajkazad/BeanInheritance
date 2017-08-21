package com.bi.beans;

public class Bus {
	private int id;
	private String model;
	private String manufecture;
	private String color;

	private int capacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", model=" + model + ", manufecture="
				+ manufecture + ", color=" + color + " capacity=" + capacity + "]";
	}

}

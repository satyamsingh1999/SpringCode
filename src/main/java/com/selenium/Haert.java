package com.selenium;

public class Haert {

	private int noOfHeart;
	private String nameOfAnimal;

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public void pump() {
		System.out.println("your heart is pumping ");
		System.out.println("Alive");
	}
}

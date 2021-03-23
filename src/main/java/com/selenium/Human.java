package com.selenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("octopusheart")
	private Haert heart;
	
	
	public void pumping(){
		if(heart!=null){
		heart.pump();
		}
		else{
			System.out.println("you are dead");
		}
		System.out.println("Name of Aminal :"+ heart.getNameOfAnimal());
		System.out.println("Number of Heart :" + heart.getNoOfHeart());
	}
}

package com.example.lab1;

public class Fruit {
	
	int no;
	String name;
	int price;
	
	public Fruit(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		no=i;
		name=string;
		price=j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruit [no=" + no + ", name= " + name + ", price= " + price + "]";
	}
	
}

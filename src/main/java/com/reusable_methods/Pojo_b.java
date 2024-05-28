package com.reusable_methods;

public class Pojo_b {
	
	
	public static void main(String[] args) {
		
		Pojo_A s = new Pojo_A();
		
		String data = s.getData();
		System.out.println(data);
		
		
		s.setData("gopi");
		String data2 = s.getData();
		System.out.println(data2);
		
		
	}
	
	

}

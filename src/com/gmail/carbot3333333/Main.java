package com.gmail.carbot3333333;

public class Main {

	public static void main(String[] args) {
		Network vodafone = new Network();
		Network life = new Network();
		// TODO Auto-generated method stub
		Phone phone = new Phone(380668705440L);
		phone.regPhone(life);
		
		Phone phone2 = new Phone(380668705400L);
		phone2.regPhone(life);
		
		Phone phone3 = new Phone(380605432440L);
		phone3.regPhone(vodafone);
		
		System.out.println(phone.callNumber(380668705440L));
		System.out.println(phone.callNumber(380608705440L));


	}

}

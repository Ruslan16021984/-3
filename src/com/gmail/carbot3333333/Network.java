package com.gmail.carbot3333333;

public class Network {
	private int nomber;
	private long[] phoneList = new long[100];

	public Network() {
		super();
	}
	public String searchPhone(long nomber) {
		String message = "";
		for(int i =0; i< phoneList.length; i++) {
			if(phoneList[i]== nomber) {
				message = "Вызов пошел";
				break;
			}else {
				message = "номер не найден";
			}
			
		}
		return message;
	}
	public void setPhonelist(long[] number) {
		this.phoneList = phoneList;
	}
	public void registerNumber(long number) {
		for (int i = 0; i < phoneList.length; i++) {
			if(phoneList[i] == 0) {
				phoneList[i] = number;
				break;
			}
		}
	}
	

}

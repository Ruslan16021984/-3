package com.gmail.carbot3333333;

public class Phone {
	private Network net = null;
	private long number;


	
	public Phone(long nomber) {
		super();
		this.number = nomber;
	}


	public void regPhone(Network network) {
		this.net = network;
		net.registerNumber(number);
	}
	public String callNumber(long nomber) {
		return net.searchPhone(nomber);
	}

	public long getNomber() {
		return number;
	}

	public void setNomber(long nomber) {
		this.number = nomber;
	}
}

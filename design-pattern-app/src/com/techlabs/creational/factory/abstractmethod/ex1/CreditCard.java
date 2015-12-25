package com.techlabs.creational.factory.abstractmethod.ex1;

public abstract class CreditCard {

	private int cardNo;

	public int getlength() {
		return new Integer(cardNo).toString().length();
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

}

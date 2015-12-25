package com.techlabs.creational.factory.abstractmethod.ex1;

class AmericanExchangePlatinumValidator implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return card.getlength()>1;
	}

}

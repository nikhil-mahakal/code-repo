package com.techlabs.creational.factory.abstractmethod.ex1;

class VisaGoldValidator implements IValidator{

	@Override
	public boolean validate(CreditCard card) {
		return card.getlength()>0;
	}

}

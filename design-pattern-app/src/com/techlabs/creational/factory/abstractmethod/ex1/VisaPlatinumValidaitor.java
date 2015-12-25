
package com.techlabs.creational.factory.abstractmethod.ex1;

class VisaPlatinumValidaitor implements IValidator {

	@Override
	public boolean validate(CreditCard card) {
		return card.getlength()>0;
	}

}

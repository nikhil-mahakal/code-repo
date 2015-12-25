package com.techlabs.creational.factory.abstractmethod.ex1;

class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case PLATINUM:
			return new VisaPlatinum();

		case GOLD:
			return new VisaGold();

		default:
			return null;
		}
	}

	@Override
	public IValidator getValidator(CardType cardType) {
		switch (cardType) {
		case PLATINUM:
			return new VisaPlatinumValidaitor();

		case GOLD:
			return new VisaGoldValidator();

		default:
			return null;
		}
	}

}

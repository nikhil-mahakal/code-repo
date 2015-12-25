package com.techlabs.creational.factory.abstractmethod.ex1;

class AmericanExchangeFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {

		switch (cardType) {
		case PLATINUM:
			return new AmericanExchangePlatinum();

		case GOLD:
			return new AmericanExchangeGold();

		default:
			return null;
		}

	}

	@Override
	public IValidator getValidator(CardType cardType) {
		switch (cardType) {
		case PLATINUM:
			return new AmericanExchangePlatinumValidator();

		case GOLD:
			return new AmericanExchangeGoldValidator();

		default:
			return null;
		}
	}

}

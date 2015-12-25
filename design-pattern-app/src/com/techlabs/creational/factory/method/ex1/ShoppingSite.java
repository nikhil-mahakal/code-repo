package com.techlabs.creational.factory.method.ex1;

class ShoppingSite extends WebSite{

	@Override
	public void createPges() {

		listPages.add(new ItomPage("Itom Page."));
		listPages.add(new CartPage("Cart page."));
		listPages.add(new PaymentPage("Payment Page."));
	}

}

package com.techlabs.creational.factory.method.ex1;

public enum WebSiteFactory {
	INSTANCE;

	public WebSite createWebSite(WebSiteType siteType) {

		switch (siteType) {
		case BLOG:
			return new BlogSite();

		case SHOPPING:
			return new ShoppingSite();

		default:
			return null;
		}
	}
}

package com.techlabs.creational.factory.method.ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {

	protected List<Page> listPages;

	public WebSite() {
		listPages = new ArrayList<Page>();
		createPges();
	}

	public List<Page> getPages() {
		return listPages;
	}

	public abstract void createPges();
}

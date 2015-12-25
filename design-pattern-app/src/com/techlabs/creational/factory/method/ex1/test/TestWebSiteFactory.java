package com.techlabs.creational.factory.method.ex1.test;

import java.util.List;

import com.techlabs.creational.factory.method.ex1.Page;
import com.techlabs.creational.factory.method.ex1.WebSite;
import com.techlabs.creational.factory.method.ex1.WebSiteFactory;
import com.techlabs.creational.factory.method.ex1.WebSiteType;

public class TestWebSiteFactory {

	public static void main(String[] args) {

		List<Page> list;
		
		System.out.println("--------- Blog Site ---------\n");

		WebSite webSite = WebSiteFactory.INSTANCE
				.createWebSite(WebSiteType.BLOG);
		list = webSite.getPages();
		printPagelist(list);

		System.out.println("\n--------- Shopping Site ---------\n");

		WebSite webSite2 = WebSiteFactory.INSTANCE
				.createWebSite(WebSiteType.SHOPPING);
		list = webSite2.getPages();
		printPagelist(list);

	}

	private static void printPagelist(List<Page> list) {
		for (Page page : list) {
			page.load();
		}
	}

}

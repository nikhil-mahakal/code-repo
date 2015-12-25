package com.techlabs.creational.factory.method.ex1;

class BlogSite extends WebSite{

	@Override
	public void createPges() {

		listPages.add(new FirstBlogPage("Home Page."));
		listPages.add(new CommentPage("Comment's page."));
		listPages.add(new ContactPage("Contact us page."));
		
	}

}

package com.techlabs.structural.adapter.ex1.test;

import com.techlabs.structural.adapter.ex1.newvendor.IDicountable;
import com.techlabs.structural.adapter.ex1.oldvendor.Goods;

public class GoodsAdapter implements IDicountable {

	Goods goods;

	public GoodsAdapter(String name, int quantity, double unitprice) {

		goods = new Goods(name, quantity, unitprice);
	}

	@Override
	public String getDescription() {
		return goods.getName();
	}

	@Override
	public double calculateDiscount() {
		return goods.getDiscount();
	}

}

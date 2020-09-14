package com.saurabh.vendingmachine.factory;

import java.util.List;

import com.saurabh.vendingmachine.Exception.NotAvailableException;
import com.saurabh.vendingmachine.models.Cart;
import com.saurabh.vendingmachine.models.Coin;
import com.saurabh.vendingmachine.models.Item;

public interface VendingMachine {
	public long selectItemAndPrice(Item item) throws NotAvailableException;
    public void payMoney(Coin coin);
    public List<Coin> returnBalance();
    public Cart<Item, List<Coin>> collectItemAndChange();
}

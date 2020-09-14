package com.saurabh.vendingmachine.factory;

import com.saurabh.vendingmachine.factoryImpl.VendingMachineImpl;

public class VendingMachineFactory {
	public static VendingMachine createVendingMachine() {
        return new VendingMachineImpl();
    }
	
}

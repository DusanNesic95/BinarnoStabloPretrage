package com.dusannesic.main;

import com.dusannesic.bst.BinarnoStabloPretrage;

public class Main {

	public static void main(String[] args) {
		BinarnoStabloPretrage stablo = new BinarnoStabloPretrage();
		
		stablo.ubaciElement(2);
		stablo.ubaciElement(5);
		stablo.ubaciElement(18);
		stablo.ubaciElement(1);
		
		stablo.prikaziStablo();
		stablo.prebrojiSamoGrane();
	}
	
}

package com.dusannesic.bst;

import java.util.Stack;

public class BinarnoStabloPretrage {

	private Element koren;

	public BinarnoStabloPretrage() {
		this.koren = null;
	}
	
	public void ubaciElement(int vrednost) {
		Element novi = new Element(vrednost);
		
		if (koren == null) {
			koren = novi;
			return;
		}
		
		Element trenutni = koren;
		Element prethodni = null;
		while (true) {
			prethodni = trenutni;
			if (vrednost < trenutni.getVrednost()) {
				trenutni = trenutni.getLevi();
				if (trenutni == null) {
					prethodni.setLevi(novi);
					return;
				}
			} else {
				trenutni = trenutni.getDesni();
				if (trenutni == null) {
					prethodni.setDesni(novi);
					return;
				}
			}
		}
	}
	
	public void prikaziStablo() {
		prikaziStablo(koren);
	}
	
	private void prikaziStablo(Element koren) {
		if (koren != null) {
			prikaziStablo(koren.getLevi());
			System.out.println("Vrednost: " + koren.getVrednost());
			prikaziStablo(koren.getDesni());
		}
	}
	
	public void prebrojiSamoGrane() {
		int broj = 0;
		
		prebrojiSamoGrane(koren, broj);
		
		System.out.println("Broj samo grana je: " + broj);
	}
	
	private void prebrojiSamoGrane(Element koren, int broj) {
		if (koren != null) {
			if (koren.getLevi() == null && koren.getDesni() == null) {
				broj++;
			} else {
				prebrojiSamoGrane(koren.getLevi(), broj);
				prebrojiSamoGrane(koren.getDesni(), broj);
			}
		}
	}
}

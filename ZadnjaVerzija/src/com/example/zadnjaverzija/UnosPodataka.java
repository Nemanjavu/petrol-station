package com.example.zadnjaverzija;

import java.util.ArrayList;

public class UnosPodataka {

	public static ArrayList<ItemPetrolStation> Items;

	public static void LoadData() {

		Items = new ArrayList<ItemPetrolStation>();
		Items.add(new ItemPetrolStation(1, "ina_logo.png", "INA Mitnica",
				"Adresa: Bana Josipa Jelaèiæa BB","Radno vrijeme: 00:24h", "Telefon: 098988745"));
		Items.add(new ItemPetrolStation(2, "ina_logo.png", "INA Priljevo",
				"Priljevo BB", "00:24", "098988745"));
		Items.add(new ItemPetrolStation(3, "ina_logo.png", "INA Borovo",
				"Blage Zadre BB", "00:24", "098988745"));
		Items.add(new ItemPetrolStation(4, "ina_petrol_logo.png", "INA Petrol",
				"Priljevo BB", "00:24", "098988745"));
		Items.add(new ItemPetrolStation(5, "vuka_logo.png", "Vuka Benz",
				"Kudeljarska 6", "00:24", "098988745"));
		Items.add(new ItemPetrolStation(6, "omv_logo.png", "OMV",
				"Kudeljarska 4B", "00:24", "098988745"));
		Items.add(new ItemPetrolStation(7, "lukoil_logo.png", "Lukoil",
				"Trg Drvena pijaca BB", "00:24", "098988745"));
	}

	public static ItemPetrolStation GetbyId(int id) {

		for (ItemPetrolStation item : Items) {
			if (item.Id == id) {
				return item;
			}
		}
		return null;
	}
}

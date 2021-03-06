package com.example.zadnjaverzija;

import java.util.ArrayList;

public class UnosPodataka {

	public static ArrayList<ItemPetrolStation> Items;

	public static void LoadData() {

		Items = new ArrayList<ItemPetrolStation>();
		Items.add(new ItemPetrolStation(1, "gas_station.png", "INA Mitnica",
				"Adresa: Bana Josipa Jela�i�a BB", "Radno vrijeme: 00:24h",
				"Telefon: 091/497-1308"));
		Items.add(new ItemPetrolStation(2, "gas_station.png", "INA Priljevo",
				"Adresa: Priljevo BB", "Radno vrijeme: 00:24",
				"Telefon: 091/497-1309"));
		Items.add(new ItemPetrolStation(3, "gas_station.png", "INA Borovo",
				"Adresa: Blage Zadre BB", "Radno vrijeme: 00:24",
				"Telefon: 091/497-1293"));
		Items.add(new ItemPetrolStation(4, "gas_station.png", "INA Petrol",
				"Adresa: Kudeljarska 3", "Radno vrijeme: 00:24",
				"Telefon: 032/432-253"));
		Items.add(new ItemPetrolStation(5, "gas_station.png", "Vuka Benz",
				"Adresa: Kudeljarska 6", "Radno vrijeme: 00:24",
				"Telefon: 032/432-864"));
		Items.add(new ItemPetrolStation(6, "gas_station.png", "OMV",
				"Adresa: Kudeljarska 4B", "Radno vrijeme: 00:24",
				"Telefon: 032/432-829"));
		Items.add(new ItemPetrolStation(7, "gas_station.png", "Lukoil",
				"Adresa: Trg Drvena pijaca BB", "Radno vrijeme: 00:24",
				"Telefon: 032/414-769"));
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

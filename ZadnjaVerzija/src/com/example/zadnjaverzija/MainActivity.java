package com.example.zadnjaverzija;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		UnosPodataka.LoadData();
		listView = (ListView) findViewById(R.id.petrol_station_list);
		String[] ids = new String[UnosPodataka.Items.size()];
		for (int i = 0; i < ids.length; i++) {

			ids[i] = Integer.toString(i + 1);
		}

		ItemAdapterPetrolStation adapter = new ItemAdapterPetrolStation(this,
				R.layout.priaz_activity_main, ids);
		listView.setAdapter(adapter);
	}

}

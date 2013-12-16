package com.example.zadnjaverzija;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {

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
		listView.setOnItemClickListener(this);

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int id, long arg3) {

		if (id == 0) {
			AlertDialog.Builder izbornikBenziskeCrpke = new AlertDialog.Builder(
					this);
			izbornikBenziskeCrpke.setTitle("Izbornik");
			String[] name = new String[] { "Nazovite Ina Mitnica",
					"Navigacija", "Izlaz iz izbornika" };
			izbornikBenziskeCrpke.setItems(name, new OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					switch (which) {
					case 0:
						Intent callMitnica = new Intent(Intent.ACTION_CALL);
						callMitnica.setData(Uri.parse("tel:0914971308"));
						startActivity(callMitnica);
						finish();

						break;

					}

					// TODO Auto-generated method stub

				}
			});
			izbornikBenziskeCrpke.show();

		} else if (id == 1) {
			AlertDialog.Builder izbornikBenziskeCrpke = new AlertDialog.Builder(
					this);
			izbornikBenziskeCrpke.setTitle("Izbornik");
			String[] name = new String[] { "Nazovite Ina Priljevo",
					"Navigacija", "Izlaz iz izbornika" };
			izbornikBenziskeCrpke.setItems(name, new OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					switch (which) {
					case 0:
						Intent callPriljevo = new Intent(Intent.ACTION_CALL);
						callPriljevo.setData(Uri.parse("tel:0914971309"));
						startActivity(callPriljevo);
						finish();

						break;

					}

					// TODO Auto-generated method stub

				}
			});
			izbornikBenziskeCrpke.show();

		} else if (id == 2) {
			AlertDialog.Builder izbornikBenziskeCrpke = new AlertDialog.Builder(
					this);
			izbornikBenziskeCrpke.setTitle("Izbornik");
			String[] name = new String[] { "Nazovite INA Borovo", "Navigacija",
					"Izlaz iz izbornika" };
			izbornikBenziskeCrpke.setItems(name, new OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					switch (which) {
					case 0:
						Intent callBorovo = new Intent(Intent.ACTION_CALL);
						callBorovo.setData(Uri.parse("tel:0914971293"));
						startActivity(callBorovo);
						finish();

						break;

					}

					// TODO Auto-generated method stub

				}
			});
			izbornikBenziskeCrpke.show();

		} else if (id == 3) {
			AlertDialog.Builder izbornikBenziskeCrpke = new AlertDialog.Builder(
					this);
			izbornikBenziskeCrpke.setTitle("Izbornik");
			String[] name = new String[] { "Nazovite Ina Petrol", "Navigacija",
					"Izlaz iz izbornika" };
			izbornikBenziskeCrpke.setItems(name, new OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					switch (which) {
					case 0:
						Intent callPetrol = new Intent(Intent.ACTION_CALL);
						callPetrol.setData(Uri.parse("tel:032432253"));
						startActivity(callPetrol);
						finish();

						break;

					}

					// TODO Auto-generated method stub

				}
			});
			izbornikBenziskeCrpke.show();

		} else if (id == 4) {
			AlertDialog.Builder izbornikBenziskeCrpke = new AlertDialog.Builder(
					this);
			izbornikBenziskeCrpke.setTitle("Izbornik");
			String[] name = new String[] { "Nazovite Vuka Benz", "Navigacija",
					"Izlaz iz izbornika" };
			izbornikBenziskeCrpke.setItems(name, new OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					switch (which) {
					case 0:
						Intent callVukaBenz = new Intent(Intent.ACTION_CALL);
						callVukaBenz.setData(Uri.parse("tel:032432864"));
						startActivity(callVukaBenz);
						finish();

						break;

					}

					// TODO Auto-generated method stub

				}
			});
			izbornikBenziskeCrpke.show();

		} else if (id == 5) {
			AlertDialog.Builder izbornikBenziskeCrpke = new AlertDialog.Builder(
					this);
			izbornikBenziskeCrpke.setTitle("Izbornik");
			String[] name = new String[] { "Nazovite OMV", "Navigacija",
					"Izlaz iz izbornika" };
			izbornikBenziskeCrpke.setItems(name, new OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					switch (which) {
					case 0:
						Intent callOMV = new Intent(Intent.ACTION_CALL);
						callOMV.setData(Uri.parse("tel:032432829"));
						startActivity(callOMV);
						finish();

						break;

					}

					// TODO Auto-generated method stub

				}
			});
			izbornikBenziskeCrpke.show();

		} else if (id == 6) {
			AlertDialog.Builder izbornikBenziskeCrpke = new AlertDialog.Builder(
					this);
			izbornikBenziskeCrpke.setTitle("Izbornik");
			String[] name = new String[] { "Nazovite Lukoil", "Navigacija",
					"Izlaz iz izbornika" };
			izbornikBenziskeCrpke.setItems(name, new OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					switch (which) {
					case 0:
						Intent callLukoil = new Intent(Intent.ACTION_CALL);
						callLukoil.setData(Uri.parse("tel:032414769"));
						startActivity(callLukoil);
						finish();

						break;

					}

					// TODO Auto-generated method stub

				}
			});
			izbornikBenziskeCrpke.show();

		}
		// TODO Auto-generated method stub

	}

}

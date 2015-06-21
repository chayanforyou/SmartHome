package com.home.automation;

import java.util.Set;

import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListDivices extends ListActivity {
	BluetoothAdapter myBluetooth;
	static String MAC_ADDRESS = null;
	String name;
	String list[];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ArrayAdapter<String> ArrayBluetooth = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1);

		myBluetooth = BluetoothAdapter.getDefaultAdapter();

		Set<BluetoothDevice> pairedDevices = myBluetooth.getBondedDevices();
		if (pairedDevices.size() > 0) {
			for (BluetoothDevice paired : pairedDevices) {
				name = paired.getName();
				// String mac = paired.getAddress();
				ArrayBluetooth.add(name);
			}
		}
		setListAdapter(ArrayBluetooth);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String infoGeneral = ((TextView) v).getText().toString();
		// String address = infoGeneral.substring(infoGeneral.length());
		Intent returnMac = new Intent();
		returnMac.putExtra("name", infoGeneral);
		setResult(RESULT_OK, returnMac);
		finish();

	}
}

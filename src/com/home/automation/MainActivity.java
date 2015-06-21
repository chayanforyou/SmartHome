package com.home.automation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	BluetoothAdapter mBluetoothAdapter;
	BluetoothSocket mmSocket;
	BluetoothDevice mmDevice;
	OutputStream mmOutputStream;
	InputStream mmInputStream;
	Editable nameb;
	String blname;
	int stat;
	final int APPLY_ACTIVE = 1;
	final int APPLY_CONNECTION = 2;
	String DEVICE = null;
	EditText name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_main);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
				R.layout.actionbar);
		name = (EditText) (findViewById(R.id.bluetoothName));
		Button ok = (Button) (findViewById(R.id.button1));
		Button connect = (Button) findViewById(R.id.button2);

		ok.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openList = new Intent(MainActivity.this,
						ListDivices.class);
				startActivityForResult(openList, APPLY_CONNECTION);
			}
		});
		connect.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nameb = name.getText();
				blname = nameb.toString();
				try {
					findBT();
					stat = 1;
				} catch (IOException e) {
					stat = 0;
					e.printStackTrace();
				}

			}
		});

		final ToggleButton fan = (ToggleButton) findViewById(R.id.toggleButton1);
		fan.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (fan.isChecked()) {
					if (stat == 1) {
						try {
							mmOutputStream.write('1');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				} else {
					if (stat == 1) {
						try {
							mmOutputStream.write('2');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton light1 = (ToggleButton) findViewById(R.id.toggleButton2);
		light1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (light1.isChecked()) {
					if (stat == 1) {
						try {
							mmOutputStream.write('3');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				} else {
					if (stat == 1) {
						try {
							mmOutputStream.write('4');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton light2 = (ToggleButton) findViewById(R.id.toggleButton3);
		light2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (light2.isChecked()) {
					if (stat == 1) {
						try {
							mmOutputStream.write('5');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				} else {
					if (stat == 1) {
						try {
							mmOutputStream.write('6');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton light3 = (ToggleButton) findViewById(R.id.toggleButton4);
		light3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (light3.isChecked()) {
					if (stat == 1) {
						try {
							mmOutputStream.write('7');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				} else {
					if (stat == 1) {
						try {
							mmOutputStream.write('8');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton tv = (ToggleButton) findViewById(R.id.toggleButton5);
		tv.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.isChecked()) {
					if (stat == 1) {
						try {
							mmOutputStream.write('9');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				} else {
					if (stat == 1) {
						try {
							mmOutputStream.write('0');
						} catch (IOException e) {
							// TODO Auto-generated catch block
							Toast.makeText(
									MainActivity.this,
									"Connection not established with your home",
									Toast.LENGTH_SHORT).show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(MainActivity.this,
								"Connection not established with your home",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

	}

	void findBT() throws IOException {
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		// if(mBluetoothAdapter == null)
		// {
		// myLabel.setText("No bluetooth adapter available");
		// }

		if (!mBluetoothAdapter.isEnabled()) {
			Intent enableBluetooth = new Intent(
					BluetoothAdapter.ACTION_REQUEST_ENABLE);
			startActivityForResult(enableBluetooth, 1);

		}

		Set<BluetoothDevice> pairedDevices = mBluetoothAdapter
				.getBondedDevices();
		if (pairedDevices.size() > 0) {
			for (BluetoothDevice device : pairedDevices) {
				if (device.getName().equals(blname))
				// FireFly-B1A7Change to the name of your bluetooth module (Case
				// sensitive)
				{
					mmDevice = device;
					break;
				}
			}
		}
		// myLabel.setText("Bluetooth Device Found");

		UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb"); // Standard
																				// //SerialPortService
																				// ID

		mmSocket = mmDevice.createRfcommSocketToServiceRecord(uuid);

		mmSocket.connect();
		mmOutputStream = mmSocket.getOutputStream();
		mmInputStream = mmSocket.getInputStream();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);

		switch (item.getItemId()) { // Get id from R.java file
		case R.id.action_about:
			startActivity(new Intent(this, About.class));
			break;
		}
		return true;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case APPLY_ACTIVE:
			if (resultCode == Activity.RESULT_OK) {
				Toast.makeText(getApplicationContext(),
						"Bluetooth is activated", Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),
						"Bluetooth is not activated", Toast.LENGTH_SHORT)
						.show();
				finish();
			}
			break;
		case APPLY_CONNECTION:
			if (resultCode == Activity.RESULT_OK) {
				DEVICE = data.getExtras().getString("name");
				Toast.makeText(getApplicationContext(),
						"Device " + DEVICE + " is selected", Toast.LENGTH_SHORT)
						.show();
				name.setText(DEVICE);
			} else {
				Toast.makeText(getApplicationContext(),
						"Please pair your device & select it",
						Toast.LENGTH_SHORT).show();
			}

		default:
			break;
		}
	}
}

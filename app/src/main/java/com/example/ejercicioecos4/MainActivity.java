package com.example.ejercicioecos4;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText ipInput4;
    private TextView textoIp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ipInput4 = findViewById(R.id.ipInput4);
        textoIp = findViewById(R.id.textoIp);


        /*String ipAddress = Formatter.formatIpAddress(this);
        textoIp.setText(ipAddress);*/



    }

    public static String formatIpAdress(int ip){
        return String.format(Locale.US,"%d.%d.%d.%d", (ip & 0xff),(ip >> 8 & 0xff),(ip >> 16 & 0xff), (ip >> 24 & 0xff));
    }
}
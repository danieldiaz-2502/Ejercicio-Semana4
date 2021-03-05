package com.example.ejercicioecos4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class mensajesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes);

        new Thread(
                () ->{
                    String base = "192.168.0.";
                    for(int i = 1; i<255 ; i++){
                        String ip = base + 1;
                        System.out.println(ip);
                        try {
                            InetAddress inet = InetAddress.getByName(ip);
                            boolean conectado = inet.isReachable(5000);
                            if (conectado){
                                System.out.println(ip);
                            }
                        } catch (UnknownHostException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    };
                }
        );

    }
}
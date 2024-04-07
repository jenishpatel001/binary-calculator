 package com.example.binarycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    TextView tx1, tx2, tx3;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ed1 = findViewById( R.id.ed1 );
        tx1 = findViewById( R.id.tx1 );
        tx2 = findViewById( R.id.tx2 );
        tx3 = findViewById( R.id.tx3 );
        b1 = findViewById( R.id.b1 );
        b2 = findViewById( R.id.b2 );

        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = ed1.getText().toString();
                int i = Integer.parseInt( string );

                String binary = Integer.toBinaryString( i );
                String octal = Integer.toOctalString( i );
                String hex = Integer.toHexString( i );


                tx1.setText( " binary :" + binary );
                tx2.setText( " octal :" + octal );
                tx3.setText( " hex :" + hex );

            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText( "" );
                tx2.setText( "" );
                tx3.setText( "" );
                ed1.setText( "" );
            }
        } );
    }
}
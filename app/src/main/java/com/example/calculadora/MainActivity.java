package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    int tempNumber ;
    List<Integer> listNumbers=new ArrayList<Integer>();
    TextView txtViewHistory;
    EditText txtEditValues;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnEqual;
    Button btnErase;
    Button btnDelete;
    Button btnSum;
    Button btnRes;
    Button btnDiv;
    Button btnMult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tempNumber = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindingComponents();
        Listeners();

    }

private void Listeners(){
    btn0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(0);
            }catch ( Exception f){
                Toast.makeText(MainActivity.this, f.getMessage().toString(), Toast.LENGTH_LONG).show();
            }

        }
    });
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(1);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(2);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(3);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(4);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(5);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(6);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(7);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(8);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btn9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                SetValue(9);
            }catch (Exception f){
                Toast.makeText(MainActivity.this, "Error:" + f.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    });
    btnDelete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tempNumber = 0;
            txtEditValues.setText(String.valueOf(0));
            txtViewHistory.setText(String.valueOf(0));
        }
    });
    btnErase.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{
                String value = String.valueOf(tempNumber);
                if(value.length()!=0){
                    value = value.substring(0,value.length()-1);
                }else{
                    value= String.valueOf(0);
                }
                tempNumber = Integer.parseInt(value.toString());
                txtEditValues.setText( String.valueOf(tempNumber));
            }catch (Exception f){
                tempNumber = 0;
                txtEditValues.setText( String.valueOf(0));
            }
        }
    });
}

    private void SetValue(int number){
        String valueTmp = String.valueOf(tempNumber) + number ;
        //Toast.makeText(MainActivity.this, "Valor: " + valueTmp, Toast.LENGTH_LONG).show();
        tempNumber = Integer.parseInt(valueTmp.toString());
        txtEditValues.setText( String.valueOf(tempNumber));
    }

    private void BindingComponents(){
        txtEditValues = findViewById(R.id.editTextNumberDecimal);
        txtViewHistory = findViewById(R.id.textViewHistory);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSum = findViewById(R.id.btnSum);
        btnRes = findViewById(R.id.btnRest);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMultp);
        btnErase = findViewById(R.id.btnErase);
        btnEqual = findViewById(R.id.btnEqual);
        btnDelete = findViewById(R.id.btnDelete);
    }
}
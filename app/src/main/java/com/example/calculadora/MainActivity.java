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
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    int tempNumber ;
    float Result;
    List<Float> listNumbers=new ArrayList<Float>();
    List<String> listOperations=new ArrayList<String>();
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
                listNumbers.clear();
                listOperations.clear();
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
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    SetOperation("+");
                }catch (Exception ErrorM){
                    Toast.makeText(MainActivity.this, "Error: " + ErrorM.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    SetOperation("-");
                }catch (Exception ErrorM){
                    Toast.makeText(MainActivity.this, "Error: " + ErrorM.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    SetOperation("*");
                }catch (Exception ErrorM){
                    Toast.makeText(MainActivity.this, "Error: " + ErrorM.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    SetOperation("/");
                }catch (Exception f){
                    Toast.makeText(MainActivity.this, "Error: " + f.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value = Float.parseFloat( txtEditValues.getText().toString());
                if(listOperations.size() == listNumbers.size()-1){
                    float Result = SolvingOperations();
                    txtEditValues.setText(String.valueOf(Result));
                }else if( (listOperations.size() != listNumbers.size()-1) && (value!=0) ){
                    listNumbers.add(value);
                    txtViewHistory.setText(txtViewHistory.getText()+ String.valueOf(value)); ;float Result = SolvingOperations();
                    txtEditValues.setText(String.valueOf(Result));
                }else{
                    Toast.makeText(MainActivity.this, "ingrese un digito" , Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tempNumber = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindingComponents();
        Listeners();

    }
    private void SetValue(int number){

        String valueTmp = String.valueOf(tempNumber) + number ;
        tempNumber = Integer.parseInt(valueTmp.toString());
        txtEditValues.setText( String.valueOf(tempNumber));
    }
    private void SetOperation(String sign){
        try{
            if(tempNumber!=0){
                listNumbers.add(Float.parseFloat(String.valueOf(tempNumber)));
                listOperations.add(sign);
                String text = "";
                for ( int i=0; i< listNumbers.size(); i++){
                    if(i== 0){
                        text =  listNumbers.get(i).toString() + sign;
                    }else{
                        text = txtViewHistory.getText() +  listNumbers.get(i).toString() + sign;
                    }
                }
                txtViewHistory.setText(text);
                txtEditValues.setText("");
                tempNumber = 0;
            }else{
                Toast.makeText(MainActivity.this, "El valor no puede ser 0" , Toast.LENGTH_LONG).show();
            }
        }catch (Exception jl){
            Toast.makeText(MainActivity.this, "Error: "+ jl.getMessage() , Toast.LENGTH_LONG).show();
        }
    }
    private float SolvingOperations(){
        try{
            float NumberA= 0;
            float NumberB= 0;
            float TemporalResult = 0;
            int Counter = 0;
            do{
                if(listOperations.size()!=0){
                    String operation=listOperations.get(Counter);
                    if(listOperations.contains("*") || listOperations.contains("/")){
                        if(operation.equals("*") ||operation.equals("/") ){
                            if(Counter == 0){
                                NumberA = listNumbers.get(0);
                                NumberB = listNumbers.get(1);
                                TemporalResult = Result(NumberA,NumberB,operation);
                                ReplaceListArray(0,0,1,TemporalResult);
                            }else{
                                NumberA = listNumbers.get(Counter);
                                NumberB = listNumbers.get(Counter+1);
                                TemporalResult = Result(NumberA,NumberB,operation);
                                ReplaceListArray(Counter,Counter,Counter+1,TemporalResult);
                            }
                        }
                    }else if( operation.equals("+") ||operation.equals("-") ){
                        if(Counter == 0){
                            NumberA = listNumbers.get(0);
                            NumberB = listNumbers.get(1);
                            TemporalResult = Result(NumberA,NumberB,operation);
                            ReplaceListArray(0,0,1,TemporalResult);
                        }else{
                            NumberA = listNumbers.get(Counter);
                            NumberB = listNumbers.get(Counter+1);
                            TemporalResult = Result(NumberA,NumberB,operation);
                            ReplaceListArray(Counter,Counter,Counter+1,TemporalResult);
                        }
                    }
                }else{
                    float ValueToReturn = listNumbers.get(0);
                    return ValueToReturn;
                }
            }while (true);
        }catch (Exception f){
            Toast.makeText(MainActivity.this, "SolvingOperations Error: "+ f.getMessage() , Toast.LENGTH_LONG).show();
            return 0;
        }
    }
    private void ReplaceListArray( int OperationPosition, int NumberAPosition, int NumberBPosition, float ValueToSet ){
       try{
           // Operations
           if(listOperations.size()>1){
               listOperations.remove(OperationPosition);
           }else{
               listOperations.clear();
           }
           listNumbers.set(NumberAPosition,ValueToSet);
           listNumbers.remove(NumberBPosition);
       }catch (Exception f){
           Toast.makeText(MainActivity.this, "ReplaceListArray Error: "+ f.getMessage() , Toast.LENGTH_LONG).show();
       }
    }

    private float Result(float NumberA,float NumberB,String Operation){
        try{
            switch (Operation){
                case "+":
                    return NumberA + NumberB;
                case "-":
                    return NumberA - NumberB;
                case "*":
                    return NumberA * NumberB;
                case "/":
                    return NumberA / NumberB;
                default:
                    return 0;
            }
        }catch (Exception V){
            Toast.makeText(MainActivity.this, "Result Error: "+ V.getMessage() , Toast.LENGTH_LONG).show();
            return 0;
        }
    }
}
package com.meterstoinches.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes,no,neutral,result;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes =(Button) findViewById(R.id.yesbtn);
        no=(Button) findViewById(R.id.nobtn);
        neutral=(Button) findViewById(R.id.neutralbtn);
        result=(Button) findViewById(R.id.resultbtn);


    }

    public void yesMethod(View view) {
        count+=1;

    }

    public void noMethod(View view) {
        count-=1;

    }

    public void neutralMethod(View view) {

    }

    public void resultMethod(View view) {
        if(count>0){
            Toast.makeText(MainActivity.this,"Insta is good",Toast.LENGTH_LONG).show();
        }else if(count<0){
            Toast.makeText(MainActivity.this,"Insta is not good",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this,"Insta is neither good nor bad",Toast.LENGTH_LONG).show();
        }
    }
}

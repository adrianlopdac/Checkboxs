package com.example.adrian.checkboxs;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    CheckBox colorFondoCB;
    CheckBox colorLetraCB;
    RelativeLayout miLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miLayout=(RelativeLayout)findViewById(R.id.miLayout);
        colorFondoCB=(CheckBox)findViewById(R.id.checkBoxFondo);
        colorLetraCB=(CheckBox)findViewById(R.id.checkBoxColor);

        colorFondoCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    miLayout.setBackgroundColor(Color.CYAN);
                }
                else{
                    miLayout.setBackgroundColor(Color.WHITE);
                }
            }
        });

        colorLetraCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    colorFondoCB.setTextColor(Color.RED);
                    colorLetraCB.setTextColor(Color.RED);
                }else{
                    colorFondoCB.setTextColor(Color.BLACK);
                    colorLetraCB.setTextColor(Color.BLACK);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

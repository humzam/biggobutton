package edu.washington.humzam.biggobutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button pushButton;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;

        pushButton = (Button) findViewById(R.id.btn_push);
        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pushButton.getText().equals("Push Me!")) {
                    count++;
                    pushButton.setText("You have pushed me " + count + " times!");
                } else {
                    count++;
                    pushButton.setText("You have pushed me " + count + " times!");
                }
            }
        });
    }
}
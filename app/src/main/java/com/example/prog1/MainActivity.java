package com.example.prog1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.savebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.edittext);
                String text = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Saving", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Text",text);
                startActivity(intent);
            }
        });
    }
}
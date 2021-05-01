
package com.example.programowanie_apl_multimedialnych;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecoundActivity extends AppCompatActivity {
public static final String KEY_TEXT = "key_text" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        Bundle b = getIntent().getExtras();
        String txt = b.getString(KEY_TEXT,"");
        TextView text = findViewById(R.id.textView);
        text.setText(txt);
    }
}
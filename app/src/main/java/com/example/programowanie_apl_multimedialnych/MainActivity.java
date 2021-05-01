package com.example.programowanie_apl_multimedialnych;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    boolean isScndFragment =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getFragmentManager().beginTransaction()
//                .add(R.id.fragment_container, new FirstFragment())
//                .commit();

    }

    public void onClickBtn(View view) {
//        Intent i = new Intent(this,SecoundActivity.class);
//
//        EditText editText = findViewById(R.id.edit_text);
//        String txt = String.valueOf(editText.getText());
//        i.putExtra(SecoundActivity.KEY_TEXT,txt);
//
//        startActivity(i);
    }

    public void onClickBtnChange(View view) {
//        if(isScndFragment) {
//            getFragmentManager().beginTransaction().replace(R.id.fragment_container, new SecoundFragment()).commit();
//        }
//        else {
//            getFragmentManager().beginTransaction().replace(R.id.fragment_container, new FirstFragment()).commit();
//        }
//        isScndFragment = !isScndFragment;
    }

    // go to activity1 RunActivity
    public void onClickBtnAct1(View view) {
        Intent i = new Intent(this,RunActivity.class);
        startActivity(i);
    }

    public void onClickBtnAct2(View view) {
        Intent i = new Intent(this,HistoryActivity.class);
        startActivity(i);
    }
}
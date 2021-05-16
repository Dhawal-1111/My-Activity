package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.e(TAG, "onClick: " + mTextView.getText().toString());
               Toast.makeText(MainActivity.this,"Button Pressed!",Toast.LENGTH_SHORT).show();

            }
        });

    }
}

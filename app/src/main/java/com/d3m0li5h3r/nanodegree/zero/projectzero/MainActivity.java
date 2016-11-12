package com.d3m0li5h3r.nanodegree.zero.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String message;

            int id = view.getId();
            switch (id) {
                case R.id.button_movies:
                    message = String.format(getString(R.string.launch_message),
                            getString(R.string.movies));
                    break;
                case R.id.button_stock:
                    message = String.format(getString(R.string.launch_message),
                            getString(R.string.stock));
                    break;
                case R.id.button_build_bigger:
                    message = String.format(getString(R.string.launch_message),
                            getString(R.string.build_bigger));
                    break;
                case R.id.button_material:
                    message = String.format(getString(R.string.launch_message),
                            getString(R.string.material));
                    break;
                case R.id.button_ubiquitous:
                    message = String.format(getString(R.string.launch_message),
                            getString(R.string.ubiquitous));
                    break;
                case R.id.button_capstone:
                    message = String.format(getString(R.string.launch_message),
                            getString(R.string.capstone));
                    break;
                default:
                    message = null;
            }

            if (!TextUtils.isEmpty(message))
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_movies).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_stock).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_build_bigger).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_material).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_ubiquitous).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_capstone).setOnClickListener(buttonClickListener);
    }
}

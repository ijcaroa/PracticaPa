package com.example.practicapa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.practicapa.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IViewPresenter {
    private ActivityMainBinding mBinding;
    private PassPresenter presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        presentador = new PassPresenter(this);
        mBinding.editTextTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentador.verificadorPassword(s.toString());


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void showPass(String color, String condition) {
        mBinding.textViewWelcome.setBackgroundColor(Color.parseColor(color));
        mBinding.textViewWelcome.setText(condition);
    }
}
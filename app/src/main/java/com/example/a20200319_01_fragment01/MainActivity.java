package com.example.a20200319_01_fragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.a20200319_01_fragment01.databinding.ActivityMainBinding;

import com.example.a20200319_01_fragment01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        binding.firstFragCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                첫 프래그먼트 호출 버튼이 눌리면?
//                firstFrag 보이게
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                secondFrag 숨김.
                binding.secondFragLayout.setVisibility(View.GONE);
            }
        });

        binding.secondFragCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.firstFragLayout.setVisibility(View.GONE);

                binding.secondFragLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void setValues() {

    }
}

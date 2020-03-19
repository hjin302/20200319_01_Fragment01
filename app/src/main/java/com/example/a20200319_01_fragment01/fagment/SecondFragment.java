package com.example.a20200319_01_fragment01.fagment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.a20200319_01_fragment01.R;
import com.example.a20200319_01_fragment01.databinding.FragmentSecondBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding.loginToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.idEdt.getText().toString();
                String phone = binding.passwordEdt.getText().toString();

                Toast.makeText(getActivity(), String.format("%s : %s", name, phone), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import androidx.navigation.fragment.NavHostFragment;

import com.example.firstproject.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }




    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    //Кнопка для перехода на 1 уровень начало

    //TextView textView1 = (TextView) textView1.findViewById();
   // textView1.setOnClickListener(new View.OnClickListener()
   //     @Override
   //     public void onClick(View v) {
   //         try{
    //            Intent intent = new Intent(SecondFragment.this, GameLevels.class);
    //            startActivity(intent); finish();
   //         } catch (Expection e) {

   //         }
   //     }
   //Кнопка для перехода на 1 уровень конец

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
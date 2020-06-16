package com.example.myapplication20200614;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_to_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                EditText amoutTV = (EditText)(view.findViewById(R.id.edit_number)); //←ここの view はクリックされた view
                EditText amoutTV = (EditText)(getView().findViewById(R.id.edit_number)); //Get the root view for the fragment's layou
                if(!amoutTV.getText().toString().isEmpty()) {
                    int amout = Integer.parseInt(amoutTV.getText().toString());

                    FirstFragmentDirections.ActionFirstFragmentToSecondFragment action =
                            FirstFragmentDirections.actionFirstFragmentToSecondFragment(amout);

                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(action);
                }
                else{
                    Toast.makeText(getActivity().getApplicationContext(),"値を入力して下さい！",Toast.LENGTH_LONG).show();
                }
            }
        });

        view.findViewById(R.id.button_to_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_thirdFragment6);
            }
        });
    }
//    button_to_third

    public int sum(int a, int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
}
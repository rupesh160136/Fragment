package Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btnCalculate;
    private EditText etone,ettwo;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first2, container, false);

        etone = view.findViewById(R.id.etfirst);
        ettwo = view.findViewById(R.id.etsecond);
        btnCalculate = view.findViewById(R.id.btncalc);
        btnCalculate.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
       int first = Integer.parseInt(etone.getText().toString());
       int second = Integer.parseInt(ettwo.getText().toString());

       int result = first + second;
        Toast.makeText(getActivity(),"sum is" + result, Toast.LENGTH_LONG).show();

    }
}

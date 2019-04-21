package Fragments;


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
public class SecondFragment extends Fragment implements View.OnClickListener {
    private EditText etRadius;
    private Button btnareacalc;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        btnareacalc= view.findViewById(R.id.btnarea);
        etRadius= view.findViewById(R.id.etradius);
        return view;

    }

    @Override
    public void onClick(View v) {
        float radius= Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f *radius*radius;

        Toast.makeText(getActivity(),"area of circle is: " + area, Toast.LENGTH_LONG ).show();

    }
}

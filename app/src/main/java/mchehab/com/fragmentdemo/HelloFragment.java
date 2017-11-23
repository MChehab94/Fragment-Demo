package mchehab.com.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class HelloFragment extends Fragment {

    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextDetails;

    public HelloFragment() {
        // Required empty public constructor
    }

    public static HelloFragment newInstance(String param1, String param2) {
        return new HelloFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hello, container, false);
        editTextFirstName = view.findViewById(R.id.editTextFirstName);
        editTextLastName = view.findViewById(R.id.editTextLastName);
        editTextDetails = view.findViewById(R.id.editTextDetails);
        return view;
    }
}
package mchehab.com.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class HelloFragment extends Fragment {

    private EditText editText;
    private Button button;

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
        editText = view.findViewById(R.id.editText);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(e-> {
            new AlertDialog.Builder(getActivity())
                    .setTitle("Click Detected")
                    .setMessage(editText.getText().toString())
                    .setPositiveButton("Dismiss", null)
                    .create()
                    .show();
        });
        return view;
    }
}
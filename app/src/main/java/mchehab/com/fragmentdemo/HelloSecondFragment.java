package mchehab.com.fragmentdemo;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class HelloSecondFragment extends Fragment {

    private EditText editTextOrder;
    private EditText editTextTime;

    public HelloSecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hello_second, container, false);
        editTextOrder = view.findViewById(R.id.editTextOrder);
        editTextTime = view.findViewById(R.id.editTextTime);
        setupEditTextTime();
        return view;
    }

    private void setupEditTextTime(){
        editTextTime.setInputType(InputType.TYPE_NULL);
        editTextTime.setOnClickListener(e -> {
            new TimePickerDialog(getActivity(), (view, hourOfDay, minute) -> {
                editTextTime.setText(hourOfDay + ":" + minute);
            }, 0, 0, true).show();
        });
    }

}
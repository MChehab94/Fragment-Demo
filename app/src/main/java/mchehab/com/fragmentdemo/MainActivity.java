package mchehab.com.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private HelloFragment helloFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloFragment = new HelloFragment();
        getFragmentManager().beginTransaction().add(R.id.frameLayout, helloFragment).commit();
    }
}
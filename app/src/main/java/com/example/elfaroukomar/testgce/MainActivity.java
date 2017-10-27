package com.example.elfaroukomar.testgce;

import android.content.Context;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.elfaroukomar.builditbigger.free.BlankFragment;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().
                add(R.id.containt,new BlankFragment()).commit();

    }

    public void tell(View view) {
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this,"alfarouk"));
    }
}

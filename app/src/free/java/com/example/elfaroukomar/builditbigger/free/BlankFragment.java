package com.example.elfaroukomar.builditbigger.free;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elfaroukomar.testgce.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

      View root = inflater.inflate(R.layout.fragment_blank, container, false);
        AdView mAdView = (AdView) root.findViewById(R.id.adView);
         AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        return root;

    }

}

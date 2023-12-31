package com.tommyhumaxcar.smarthome;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LightIntensity extends Fragment {

//    // TO DO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TO DO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    private static LightIntensity mInstance = null;

    private LightIntensity() {}

    public static LightIntensity getInstance() {
        if (mInstance == null) {
            mInstance = new LightIntensity();
        }
        return mInstance;
    }

//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment LightIntensity.
//     */
//    // TO DO: Rename and change types and number of parameters
//    public static LightIntensity newInstance(String param1, String param2) {
//        LightIntensity fragment = new LightIntensity();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_light_intensity, container, false);
    }
}
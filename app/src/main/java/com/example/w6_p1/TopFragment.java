package com.example.w6_p1;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class TopFragment extends Fragment implements AdapterView.OnItemClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public interface OnDataPass {
        void onDataPass(String data);
    }
    OnDataPass dataPasser;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String [] animals;
    private ListView listView;
    public TopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TopFragment newInstance(String param1, String param2) {
        TopFragment fragment = new TopFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        dataPasser = (OnDataPass) context;
    }
    public void passData(String data) {
        dataPasser.onDataPass(data);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
    private void displayList(ArrayList<ClipData.Item> items) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_top, container, false);
        animals = new String[] {"dog","cat","cow","lion","wolf"};
        listView = contentView.findViewById(R.id.animalList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1, animals);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        return contentView;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        if (i == 0){
            Toast.makeText(getActivity(),"dog", Toast.LENGTH_SHORT).show();
            passData("dog");
        }
        if (i == 1){
            Toast.makeText(getActivity(),"cat", Toast.LENGTH_SHORT).show();
            passData("cat");
        }
        if (i == 2){
            Toast.makeText(getActivity(),"cow", Toast.LENGTH_SHORT).show();
            passData("cow");
        }
        if (i == 3){
            Toast.makeText(getActivity(),"lion", Toast.LENGTH_SHORT).show();
            passData("lion");
        }
        if (i == 4){
            Toast.makeText(getActivity(),"wolf", Toast.LENGTH_SHORT).show();
            passData("wolf");
        }
    }
}
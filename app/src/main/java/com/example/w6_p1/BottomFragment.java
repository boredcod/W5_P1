package com.example.w6_p1;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BottomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    MediaPlayer animal_sound;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView img;
    private String id;
    private TextView title;
    public BottomFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BottomFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BottomFragment newInstance(String param1, String param2) {
        BottomFragment fragment = new BottomFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (container != null) {
            container.removeAllViews();
        }
        View v = inflater.inflate(R.layout.fragment_bottom, container, false);
        img = v.findViewById(R.id.imageView);
        title = v.findViewById(R.id.title);


        if (this.getArguments() == null){
            id = "dog";
        }else {
            id=this.getArguments().getString("animal");
        }
        switch(id){
            case "dog":
                img.setImageResource(R.drawable.dog);
                title.setText("dog");
                animal_sound = MediaPlayer.create(getContext(), R.raw.dog);
                animal_sound.start();
                break;
            case "cat":
                img.setImageResource(R.drawable.cat);
                title.setText("cat");
                animal_sound = MediaPlayer.create(getContext(), R.raw.cat);
                animal_sound.start();
                break;
            case "lion":
                img.setImageResource(R.drawable.lion);
                title.setText("lion");
                animal_sound = MediaPlayer.create(getContext(), R.raw.lion);
                animal_sound.start();
                break;
            case "wolf":
                img.setImageResource(R.drawable.wolf);
                title.setText("wolf");
                animal_sound = MediaPlayer.create(getContext(), R.raw.wolf);
                animal_sound.start();
                break;
            case "cow":
                img.setImageResource(R.drawable.cow);
                title.setText("cow");
                animal_sound = MediaPlayer.create(getContext(), R.raw.cow);
                animal_sound.start();
                break;
            default:
                img.setImageResource(R.drawable.cow);
                System.out.println("cow");
                break;
        }
        return v;
    }
}
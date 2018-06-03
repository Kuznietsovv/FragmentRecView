package com.example.kaa.fragmentrecview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentFav extends Fragment {

    View v;

    public FragmentFav() {
    }
        @Nullable
        @Override
        public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, Bundle
        savedInstanceState){
            v = inflater.inflate(R.layout.fav_fragment,container,false);
            return v;
        }
    }


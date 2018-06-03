package com.example.kaa.fragmentrecview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
       myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
       RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstContact);
       myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Code","isCode",R.drawable.pic1));
        lstContact.add(new Contact("Study","isStudy",R.drawable.pic2));
        lstContact.add(new Contact("GlobalServer","isServer",R.drawable.pic3));
        lstContact.add(new Contact("MapCode","isMap",R.drawable.pic4));
        lstContact.add(new Contact("Contact","isContactCode",R.drawable.pic5));
        lstContact.add(new Contact("Extends","isExtends",R.drawable.pic6));
        lstContact.add(new Contact("GlobalCode","isGlobal",R.drawable.pic7));
        lstContact.add(new Contact("Code","isCode",R.drawable.pic1));
        lstContact.add(new Contact("Study","isStudy",R.drawable.pic2));
        lstContact.add(new Contact("GlobalServer","isServer",R.drawable.pic3));
        lstContact.add(new Contact("MapCode","isMap",R.drawable.pic4));
        lstContact.add(new Contact("Contact","isContactCode",R.drawable.pic5));
        lstContact.add(new Contact("Extends","isExtends",R.drawable.pic6));
        lstContact.add(new Contact("GlobalCode","isGlobal",R.drawable.pic7));


    }
}

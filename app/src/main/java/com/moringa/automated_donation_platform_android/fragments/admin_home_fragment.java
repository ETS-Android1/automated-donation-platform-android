package com.moringa.automated_donation_platform_android.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moringa.automated_donation_platform_android.R;
import com.moringa.automated_donation_platform_android.adapters.DonationListAdapter;
import com.moringa.automated_donation_platform_android.adapters.OrganizationListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class admin_home_fragment extends Fragment {
@SuppressLint("NonConstantResourceId")
@BindView(R.id.adminRecyclerView)
RecyclerView recyclerView;
OrganizationListAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_admin_home, container, false);
        ButterKnife.bind(this,view);
        adapter = new OrganizationListAdapter();// create new  of donation adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//set recycler layout
        recyclerView.setAdapter(adapter);
        return view;
    }
}
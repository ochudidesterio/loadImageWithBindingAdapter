package com.example.databindingonfragmentandrecyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingonfragmentandrecyclerview.databinding.ContactFragmentBinding;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {
private ContactFragmentBinding mBinding;
    View mView;
    private ContactRecyclerViewAdapter mContactRecyclerViewAdapter;
    private RecyclerView mRecyclerView;
    private List<Contact>mContacts;
    private Contact mContact;

    public ContactFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //mView = inflater.inflate(R.layout.contact_fragment,container,false);
        mBinding = ContactFragmentBinding.inflate(getLayoutInflater());
        //mBinding.setContact(mContact);
        //mRecyclerView =(RecyclerView) mView.findViewById(R.id.contact_recyclerView);

        mContactRecyclerViewAdapter = new ContactRecyclerViewAdapter(getContext(),mContacts);
       // mRecyclerView.setLayoutManager( new LinearLayoutManager(getActivity()));
        mBinding.contactRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       // mRecyclerView.setAdapter(mContactRecyclerViewAdapter);
        mBinding.contactRecyclerView.setAdapter(mContactRecyclerViewAdapter);
        return mBinding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mContact = new Contact();

        mContacts = new ArrayList<>();
        mContacts.add(new Contact("Desterio","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Donald","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Steve","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Yogo","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Austin","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Gwa","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Ochudi","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Peter","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Ojay","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Dennis","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Machariah","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("De","(254)11111",R.drawable.ic_star));

        mContacts.add(new Contact("Dest","(254)11111",R.drawable.ic_star));
        mContacts.add(new Contact("Dterio","(254)11111",R.drawable.ic_star));


    }
}

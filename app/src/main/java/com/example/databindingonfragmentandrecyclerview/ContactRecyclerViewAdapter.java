package com.example.databindingonfragmentandrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingonfragmentandrecyclerview.databinding.ItemContactBinding;

import java.util.List;

public class ContactRecyclerViewAdapter extends RecyclerView.Adapter<ContactRecyclerViewAdapter.contactViewHolder> {
    Context mContext;
    List<Contact>mContactList;
    private ItemContactBinding mBinding;

    public ContactRecyclerViewAdapter(Context context, List<Contact> contactList) {
        mContext = context;
        mContactList = contactList;
    }

    @NonNull
    @Override
    public contactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mBinding = ItemContactBinding.inflate(LayoutInflater.from(mContext),parent,false);
        //view = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);

        return new contactViewHolder(mBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull contactViewHolder holder, int position) {
   Contact current = mContactList.get(position);

   mBinding.setContact(current);


    }

    @Override
    public int getItemCount() {
        return mContactList.size();
    }

    public class contactViewHolder extends RecyclerView.ViewHolder{

//        ItemContactBinding mItemContactBinding;

        public contactViewHolder(@NonNull ItemContactBinding itemView) {
            super(itemView.getRoot());
            mBinding = itemView;

        }
    }
}

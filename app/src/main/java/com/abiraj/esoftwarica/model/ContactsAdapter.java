package com.abiraj.esoftwarica.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abiraj.esoftwarica.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{

    Context mContext;
    List<Contacts> contactsList;
    // Constructor to recieve data
    public ContactsAdapter(Context mContext , List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.contactview,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, final int position) {
        Contacts contacts = contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageId());
        holder.tvname.setText(contacts.getName());
        holder.tvage.setText(contacts.getAge());
        holder.tvaddress.setText(contacts.getAddress());
        holder.tvgender.setText(contacts.getGender());
//        holder.btnsave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                contactsList.get(position);
//                notifyItemInserted(position);
//            }
//        });
        holder.imgdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactsList.remove(position);
                notifyItemRemoved(position);
            }
        });

    }


    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        ImageView imgProfile;
        TextView tvname,tvage,tvaddress,tvgender;
         ImageButton imgdel;
         Button btnsave;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgprofile);
            tvname = itemView.findViewById(R.id.tvname);
            tvaddress = itemView.findViewById(R.id.tvaddress);
            tvage = itemView.findViewById(R.id.tvage);
            tvgender = itemView.findViewById(R.id.tvgender);
            imgdel = itemView.findViewById(R.id.imgdel);
            btnsave = itemView.findViewById(R.id.btnsave);

        }
    }
}

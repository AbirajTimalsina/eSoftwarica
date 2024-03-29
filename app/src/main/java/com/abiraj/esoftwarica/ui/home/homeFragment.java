package com.abiraj.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abiraj.esoftwarica.R;
import com.abiraj.esoftwarica.model.Contacts;
import com.abiraj.esoftwarica.model.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class homeFragment extends Fragment {
private RecyclerView recyclerView;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.recId);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Sham","kapan","male","20",R.drawable.male));
        contactsList.add(new Contacts("Sita","Baneshwor","Female","21",R.drawable.female));
        contactsList.add(new Contacts("Muskan","Chabahil","Others","25",R.drawable.others));

        ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return root;
    }
}


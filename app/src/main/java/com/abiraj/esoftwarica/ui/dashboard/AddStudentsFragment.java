package com.abiraj.esoftwarica.ui.dashboard;

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

import com.abiraj.esoftwarica.R;

public class AddStudentsFragment extends Fragment {


    private AddStudentsViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        dashboardViewModel =
                ViewModelProviders.of(this).get(AddStudentsViewModel.class);
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
       

        
        return view;
    }
}
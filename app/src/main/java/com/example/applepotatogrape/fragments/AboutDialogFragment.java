package com.example.applepotatogrape.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.example.applepotatogrape.R;


public class AboutDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
                .setView(R.layout.aboutlayout)
                .create();

        alertDialog.show();

        Button btn=alertDialog.findViewById(R.id.pixelbutton);
        btn.setOnClickListener(v -> alertDialog.dismiss());
        return alertDialog;
    }
}

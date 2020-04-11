package com.example.actionbarandroid;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
         theDialog.setTitle("Sample dialog");
         theDialog.setMessage("helloo, I am a dialog");

         theDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 Toast.makeText(getActivity(), "Clicked OK", Toast.LENGTH_SHORT).show();
             }
         });

        theDialog.setNegativeButton("Click", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked Cancel", Toast.LENGTH_SHORT).show();
            }
        });

        return super.onCreateDialog(savedInstanceState);
    }
}

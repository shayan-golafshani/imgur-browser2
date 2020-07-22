package edu.cnm.deepdive.imgurbrowser2.controller;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cnm.deepdive.imgurbrowser2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageDetailDialogFragment extends Fragment {

    public ImageDetailDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_detail_dialog, container, false);
    }
}

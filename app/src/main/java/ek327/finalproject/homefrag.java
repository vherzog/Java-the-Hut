package ek327.finalproject;

/**
 * Created by nawtry on 12/7/15.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class homefrag extends Fragment {
    public static Fragment newInstance(Context context) {
        homefrag frag = new homefrag();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_home, null);
        return root;
    }
}
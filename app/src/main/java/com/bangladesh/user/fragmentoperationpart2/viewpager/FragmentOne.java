package com.bangladesh.user.fragmentoperationpart2.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bangladesh.user.fragmentoperationpart2.R;

/**
 * Created by User on 3/4/2018.
 */

public class FragmentOne extends Fragment {
    public FragmentOne() {
        Log.i("Fragment Check", "Fragment One Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}

package com.bangladesh.user.fragmentoperationpart2.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import com.bangladesh.user.fragmentoperationpart2.R;
import android.view.ViewGroup;



public class FragmentFive extends Fragment {

	public FragmentFive() {
		Log.i("Fragment Check", "Fragment Five Created");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		return inflater.inflate(R.layout.fragment_five, container, false);
	}
}

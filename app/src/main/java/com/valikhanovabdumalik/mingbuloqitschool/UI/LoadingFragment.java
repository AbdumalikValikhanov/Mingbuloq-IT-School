package com.valikhanovabdumalik.mingbuloqitschool.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.valikhanovabdumalik.mingbuloqitschool.R;

public class LoadingFragment extends Fragment {
    ImageView loading_gif;
    public LoadingFragment() {
        super(R.layout.loading_fragment);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loading_gif=view.findViewById(R.id.loading_gif);
        Glide.with(getContext()).load(R.drawable.loading).into(loading_gif);
    }
}

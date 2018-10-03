package com.example.user.test2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 23.05.2018.
 */

public class FragmentCategoryList extends Fragment {
    /**
     * Diplaying fragment view for selected nav drawer list item
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.category_list, container, false);
        return rootView;
    }
}

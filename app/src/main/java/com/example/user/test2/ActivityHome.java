package com.example.user.test2;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by User on 14.05.2018.
 */

public class ActivityHome extends Fragment implements AdapterView.OnItemClickListener {
    GridView gridview;
    AdapterGridView gridviewAdapter;
    ArrayList<GridViewItem> data = new ArrayList<GridViewItem>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        gridview = (GridView) v.findViewById(R.id.gridView1);
        gridview.setOnItemClickListener(this);

        data.add(new GridViewItem(getResources().getString(R.string.menu_product), getResources().getDrawable(R.drawable.ic_cart)));

        setDataAdapter();

        return v;
    }

    // Set the Data Adapter
    public void setDataAdapter() {
        gridviewAdapter = new AdapterGridView(getActivity(), R.layout.fragment_list_item, data);
        gridview.setAdapter(gridviewAdapter);
    }

    @Override
    public void onItemClick(final AdapterView<?> arg0, final View view, final int position, final long id) {
        if (position==0){
            startActivity(new Intent(getActivity(), ActivityCart.class));
            getActivity().overridePendingTransition (R.anim.open_next, R.anim.close_next);
        }
    }
}

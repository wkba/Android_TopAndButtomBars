package com.example.wakabashi.topandbuttombars;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by wakabashi on 2017/06/29.
 */

public class Tab2Fragment extends Fragment{
    private static final String TAG = "Tab2Fragment";

    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout, container,false);

        mListView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();

        list.add(new Card("drawable://" + R.drawable.i1, "red fish"));
        list.add(new Card("drawable://" + R.drawable.i2, "night town"));
        list.add(new Card("drawable://" + R.drawable.i3, "bule lights"));
        list.add(new Card("drawable://" + R.drawable.i4, "spark"));
        list.add(new Card("drawable://" + R.drawable.i5, "fish and night"));
        list.add(new Card("drawable://" + R.drawable.i6, "natural"));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.card_layout_main, list);
        mListView.setAdapter(adapter);

        return view;
    }
}

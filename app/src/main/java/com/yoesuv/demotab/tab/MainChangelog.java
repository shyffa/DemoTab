package com.yoesuv.demotab.tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yoesuv.demotab.R;


public class MainChangelog extends Fragment {

    private View v;
    private String[] androidVersion;
    private ArrayAdapter<String> adapter;
    private ListView lV;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_changelog, container, false);

        androidVersion = getResources().getStringArray(R.array.android);
        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, androidVersion);

        lV = (ListView) v.findViewById(R.id.listView);
        lV.setVerticalScrollBarEnabled(false);
        lV.setAdapter(adapter);

        return v;
    }
}

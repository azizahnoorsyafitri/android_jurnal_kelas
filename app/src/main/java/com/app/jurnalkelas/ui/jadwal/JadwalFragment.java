package com.app.jurnalkelas.ui.jadwal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.app.jurnalkelas.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JadwalFragment extends Fragment {


    JadwalExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    private Context mContext;

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        mContext = context;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_jadwal, container, false);
        // get the listview
        expListView = (ExpandableListView) root.findViewById(R.id.lvExp);
        // preparing list data
        prepareListData();
        listAdapter = new JadwalExpandableListAdapter(mContext, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        return root;
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("SENIN");
        listDataHeader.add("SELASA");
        listDataHeader.add("RABU");
        listDataHeader.add("KAMIS");
        listDataHeader.add("JUMAT");
        listDataHeader.add("SABTU");
        // Adding child data
        List<String> top250 = new ArrayList<>();
        top250.add("The Shawshank Redemption");
        top250.add("The Godfather");
        top250.add("The Godfather: Part II");
        top250.add("Pulp Fiction");
        top250.add("The Good, the Bad and the Ugly");
        top250.add("The Dark Knight");
        top250.add("12 Angry Men");

        List<String> nowShowing = new ArrayList<>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }
}

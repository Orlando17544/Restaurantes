package com.example.restaurantes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BeverageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BeverageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private Parcelable[] mParam1;

    public BeverageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment BeverageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BeverageFragment newInstance(Beverage[] beverages) {
        BeverageFragment fragment = new BeverageFragment();
        Bundle args = new Bundle();
        args.putParcelableArray(ARG_PARAM1, beverages);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getParcelableArray(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beverage, container, false);

        int[] nameIds = new int[]{R.id.beverage_name_1, R.id.beverage_name_2, R.id.beverage_name_3, R.id.beverage_name_4};
        int[] priceIds = new int[]{R.id.beverage_price_1, R.id.beverage_price_2, R.id.beverage_price_3, R.id.beverage_price_4};

        for (int i = 0; i < mParam1.length; i++) {
            Beverage beverage = (Beverage) mParam1[i];

            TextView beverageName = view.findViewById(nameIds[i]);
            TextView beveragePrice = view.findViewById(priceIds[i]);

            beverageName.setText(beverage.getName());
            beveragePrice.setText(String.valueOf(beverage.getPrice()));
        }

        return view;
    }
}
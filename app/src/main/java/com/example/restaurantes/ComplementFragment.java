package com.example.restaurantes;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ComplementFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ComplementFragment extends Fragment {

    public static final String EXTRA_COMPLEMENT = "com.example.restaurantes.EXTRA_COMPLEMENT";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private Parcelable[] mParam1;

    public ComplementFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment ComplementFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ComplementFragment newInstance(Complement[] complements) {
        ComplementFragment fragment = new ComplementFragment();
        Bundle args = new Bundle();
        args.putParcelableArray(ARG_PARAM1, complements);
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
        View view = inflater.inflate(R.layout.fragment_complement, container, false);

        int[] nameIds = new int[]{R.id.complement_name_1, R.id.complement_name_2, R.id.complement_name_3, R.id.complement_name_4};
        int[] priceIds = new int[]{R.id.complement_price_1, R.id.complement_price_2, R.id.complement_price_3, R.id.complement_price_4};

        for (int i = 0; i < mParam1.length; i++) {
            Complement complement = (Complement) mParam1[i];

            TextView complementName = view.findViewById(nameIds[i]);
            TextView complementPrice = view.findViewById(priceIds[i]);

            complementName.setText(complement.getName());
            complementPrice.setText("$ " + complement.getPrice());

            complementName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), ComplementActivity.class);
                    intent.putExtra(EXTRA_COMPLEMENT, complement);
                    startActivity(intent);
                }
            });
        }

        return view;
    }
}
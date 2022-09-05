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
 * Use the {@link MealFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MealFragment extends Fragment {

    public static final String EXTRA_MEAL = "com.example.restaurantes.EXTRA_MEAL";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private Parcelable[] mParam1;

    public MealFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment MealFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MealFragment newInstance(Meal[] meals) {
        MealFragment fragment = new MealFragment();
        Bundle args = new Bundle();
        args.putParcelableArray(ARG_PARAM1, meals);
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
        View view = inflater.inflate(R.layout.fragment_meal, container, false);

        int[] nameIds = new int[]{R.id.meal_name_1, R.id.meal_name_2, R.id.meal_name_3, R.id.meal_name_4};
        int[] priceIds = new int[]{R.id.meal_price_1, R.id.meal_price_2, R.id.meal_price_3, R.id.meal_price_4};

        for (int i = 0; i < mParam1.length; i++) {
            Meal meal = (Meal) mParam1[i];

            TextView mealName = view.findViewById(nameIds[i]);
            TextView mealPrice = view.findViewById(priceIds[i]);

            mealName.setText(meal.getName());
            mealPrice.setText("$ " + meal.getPrice());

            mealName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), MealActivity.class);
                    intent.putExtra(EXTRA_MEAL, meal);
                    startActivity(intent);
                }
            });
        }


        
        return view;
    }
}
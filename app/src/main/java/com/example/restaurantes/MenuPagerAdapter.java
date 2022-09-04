package com.example.restaurantes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MenuPagerAdapter extends FragmentStateAdapter {
    private Meal meal;
    private Beverage beverage;
    private Complement complement;

    public MenuPagerAdapter(@NonNull FragmentActivity fragmentActivity,
                            Meal meal,
                            Beverage beverage,
                            Complement complement
    ) {
        super(fragmentActivity);
        this.meal = meal;
        this.beverage = beverage;
        this.complement = complement;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = MealFragment.newInstance(meal);
                break;
            case 1:
                fragment = new BeverageFragment();
                break;
            case 2:
                fragment = new ComplementFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
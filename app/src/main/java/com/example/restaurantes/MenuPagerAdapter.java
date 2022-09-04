package com.example.restaurantes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MenuPagerAdapter extends FragmentStateAdapter {
    private Menu menu;

    public MenuPagerAdapter(@NonNull FragmentActivity fragmentActivity, Menu menu) {
        super(fragmentActivity);
        this.menu = menu;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = MealFragment.newInstance(menu.getMeals());
                break;
            case 1:
                fragment = BeverageFragment.newInstance(menu.getBeverages());
                break;
            case 2:
                fragment = ComplementFragment.newInstance(menu.getComplements());
                break;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
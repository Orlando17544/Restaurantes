package com.example.restaurantes;

import android.os.Parcel;
import android.os.Parcelable;

public class Menu implements Parcelable {
    private Meal[] meals;
    private Beverage[] beverages;
    private Complement[] complements;

    public Menu(Meal[] meals, Beverage[] beverages, Complement[] complements) {
        this.meals = meals;
        this.beverages = beverages;
        this.complements = complements;
    }

    protected Menu(Parcel in) {
        meals = in.createTypedArray(Meal.CREATOR);
        beverages = in.createTypedArray(Beverage.CREATOR);
        complements = in.createTypedArray(Complement.CREATOR);
    }

    public static final Creator<Menu> CREATOR = new Creator<Menu>() {
        @Override
        public Menu createFromParcel(Parcel in) {
            return new Menu(in);
        }

        @Override
        public Menu[] newArray(int size) {
            return new Menu[size];
        }
    };

    public Meal[] getMeals() {
        return meals;
    }

    public Beverage[] getBeverages() {
        return beverages;
    }

    public Complement[] getComplements() {
        return complements;
    }

    public ItemMenu[] getItems() {
        int sizeItems = meals.length + beverages.length + complements.length;

        ItemMenu[] items = new ItemMenu[sizeItems];

        int j = 0;
        for (int i = 0; i < meals.length; i++) {
            items[j] = meals[i];
            j++;
        }

        for (int i = 0; i < beverages.length; i++) {
            items[j] = beverages[i];
            j++;
        }

        for (int i = 0; i < complements.length; i++) {
            items[j] = complements[i];
            j++;
        }

        return items;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(meals, i);
        parcel.writeTypedArray(beverages, i);
        parcel.writeTypedArray(complements, i);
    }
}

package com.example.restaurantes;

import android.os.Parcel;
import android.os.Parcelable;

public class Restaurant implements Parcelable {
    private String name;
    private Menu menu;

    public Restaurant(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    protected Restaurant(Parcel in) {
        name = in.readString();
        menu = in.readParcelable(Menu.class.getClassLoader());
    }

    public static final Creator<Restaurant> CREATOR = new Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };

    public String getName() {
        return name;
    }

    public Menu getMenu() {
        return menu;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeParcelable(menu, i);
    }
}

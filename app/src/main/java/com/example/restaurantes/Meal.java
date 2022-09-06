package com.example.restaurantes;

import android.os.Parcel;
import android.os.Parcelable;

public class Meal implements ItemMenu {
    private String name;
    private int price;

    public Meal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected Meal(Parcel in) {
        name = in.readString();
        price = in.readInt();
    }

    public static final Creator<Meal> CREATOR = new Creator<Meal>() {
        @Override
        public Meal createFromParcel(Parcel in) {
            return new Meal(in);
        }

        @Override
        public Meal[] newArray(int size) {
            return new Meal[size];
        }
    };

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(price);
    }
}

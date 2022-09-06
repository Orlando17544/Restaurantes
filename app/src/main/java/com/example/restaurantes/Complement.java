package com.example.restaurantes;

import android.os.Parcel;
import android.os.Parcelable;

public class Complement implements ItemMenu {
    private String name;
    private int price;

    public Complement(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected Complement(Parcel in) {
        name = in.readString();
        price = in.readInt();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public static final Creator<Complement> CREATOR = new Creator<Complement>() {
        @Override
        public Complement createFromParcel(Parcel in) {
            return new Complement(in);
        }

        @Override
        public Complement[] newArray(int size) {
            return new Complement[size];
        }
    };

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

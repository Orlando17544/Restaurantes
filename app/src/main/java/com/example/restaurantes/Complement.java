package com.example.restaurantes;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.lifecycle.ComputableLiveData;

public class Complement implements Parcelable {
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

    public String getName() {
        return name;
    }

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

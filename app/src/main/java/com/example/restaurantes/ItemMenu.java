package com.example.restaurantes;

import android.os.Parcelable;

public interface ItemMenu extends Parcelable {
    String getName();

    int getPrice();
}

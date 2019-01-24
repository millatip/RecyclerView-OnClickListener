package com.dicoding.millatip.myrecyclerview.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Heroes implements Parcelable {
    Heroes() {
    }

    private String name, remarks, photo;

    protected Heroes(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
    }

    public static final Creator<Heroes> CREATOR = new Creator<Heroes>() {
        @Override
        public Heroes createFromParcel(Parcel in) {
            return new Heroes(in);
        }

        @Override
        public Heroes[] newArray(int size) {
            return new Heroes[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(remarks);
        parcel.writeString(photo);
    }
}

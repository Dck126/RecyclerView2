package com.example.recyclerviewv2;

import android.os.Parcel;
import android.os.Parcelable;

public class RvMainModel implements Parcelable {
    private String title, description;
    private int photo;

    protected RvMainModel(Parcel in) {
        title = in.readString();
        description = in.readString();
        photo = in.readInt();
    }

    public static final Creator<RvMainModel> CREATOR = new Creator<RvMainModel>() {
        @Override
        public RvMainModel createFromParcel(Parcel in) {
            return new RvMainModel(in);
        }

        @Override
        public RvMainModel[] newArray(int size) {
            return new RvMainModel[size];
        }
    };

    public RvMainModel() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(photo);
    }
}

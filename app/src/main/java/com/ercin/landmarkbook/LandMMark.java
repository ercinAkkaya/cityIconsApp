package com.ercin.landmarkbook;

import java.io.Serializable;

public class LandMMark implements Serializable {

    public LandMMark(String isim, String country, int image) {
        this.isim = isim;
        this.country = country;
        this.image = image;
    }

    String isim;
    String country;
    int image;

}

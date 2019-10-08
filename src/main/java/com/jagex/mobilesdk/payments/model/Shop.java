package com.jagex.mobilesdk.payments.model;

import java.util.List;

public class Shop {
    private List categories;
    private String imageBackground;
    private String imageLogo;

    public Shop() {
        super();
    }

    public List getCategories() {
        return this.categories;
    }

    public String getImageBackground() {
        return this.imageBackground;
    }

    public String getImageLogo() {
        return this.imageLogo;
    }

    public void setCategories(List arg1) {
        this.categories = arg1;
    }

    public void setImageBackground(String arg1) {
        this.imageBackground = arg1;
    }

    public void setImageLogo(String arg1) {
        this.imageLogo = arg1;
    }
}


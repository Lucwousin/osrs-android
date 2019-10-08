package com.jagex.mobilesdk.payments.model;

import java.util.List;

public class JagexCategory {
    private int categoryID;
    private String imageCollapsed;
    private String imageExpanded;
    private String longDescription;
    private String name;
    private List products;
    private String shortDescription;

    public JagexCategory() {
        super();
    }

    public int getCategoryID() {
        return this.categoryID;
    }

    public String getImageCollapsed() {
        return this.imageCollapsed;
    }

    public String getImageExpanded() {
        return this.imageExpanded;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public String getName() {
        return this.name;
    }

    public List getProducts() {
        return this.products;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setCategoryID(int arg1) {
        this.categoryID = arg1;
    }

    public void setImageCollapsed(String arg1) {
        this.imageCollapsed = arg1;
    }

    public void setImageExpanded(String arg1) {
        this.imageExpanded = arg1;
    }

    public void setLongDescription(String arg1) {
        this.longDescription = arg1;
    }

    public void setName(String arg1) {
        this.name = arg1;
    }

    public void setProducts(List arg1) {
        this.products = arg1;
    }

    public void setShortDescription(String arg1) {
        this.shortDescription = arg1;
    }
}


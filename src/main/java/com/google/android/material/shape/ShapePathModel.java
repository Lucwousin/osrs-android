package com.google.android.material.shape;

import com.google.android.material.internal.Experimental;

@Experimental(value="The shapes API is currently experimental and subject to change") public class ShapePathModel {
    private static final CornerTreatment DEFAULT_CORNER_TREATMENT;
    private static final EdgeTreatment DEFAULT_EDGE_TREATMENT;
    private EdgeTreatment bottomEdge;
    private CornerTreatment bottomLeftCorner;
    private CornerTreatment bottomRightCorner;
    private EdgeTreatment leftEdge;
    private EdgeTreatment rightEdge;
    private EdgeTreatment topEdge;
    private CornerTreatment topLeftCorner;
    private CornerTreatment topRightCorner;

    static {
        ShapePathModel.DEFAULT_CORNER_TREATMENT = new CornerTreatment();
        ShapePathModel.DEFAULT_EDGE_TREATMENT = new EdgeTreatment();
    }

    public ShapePathModel() {
        super();
        this.topLeftCorner = ShapePathModel.DEFAULT_CORNER_TREATMENT;
        this.topRightCorner = ShapePathModel.DEFAULT_CORNER_TREATMENT;
        this.bottomRightCorner = ShapePathModel.DEFAULT_CORNER_TREATMENT;
        this.bottomLeftCorner = ShapePathModel.DEFAULT_CORNER_TREATMENT;
        this.topEdge = ShapePathModel.DEFAULT_EDGE_TREATMENT;
        this.rightEdge = ShapePathModel.DEFAULT_EDGE_TREATMENT;
        this.bottomEdge = ShapePathModel.DEFAULT_EDGE_TREATMENT;
        this.leftEdge = ShapePathModel.DEFAULT_EDGE_TREATMENT;
    }

    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    public void setAllCorners(CornerTreatment arg1) {
        this.topLeftCorner = arg1;
        this.topRightCorner = arg1;
        this.bottomRightCorner = arg1;
        this.bottomLeftCorner = arg1;
    }

    public void setAllEdges(EdgeTreatment arg1) {
        this.leftEdge = arg1;
        this.topEdge = arg1;
        this.rightEdge = arg1;
        this.bottomEdge = arg1;
    }

    public void setBottomEdge(EdgeTreatment arg1) {
        this.bottomEdge = arg1;
    }

    public void setBottomLeftCorner(CornerTreatment arg1) {
        this.bottomLeftCorner = arg1;
    }

    public void setBottomRightCorner(CornerTreatment arg1) {
        this.bottomRightCorner = arg1;
    }

    public void setCornerTreatments(CornerTreatment arg1, CornerTreatment arg2, CornerTreatment arg3, CornerTreatment arg4) {
        this.topLeftCorner = arg1;
        this.topRightCorner = arg2;
        this.bottomRightCorner = arg3;
        this.bottomLeftCorner = arg4;
    }

    public void setEdgeTreatments(EdgeTreatment arg1, EdgeTreatment arg2, EdgeTreatment arg3, EdgeTreatment arg4) {
        this.leftEdge = arg1;
        this.topEdge = arg2;
        this.rightEdge = arg3;
        this.bottomEdge = arg4;
    }

    public void setLeftEdge(EdgeTreatment arg1) {
        this.leftEdge = arg1;
    }

    public void setRightEdge(EdgeTreatment arg1) {
        this.rightEdge = arg1;
    }

    public void setTopEdge(EdgeTreatment arg1) {
        this.topEdge = arg1;
    }

    public void setTopLeftCorner(CornerTreatment arg1) {
        this.topLeftCorner = arg1;
    }

    public void setTopRightCorner(CornerTreatment arg1) {
        this.topRightCorner = arg1;
    }
}


package androidx.constraintlayout.solver.widgets;

public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public Rectangle() {
        super();
    }

    public boolean contains(int arg3, int arg4) {
        boolean v3 = arg3 < this.x || arg3 >= this.x + this.width || arg4 < this.y || arg4 >= this.y + this.height ? false : true;
        return v3;
    }

    public int getCenterX() {
        return (this.x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.y + this.height) / 2;
    }

    void grow(int arg2, int arg3) {
        this.x -= arg2;
        this.y -= arg3;
        this.width += arg2 * 2;
        this.height += arg3 * 2;
    }

    boolean intersects(Rectangle arg4) {
        boolean v4 = this.x < arg4.x || this.x >= arg4.x + arg4.width || this.y < arg4.y || this.y >= arg4.y + arg4.height ? false : true;
        return v4;
    }

    public void setBounds(int arg1, int arg2, int arg3, int arg4) {
        this.x = arg1;
        this.y = arg2;
        this.width = arg3;
        this.height = arg4;
    }
}


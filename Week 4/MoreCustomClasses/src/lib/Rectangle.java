package lib;

public class Rectangle {

    private int x, y, w, h;

    public Rectangle() {
        x = 0;
        y = 0;
        w = 0;
        h = 0;
    }

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public int getArea() {
        return w * h;
    }

    public int getPerimeter() {
        return (w + h) * 2;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void expand(double scaleW, double scaleH) {
        this.w = (int) Math.round(w*scaleW);
        this.h = (int) Math.round(h*scaleH);
    }

    public String toString() {
        return "Rectangle:[x=" + x + ", y=" + y + ", w=" + w + ", h=" + h + "]";
    }

    public void printRectangleGrid(char fill) {
        int width = this.w;
        int height = this.h;

        for (int j = 1; j <= height; j++) {
            for (int i = 1; i <= width; i++) {
                //PRINT GRID
                if (j == 1) {
                    System.out.print(i + "\t");
                } else if (i == 1) {
                    System.out.print(j + "\t");
                } else {

                    //PRINT RECTANGLE
                    if ((j >= y && j <= (y+h)) && (i >= x && i <= (x+w))) {
                        System.out.print(fill + "\t");
                    } else {
                        System.out.print("\t");
                    }

                }
            }

            System.out.println("\n");
        }
    }

}

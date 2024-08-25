class Sum {
    public static int sumOfAreas(Shape[] array) {
        // write your code here
        int sum = 0;
        for (Shape shape : array) {
            sum += shape.getArea();
        }
        return sum;
    }
}

//Don't change the code below
class Shape {
    int getArea() {
        return 0;
    }
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    int getArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int getArea() {
        return width * height;
    }
}

class Rectangle {
    private double length;  // private = not accessible outside
    private double width;

    // Setters - validate positive only
    void setLength(double l) {
        if (l > 0) {
            this.length = l;
        } else {
            System.out.println("Length must be positive!");
        }
    }

    void setWidth(double w) {
        if (w > 0) {
            this.width = w;
        } else {
            System.out.println("Width must be positive!");
        }
    }

    // Getters
    double getLength() { return length; }
    double getWidth() { return width; }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(-5); // will print error
        r.setWidth(5);
        r.display();
    }
}
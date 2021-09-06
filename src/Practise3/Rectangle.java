 package Practise3;

    public class Rectangle extends Shape {
        priotected double width;
        priotected double length;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(String color, boolean filled, double width, double length) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", length=" + length +
                    '}';
        }

        @Override
        public double getArea() {
            return width*length;
        }
        @Override
        public double getPerimeter() {
            return (width+Perimeter)*2;

        }

    }

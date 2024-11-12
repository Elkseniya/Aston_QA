public interface Shape {
        double getPerimeter();
        double getArea();

        default String getFillColor() {
            return "No fill color specified";
        }

        default String getBorderColor() {
            return "No border color specified";
        }
    }


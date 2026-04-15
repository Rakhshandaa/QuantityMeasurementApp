public class QuantityMeasurementApp {

    // Feet Class
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Feet feet = (Feet) obj;
            return Double.compare(this.value, feet.value) == 0;
        }
    }

    // Inches Class (NEW in UC2)
    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Inches inches = (Inches) obj;
            return Double.compare(this.value, inches.value) == 0;
        }
    }

    // Separate methods (IMPORTANT for UC2)
    public static boolean compareFeet(double a, double b) {
        return new Feet(a).equals(new Feet(b));
    }

    public static boolean compareInches(double a, double b) {
        return new Inches(a).equals(new Inches(b));
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Feet equality: " + compareFeet(1.0, 1.0));
        System.out.println("Inches equality: " + compareInches(1.0, 1.0));
    }
}
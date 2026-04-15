public class QuantityMeasurementApp {

    // Inner class Feet
    public static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals()
        @Override
        public boolean equals(Object obj) {

            // Same reference check (reflexive)
            if (this == obj) {
                return true;
            }

            // Null check + type check
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            // Cast safely
            Feet feet = (Feet) obj;

            // Compare double values properly
            return Double.compare(this.value, feet.value) == 0;
        }
    }

    // Main method
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Are equal? " + result);
    }
}
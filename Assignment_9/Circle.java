public class Circle {
    private double myX;
    private double myY;
    private double myDiameter;

    // Default constructor
    public Circle() {
        myX = 0;
        myY = 0;
        myDiameter = 100;
    }

    // Accessor methods
    public double getCenterX() {
        return myX;
    }

    public double getCenterY() {
        return myY;
    }

    public double getDiameter() {
        return myDiameter;
    }

    // Setter method for diameter with validation
    public void setDiameter(double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative.");
        }
        myDiameter = diameter;
    }

    // Custom exception for negative diameter
    public class NegativeDiameterException extends Exception {
        public NegativeDiameterException(String message) {
            super(message);
        }
    }
}
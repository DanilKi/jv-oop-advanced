package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: "
                + calculateArea() + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + color + ".";
    }
}

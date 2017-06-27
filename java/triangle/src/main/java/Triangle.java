class Triangle {
    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side3 <= 0 || side1 <= 0 || side3 <= 0)
        {
            throw new TriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if(!isTriangle())
        {
            throw new TriangleException();
        }
    }

    TriangleKind getKind() {
        if (side3 == side2 && side3 == side1)
        {
            return TriangleKind.EQUILATERAL;
        }
        if (isIsoceles())
        {
            return TriangleKind.ISOSCELES;
        }
        return TriangleKind.SCALENE;
    }

    private boolean isIsoceles() {
        if (side3 == side1 && side3 != side2) {
            return true;
        }
        return side2 == side1 && side3 != side2 || side3 == side2 && side3 != side1;

    }
    private boolean isTriangle()
    {
        return side3 + side2 > side1 && side3 + side1 > side2 && side1 + side2 > side3;
    }

}

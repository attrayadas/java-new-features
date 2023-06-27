package com.attraya.java17.switchpattern;

public class SwitchPatternsDemo {

    /**
     * Earlier to Java 17
     */
    public static double getPerimeter(Shape shape) {
        if (shape instanceof Circle c) {
            return 2 * Math.PI * c.radius();
        } else if (shape instanceof Rectangle r) {
            return 2 * r.length() * r.width();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Java 17 feature of Switch
     */
    public static double getPerimeterUsingSwitch(Shape shape) {
        return switch (shape) {
            case Circle c -> 2 * Math.PI * c.radius();
            case Rectangle r -> 2 * r.length() * r.width();
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }

    /**
     * Null support in switch
     */
    public static void testNullSupport(Object obj) {
        switch (obj) {
            case String s -> System.out.println(s);
            case null -> System.out.println("Unknown");
            default -> System.out.println("Default");
        }
    }

    public static void main(String[] args) {
        System.out.println(getPerimeter(new Circle(10)));
        System.out.println(getPerimeterUsingSwitch(new Circle(10)));
        testNullSupport(null);
    }
}

//Output:
//        62.83185307179586
//        62.83185307179586
//        Unknown
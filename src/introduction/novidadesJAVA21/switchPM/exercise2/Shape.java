package introduction.novidadesJAVA21.switchPM.exercise2;

public interface Shape {
}

record Square (double side) implements Shape {
}

record Circle (double radius) implements Shape {
}

record Triangle(double base, double height) implements Shape {
}

record Rectangle(double width, double height) implements Shape {
}

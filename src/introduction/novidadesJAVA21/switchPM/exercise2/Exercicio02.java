package introduction.novidadesJAVA21.switchPM.exercise2;

public class Exercicio02 {
    /*
    Implemente e também utilize Pattern Matching com Switch para calcular a area das formas geometricas de acordo com sua forma
    - quadrado: lado x lado
    - triangulo: (base x altura) / 2
    - retangulo: base x altura
    - circulo: π(raio x raio)
     */

    public static double calculateArea(Shape shape){
        return 0.0;
    }

    public static void main(String[] args) {
        var quadrado = new Square(10);
        var circulo = new Circle(5);
        var retangulo = new Rectangle(10, 5);
        var retanguloQuadrado = new Rectangle(10, 10);
        var triangulo = new Triangle(5, 8);

        System.out.println("Área do Círculo: " + calculateArea(circulo));
        System.out.println("Área do Quadrado: " + calculateArea(quadrado));
        System.out.println("Área do Retângulo: " + calculateArea(retangulo));
        System.out.println("Área do Triângulo: " + calculateArea(triangulo));
    }
}

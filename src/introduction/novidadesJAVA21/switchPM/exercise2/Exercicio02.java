package introduction.novidadesJAVA21.switchPM.exercise2;

public class Exercicio02 {
    /*
    Implemente e também utilize Pattern Matching com Switch para calcular a area das formas geometricas de acordo com sua forma
    - quadrado: lado x lado
    - triangulo: (base x altura) / 2
    - retangulo: base x altura
    - circulo: π(raio x raio)
     */

    public static double calculateArea(Shape shape) {

        return switch (shape) {
            case Square s -> Math.pow(s.side(), 2); // s.side() * s.side();
            case Triangle t -> (t.base() * t.height()) / 2;
            case Rectangle r when r.width() == r.height() -> {
                System.err.println("O meu retângulo é um quadrado!");
                yield Math.pow(r.width(), 2);   // yield == return -> return Math.pow(r.width(), 2);
            }
            case Rectangle r -> r.width() * r.height();
            case Circle c -> 3.14 * Math.pow(c.radius(), 2);
            default -> throw new IllegalArgumentException("Forma desconhecida");
        };

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
        System.out.println("Área do Retângulo: " + calculateArea(retanguloQuadrado));
        System.out.println("Área do Triângulo: " + calculateArea(triangulo));
    }
}

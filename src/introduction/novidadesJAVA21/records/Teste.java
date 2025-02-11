package introduction.novidadesJAVA21.records;

public class Teste {
    public static void main(String[] args) {
        // antes - sem o uso do Record
        System.out.println("---------- SEM USO DE RECORD ----------");

        var p1 = new ProdutoSRecord("Iphone 15", 4499.9);
        var p2 = new ProdutoSRecord("Iphone 15", 4499.9);

        System.out.println(p1.getName()); // Iphone 15
        System.out.println(p1.getPrice()); // 4499.9

        System.out.println(p2.getName()); // Iphone 15
        System.out.println(p2.getPrice()); // 4499.9

        System.out.println(p1); // Produto [ nome=Iphone 15, preço=4499.9 ]
        System.out.println(p2); // Produto [ nome=Iphone 15, preço=4499.9 ]

        System.out.println(p1.equals(p2)); // true      POREM - false sem a sobrescrita de equals - criterio -> referencia

        // depois - com o uso do Record
        System.out.println("---------- COM USO DE RECORD ----------");
        var pR1 = new ProdutoRecord("Iphone 15", 4499.9);
        var pR2 = new ProdutoRecord("Iphone 15", 4499.9);

        System.out.println(pR1.name()); // Iphone 15
        System.out.println(pR1.price()); // 4499.9

        System.out.println(pR2.name()); // Iphone 15
        System.out.println(pR2.price()); // 4499.9

        System.out.println(pR1); // Produto [name=Iphone 15, price=4499.9]
        System.out.println(pR2); // Produto [name=Iphone 15, price=4499.9]

        System.out.println(p1.equals(p2)); // true - critério -> price e name
    }
}

package introduction.conhecendo;

public class Casting {
    public static void main(String[] args) {

        double salarioAnual = 98275.67;
        System.out.println(salarioAnual);   // 98275.67

    //  int valor = salarioAnual;   // da erro
        int valor = (int) salarioAnual;     // fazendo o casting/conversao -> transformando double em int
        System.out.println(valor);      // 98275
    }
}

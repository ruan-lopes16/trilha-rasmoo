package orientacaoObjetos.bancoRasmooEncapsulamento;

public class TesteStatic {
    public static void main(String[] args) {
        Cliente ruan = new Cliente("Ruan", "12345679");

        Conta conta1 = new Conta(4000, 10001, ruan);
        Conta conta2 = new Conta(4000, 10002, ruan);
        Conta conta3 = new Conta(4000, 10003, ruan);
        Conta conta4 = new Conta(4000, 10004, ruan);

        System.out.println("O total de conta é: " + Conta.getTotal());

    }
}

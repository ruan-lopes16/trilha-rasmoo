package orientacaoObjetos.bancoRasmoo;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        System.out.println(primeiraConta); // orientacaoObjetos.bancoRasmoo.Conta@6acbcfc0 = a referencia é do tipo Conta + posição da memoria onde Conta foi criada

        Conta segundaConta = primeiraConta; // recebe a referencia da primeira conta - APONTAM PARA O MESMO ESPAÇO EM MEMORIA -> orientacaoObjetos.bancoRasmoo.Conta@6acbcfc0

        // testes
        primeiraConta.saldo = 1000;
        System.out.println(segundaConta.saldo); // 1000 - pois a referencia está de memoria é igual

        segundaConta.saldo = 450;
        System.out.println(primeiraConta.saldo);

        // validação
        if (primeiraConta == segundaConta) {
            System.out.println("As duas variáveis apontam para o mesmo local em memória: orientacaoObjetos.bancoRasmoo.Conta@6acbcfc0");
        } else {
            System.out.println("São diferentes");
        }

        /*
        CONCLUSÃO:
        Como não demos um 'new', não instanciamos nenhum objeto, ou seja, não criamos mais nenhum objeto para ser armazenado em memória,
        utilizamos uma "variável" para pegar e referenciar o objeto já criado.

        Ao alterar um valor de qualquer conta, altera automaticamente o valor das duas, pois contém somente UMA REFERÊNCIA EM MEMÓRIA
        APENAS UM OBJETO CRIADO, contém apenas uma referência com outro nome
         */
    }
}

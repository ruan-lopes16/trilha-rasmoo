package introduction.novidadesJAVA21.sealedClass.test;

import introduction.novidadesJAVA21.sealedClass.model.*;

public class Teste {
    public static void main(String[] args) {

        // criando instancias de cada status
        StatusPedido processando = new Processando();
        StatusPedido pendente = new Pendente();
        StatusPedido enviado = new Enviado();
        StatusPedido entregue = new Entregue();

        // imprimindo descrições
        System.out.println(processando.getDescricao()); // output: Pedido em processamento!
        System.out.println(pendente.getDescricao()); // output: Pendido pendente.
        System.out.println(enviado.getDescricao()); // output: Pedido enviado!
        System.out.println(entregue.getDescricao()); // output: Pedido entregue!

        System.out.println("-------------------------------------------------------");

        // pedido
        // inicialmente pendente
        Pedido pedido1 = new Pedido(123, "Camiseta", pendente);
        Pedido pedido2 = new Pedido(1234, "Blusa de frio", pendente);

        System.out.println("Status inicial do pedido de id '" + pedido1.getId() + "': " + pedido1.getStatus().getDescricao());

        pedido1.setStatus(processando);
        System.out.println("Novo status do pedido: " + pedido1.getStatus().getDescricao());

        pedido1.setStatus(entregue);
        System.out.println("Novo status do pedido: " + pedido1.getStatus().getDescricao());

        System.out.println("-------------------------------------------------------");

        System.out.println("Status inicial do pedido de id '" + pedido2.getId() + "': " + pedido2.getStatus().getDescricao());

        pedido2.setStatus(processando);
        System.out.println("Novo status do pedido: " + pedido2.getStatus().getDescricao());

        pedido2.setStatus(entregue);
        System.out.println("Novo status do pedido: " + pedido2.getStatus().getDescricao());

    }
}

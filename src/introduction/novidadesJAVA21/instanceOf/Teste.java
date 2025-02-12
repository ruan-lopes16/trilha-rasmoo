package introduction.novidadesJAVA21.instanceOf;

import introduction.novidadesJAVA21.instanceOf.model.Alimento;
import introduction.novidadesJAVA21.instanceOf.model.Eletronico;
import introduction.novidadesJAVA21.instanceOf.model.Produto;

import java.time.LocalDate;

public class Teste {
    /*
    Implemente o método abaixo, utilizando `instanceof` com pattern matching, para calcular os seguintes descontos:
    - para eletronicos:
        - 15% se o produto tiver garantia
        - 10% se o produto não tiver garantia

    - para alimentos:
        - 20% se o produto estiver no mesmo dia da data de validade

    - para qualquer outro tipo de produto, desconto padrao de 5%
     */

    public static Double calcularDesconto(Produto produto) {
        if (produto instanceof Eletronico eletronico) {
            var descontoPorcentagem = eletronico.isGarantia() ? 0.15 : 0.10;
            
            return eletronico.getPreco() * descontoPorcentagem;
            
        } else if (produto instanceof Alimento alimento && alimento.getDataValidade().isEqual(LocalDate.now())) { // verifica de foi instanciado um Alimento E a data de validade é igual(isEqual) hoje (LocalDate.now())
            return alimento.getPreco() * 0.20;
            
        }
        return produto.getPreco() * 0.05;
    }

    public static void main(String[] args) {
        // var geladeira = new Eletronico("Geladeira Brastemp 375L", 3000.0, true); // descomente e comente o debaixo para testar os dois meios // 0.15
        var geladeira = new Eletronico("Geladeira Brastemp 375L", 3000.0, false);  // 0.10
        // var chocolate = new Alimento("Ferrero Roche 12und", 32.0, LocalDate.now()); // data de validade - hoje  // descomente e comente o debaixo para testar os dois meios // 0.20
        var chocolate = new Alimento("Ferrero Roche 12und", 32.0, LocalDate.now().plusDays(2)); // pego a data de hoje e adiciono mais 2 dias // 0.05

        System.out.println("Preço normal: R$" + geladeira.getPreco() + " - Preço com desconto: R$" + (geladeira.getPreco() - calcularDesconto(geladeira)));
        System.out.println("Preço normal: R$" + chocolate.getPreco() + " - Preço com desconto: R$" + (chocolate.getPreco() - calcularDesconto(chocolate)));
    }
}

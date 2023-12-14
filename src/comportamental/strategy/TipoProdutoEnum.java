package comportamental.strategy;

import java.util.Arrays;
import java.util.List;

public enum TipoProdutoEnum {
    ELETRO(0.0, 0.3),
    ELETRONICO(0.0, 0.60),
    VEICULO(0.0, 0.60),
    PRESTACAO_DE_SERVICO(0.0, 0.6);


    private double taxaNacional;
    private double taxaInternacional;

    TipoProdutoEnum(double taxaNacional, double taxaInternacional) {
        this.taxaNacional = taxaNacional;
        this.taxaInternacional = taxaInternacional;
    }

    public double getTaxaNacional() {
        return taxaNacional;
    }



    public double getTaxaInternacional() {
        return taxaInternacional;
    }





}

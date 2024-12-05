package com.example;

public class FabricaPessoaFisica implements FabricaAbstrata{

    @Override
    public Contrato createContrato() {
        return new ContratoPessoaFisica();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPessoaFisica();
    }

}

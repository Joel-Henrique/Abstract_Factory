package com.example;

public class ContratoPessoaFisica implements Contrato{

    @Override
    public String emitir() {
        return "Contrato de pessoa fisica";
    }

}

package com.example;

public class ContratoPessoaJuridica implements Contrato{

    @Override
    public String emitir() {
        return "Contrato de pessoa juridica";
    }

}

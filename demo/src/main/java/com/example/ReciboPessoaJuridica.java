package com.example;

public class ReciboPessoaJuridica implements Recibo{

    @Override
    public String emitir() {
        return "Recibo de pessoa juridica";
    }

}

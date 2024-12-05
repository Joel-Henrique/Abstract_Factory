package com.example;

public class ReciboPessoaFisica implements Recibo{

    @Override
    public String emitir() {
        return "Recibo de pessoa fisica";
    }

}

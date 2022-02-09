package com.dam1;

public class Felino extends  Mamifero implements IPodeNadar{
    @Override
    public void podeCamiñar() {
        super.podeCamiñar();
    }

    @Override
    public void podeNadar() {
        IPodeNadar.super.podeNadar();
    }
}

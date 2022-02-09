package com.dam1;

public class Murciélago extends Mamifero implements IPodeVolar{
    @Override
    public void podeCamiñar() {
        super.podeCamiñar();
    }

    @Override
    public void podeVolar() {
        IPodeVolar.super.podeVolar();
    }
}

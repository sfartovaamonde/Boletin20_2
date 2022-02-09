package com.dam1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Aves aves = new Aves();

        Avestruz avestruz = new Avestruz();
        avestruz.podeCamiñar();

        Mamifero mamifero = new Mamifero();
        mamifero.podeCamiñar();

        Felino felino = new Felino();
        felino.podeCamiñar();
        felino.podeNadar();

        Tigre tigre = new Tigre();
        tigre.podeCamiñar();
        tigre.podeNadar();

        Gato gato = new Gato();
        gato.podeNadar();
        gato.podeCamiñar();

        Murciélago murciélago = new Murciélago();
        murciélago.podeCamiñar();
        murciélago.podeVolar();

        Papagaio papagaio = new Papagaio();
        papagaio.podeCamiñar();
        papagaio.podeVolar();
    }
}

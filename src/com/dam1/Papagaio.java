package com.dam1;

import javax.swing.*;

public class Papagaio extends Aves implements  IPodeCamiñar,IPodeVolar{
    @Override
    public void podeCamiñar() {

    }

    @Override
    public void podeVolar() {
        IPodeVolar.super.podeVolar();
    }
}


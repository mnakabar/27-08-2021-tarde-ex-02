package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        Vaca vaca = new Vaca();
        Gato gato = new Gato();

        System.out.println("\nVamos usar o cachorro");
        cachorro.EmitirSom();
        cachorro.comerAnimal();

        System.out.println("\nVamos usar o gato");
        gato.EmitirSom();
        gato.comerAnimal();

        System.out.println("\nVamos usar a vaca");
        vaca.EmitirSom();
        vaca.comerAnimal();
    }


}

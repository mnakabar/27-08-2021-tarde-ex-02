package com.company;

public abstract class Animal{
    private String Som;

    public Animal(String som){
        this.Som = som;
    }

    public void EmitirSom(){
        System.out.println(this.Som);
    }

    public void comerAnimal(){
        if(this.getClass() == Vaca.class){
            comerHerb();
        }
        else if(this.getClass() == Cachorro.class || this.getClass() == Gato.class){
            comerMeat();
        }
    }

    private void comerMeat(){
        System.out.println("Comendo Carne");
    }

    private void comerHerb(){
        System.out.println("Comendo Planta");
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public Pessoa(){
        this.Habilidades = new ArrayList<String>();
    }

    public String Nome;
    public int Idade;
    public List<String> Habilidades;
}

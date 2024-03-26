package com.example.demo;

public class Occurence {
    private double nombre;
    private final double[] tabNombre = {1,3,4,5,3,6,5,0,4,8};
    private int nbrOccurance;

    public double getNombre() {
        return nombre;
    }

    public void setNombre(double nombre) {
        this.nombre = nombre;
    }

    public int getNbrOccurance() {
        return nbrOccurance;
    }

    public int nbreApparition(){
        int count = 0;
        for(double num: tabNombre){
            if(num == nombre){
                count++;
            }
        }
        return count;
    }
}

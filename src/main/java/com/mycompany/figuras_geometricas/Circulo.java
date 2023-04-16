
package com.mycompany.figuras_geometricas;

public class Circulo {
    
    public Circulo(){
    }

    double setCalcularArea(float radio) {
    return Math.PI*Math.pow(radio,2);
    }

    double setCalcularPerimetro(float radio) {
    return 2*Math.PI*radio;
    }
    }

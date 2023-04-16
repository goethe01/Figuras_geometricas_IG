
package com.mycompany.figuras_geometricas;

public class Cuadrado {
    int lado;
    public Cuadrado() {
    }

    double setCalcularArea(float lado) {
    return lado*lado;
    }

    double setCalcularPerimetro(float lado) {
    return (4*lado);
    }
}

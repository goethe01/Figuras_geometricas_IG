
package com.mycompany.figuras_geometricas;


public class Rectangulo {
    int base; 
    int altura; 
Rectangulo(){
}

double calcularArea(float base, float altura) {
return base * altura;
}

double calcularPerimetro(float base, float altura) {
return (2 * base) + (2 * altura);
}
}
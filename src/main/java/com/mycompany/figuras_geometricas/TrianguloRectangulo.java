
package com.mycompany.figuras_geometricas;

public class TrianguloRectangulo {
    

public TrianguloRectangulo(){
}
int base;
int altura;

public double setCalcularArea(float base, float altura) {
return (base * altura / 2);
}

public double setCalcularPermetro(float base, float altura, double hipotenusa) {
return (base + altura + hipotenusa );
}

public double calcularHipotenusa(float base, float altura) {
return Math.pow(base*base + altura*altura, 0.5);
}

public String setDeterminarTipoTriángulo(float base, float altura, double hipotenusa) {
    if ((base == altura) && (base == hipotenusa) && (altura
    == hipotenusa)){
        return "es un triángulo equilátero";
    }else if ((base != altura) && (base != hipotenusa) &&
    (altura != hipotenusa)){
        return "es un triángulo escaleno";
    }else{
    return "es un triángulo isósceles";
}}
}
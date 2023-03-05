public class Retangulo extends Quadrilatero{
private double ladoA;
private double ladoB;


public Retangulo(double ladoA, double ladoB) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
}

// como possui apenas o construtor que já recebe parâmetros, não será necessário fazer setters

public double getLadoA() {
    return ladoA;
}


public double getLadoB() {
    return ladoB;
}



}

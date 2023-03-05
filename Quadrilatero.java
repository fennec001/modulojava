public abstract class Quadrilatero {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;

    // o construtor vazio é necessario para nao precisarmos implementar o outro
    // construtor na nossa classe filho Retangulo
    public Quadrilatero() {
    }

    public Quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }

}

package Questão34;

public class Complexo {
    private double real;
    private double imag;

    public Complexo() {
        this.real = 0;
        this.imag = 0;
    }

    public Complexo(double real) {
        this.real = real;
        this.imag = 0;
    }

    public Complexo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        if (imag == 0) return real + "";
        if (real == 0) return imag + "i";
        if (imag <  0) return real + " - " + (-imag) + "i";
        return real + " + " + imag + "i";
    }

    public static void main(String[] args) {
        Complexo a = new Complexo(2, 3);
        Complexo b = new Complexo(1, -1);
        Complexo c = new Complexo(4);

        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());
        System.out.println("c = " + c.toString());
    }
}

package proiect.java;

import java.util.Random;

public abstract class BaseGenerator {

    protected int a;
    protected int b;
    protected int n;
    protected Random rand = new Random();

    public abstract int generateNumber();
    
    public abstract String numbersGenerated(int n);
    
    public abstract int functie();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

}

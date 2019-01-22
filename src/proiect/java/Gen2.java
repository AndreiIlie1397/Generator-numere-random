package proiect.java;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Gen2 extends BaseGenerator {

    public Gen2() {
    }

    public Gen2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.rand);
        hash = 79 * hash + this.a;
        hash = 79 * hash + this.b;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gen2 other = (Gen2) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        if (!Objects.equals(this.rand, other.rand)) {
            return false;
        }
        return true;
    }

    @Override
    public int functie() {
        int x = 2;
        return x;
    }

    public int nrPrim(int prim) { //metoda care verifica daca am nr prime in intervalul introdus
        int i, aux = 0;
        String x = null;
        for (i = 1; i <= prim; i++) {
            if (prim % i == 0) {
                aux = aux + 1;
            }
        }
        if (aux == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public int generateNumber() {
        int randInt = ThreadLocalRandom.current().nextInt(a, b + 1);
        return randInt;
    }

    @Override
    public String numbersGenerated(int n) {
        int N = 1, y = 0, i, z = 0, aux = 0, X = 0, r = 0, nr = 1;
        String x = "";
        String Y = "Nu am gasit niciun numar prim in acest interval!";
        int stanga = a;
        int dreapta = b;
        if (stanga == 1) {
            stanga = stanga + 1;
        }
        while (stanga <= dreapta) { //iau fiecare numar incepand cu capatul din stanga si verific daca e prim
            for (i = 1; i <= stanga; i++) {
                if (stanga % i == 0) {
                    aux = aux + 1;
                }
            }
            if (aux == 2) { //am gasit un nr prim
                X = X + 1;
            }
            if (aux != 2) { //nu este nr prim si trec la urmatorul nr
                aux = 0;
            }
            stanga = stanga + 1;
        }
        if (X == 0) { //nu exista niciun nr prim
            return Y;
        }
        if (X != 0) {

            while (nr <= n) {
                int randInt = generateNumber();
                if (nrPrim(randInt) == 1) {
                    x += "" + randInt + "   ";
                    nr = nr + 1;
                }
            }
        }
        return x;
    }
}

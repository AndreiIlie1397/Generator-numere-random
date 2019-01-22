package proiect.java;

import java.util.concurrent.ThreadLocalRandom;

public class Gen3 extends BaseGenerator {

    public Gen3() {
    }

    public Gen3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = (int) (53 * hash + this.a);
        hash = (int) (53 * hash + this.b);
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
        final Gen3 other = (Gen3) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
    }

    @Override
    public int functie() {
        int x = 3;
        return x;
    }

    public String binary(int randInt) {
        int i = 1, rand = randInt, c;
        String x, d = "", d2="";
            while (randInt != 0) {
                c = randInt % 2;
                randInt = randInt / 2;
                d=""+d+c;
            }
           for(int j = d.length()-1; j >= 0; j--) {
                    d2 = d2 + d.charAt(j);
                }
            x = "" + rand + "=" + d2;
        return x;
    }

    @Override
    public int generateNumber() {
        int randInt = ThreadLocalRandom.current().nextInt(a, b + 1);
        return randInt;
    }

    @Override
    public String numbersGenerated(int n) {
        String x = "";
        for (int i = 0; i < n; i++) {
            int randInt = generateNumber();
            x += "" + binary(randInt) + "   ";
        }
        return x;
    }
}

package proiect.java;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Gen1 extends BaseGenerator {

    public Gen1() {
    }

    public Gen1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Gen1 other = (Gen1) obj;
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
    public int functie(){
    int x=1;
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
            x += "" + generateNumber() + "   ";

        }
        return x;
    }

}

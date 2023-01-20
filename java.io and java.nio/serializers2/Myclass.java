package serializers2;

import java.io.Serializable;

public class Myclass implements Serializable {
    String s;
    double d;
    int i;

    public Myclass(String s, double d, int i) {
        this.s = s;
        this.d = d;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Myclass{" +
                "s='" + s + '\'' +
                ", d=" + d +
                ", i=" + i +
                '}';
    }
}

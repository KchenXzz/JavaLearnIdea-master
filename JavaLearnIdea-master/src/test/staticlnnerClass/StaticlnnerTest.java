package test.staticlnnerClass;

public class StaticlnnerTest {
    public static void main(String[] args) {
        var d = new double[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        System.out.println();
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());

    }
}

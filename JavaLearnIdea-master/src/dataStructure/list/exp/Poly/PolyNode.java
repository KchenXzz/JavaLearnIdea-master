package dataStructure.list.exp.Poly;

public class PolyNode {
    private double coe;
    private int index;
    PolyNode next;

    public PolyNode(double coe, int index) {

        this.coe = coe;
        this.index = index;
        this.next = null;
    }

    public PolyNode() {

        this(0, 0);
    }

    public double getCoe() {
        return coe;
    }

    public int getIndex() {
        return index;
    }

    public void setCoe(double coe) {
        this.coe = coe;
    }

}

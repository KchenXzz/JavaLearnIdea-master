package test.generic.pair;

public class PairTest2<T> {
    private T val;

    public PairTest2(){
        val=null;
    }
    public PairTest2(T first){
        this.val=first;
    }

    public void setVal(T newFirst){
        val=newFirst;
    }

    public T getVal(){
        return val;
    }

    public void showVal(){
        System.out.println(val);

    }

}

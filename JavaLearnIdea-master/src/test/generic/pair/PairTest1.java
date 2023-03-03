package test.generic.pair;

public class PairTest1<T> {
    private T first;
    private T secend;

    public PairTest1(){
        first=null;
        secend=null;
    }
    public PairTest1(T first,T secend){
        this.first=first;
        this.secend=secend;
    }
    public void setFirst(T newFirst){
        first=newFirst;
    }
    public void setSecend(T newSecend){
        secend=newSecend;
    }
    public T getFirst(){
        return first;
    }
    public T getSecend(){
        return secend;
    }
    public void showMaxMin(){
        System.out.println(first);
        System.out.println(secend);
    }

}

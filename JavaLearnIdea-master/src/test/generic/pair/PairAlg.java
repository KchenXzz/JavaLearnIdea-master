package test.generic.pair;

public class PairAlg {
    /*
   帮助交换的方法，创建t临时保存第一个元素
   swap里<?>不是类型变量，所以用辅助方法swapHelper 的<T>来临时保存p
   注意，swap不是泛型方法，而swapHelper是泛型方法
   此时swapHelper方法的参数T捕获参数通配符《？》
    */
    public static void swap(PairTest1<?> p){swapHelper(p);}
    public static <T> void swapHelper(PairTest1<T> p){
        T t=p.getFirst();
        p.setFirst(p.getSecend());
        p.setSecend(t);
    }
}

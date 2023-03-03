package test.generic.pair;

public class ArrayAlg {
    /*
    限制T必须是一个实现了Comparable接口的类，这样就能用.compareTo方法
    @这是一个泛型数组求最值得泛型方法
     */
    public static <T extends Comparable> PairTest1<T> minmax(T[] a){
        if(a==null||a.length==0) return null;
        T min=a[0];
        T max=a[0];

        for(int i=0;i<a.length;i++){
            if(min.compareTo(a[i])>0) min=a[i];
            if(max.compareTo(a[i])<0) max=a[i];
        }
        return new PairTest1<>(min,max);
    }

    /*
    qiu zui xiao zhi
     */
    public static <T extends Comparable> PairTest2<T> min(T[] a){
        if(a==null||a.length==0) return null;
        T min=a[0];
        for(int i=0;i< a.length;i++){
            if(min.compareTo(a[i])>0) min=a[i];
        }
        return new PairTest2<>(min);
    }
}

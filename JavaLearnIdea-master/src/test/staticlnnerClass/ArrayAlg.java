package test.staticlnnerClass;

public class ArrayAlg {
    /*
    一对浮点数
     */
    public static class Pair{
        private double first;
        private double second;
        /*
        接收外部参数
         */
        public Pair(double f,double s){
            first=f;
            second=s;
        }
        /*
        得到最值的两个方法
         */
        public double getFirst() {
            return first;
        }
        public double getSecond(){
            return  second;
        }
    }
    /*

     */
    public static Pair minmax(double[] val){
        double min=Double.POSITIVE_INFINITY;
        double max=Double.POSITIVE_INFINITY;
        for(double v:val){
            if(max<v) max=v;
            if(min>v) min=v;
        }
        return new Pair(max,min);
    }
}

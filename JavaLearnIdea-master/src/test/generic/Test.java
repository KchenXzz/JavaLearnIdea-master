package test.generic;

import test.generic.pair.ArrayAlg;
import test.generic.pair.PairTest1;

public class Test {
    public static void main(String[]args){
        String[] words={"wuhu","qifei","haha","aaaa","zzzz"};
       PairTest1<String> m= ArrayAlg.minmax(words);
       m.showMaxMin();



    }
}

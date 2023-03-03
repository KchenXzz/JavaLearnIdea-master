package test.generic.pair;

import horstmann.corejava.Employee;
import horstmann.corejava.Manager;

public class PairTest3 {
    public static void main(String[]args){
        var ceo=new Manager("Gu",80000,2003,9,12);
        var cfo=new Manager("Se",50000,2014,11,11);
        var buddies=new PairTest1<Employee>(ceo,cfo);
        printBuddies(buddies);
        ceo.setBonus(500000);
        cfo.setBonus(200000);
        Manager[] managers={ceo,cfo};

        var result=new PairTest1<Employee>();
        minmaxBonus(managers,result);
        System.out.println(
                "First:"+result.getFirst().getName()
                +" Secend:"+result.getSecend().getName()
        );
        maxminBouns(managers,result);
        System.out.println(
                "First:"+result.getFirst().getName()
                +" Second:"+result.getSecend().getName()
        );



    }
    public static void printBuddies(PairTest1<?extends Employee> p){
        Employee first=p.getFirst();
        Employee second=p.getSecend();
        System.out.println(first.getName()+"and"+second.getName()+" are buddfies.");
    }

    public static void minmaxBonus(Manager[] a,PairTest1<? super Manager> result){
        if(a.length==0) return;
        Manager min=a[0];
        Manager max=a[0];
        for(int i=1;i<a.length;i++){
            if(min.getBonus()>a[i].getBonus()) min=a[i];
            if(max.getBonus()<a[i].getBonus()) max=a[i];
        }
        result.setFirst(min);
        result.setSecend(max);
    }
    public static void maxminBouns(Manager[] a,PairTest1<?super Manager> result){
        minmaxBonus(a,result);
        PairAlg.swap(result);
    }
}


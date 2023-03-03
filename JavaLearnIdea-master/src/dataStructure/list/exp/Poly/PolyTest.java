package dataStructure.list.exp.Poly;

public class PolyTest {
    public static void main(String[] args) {


        PolyList l1 = new PolyList();
        PolyList l2 = new PolyList();
        var n1=new PolyNode(1,1);
        var n2=new PolyNode(1,1);
        var n3=new PolyNode(1,1);
        var n4=new PolyNode(0,0);
        var m1=new PolyNode(1,1);
        var m2=new PolyNode(1,1);
        var m3=new PolyNode(1,1);
        var m4=new PolyNode(0,0);
        l1.insert(n1);
        l1.insert(n2);
        l1.insert(n3);
        l1.insert(n4);
        l2.insert(m1);
        l2.insert(m2);
        l2.insert(m3);
        l2.insert(m4);
        //7+3x+9X^8+5X^17
        //8X+22x^7-9X^8
        //7.0 + 11.0x + 22.0x^7 + 5.0x^17
        //7.0 + 11.0x + 22.0x^7 + 5.0x^17
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("多项式l1的项数：");
        int size=sc.nextInt();
        System.out.println("依次输入多项式各项");
        for(int i=1;i<size;i++){
            System.out.println("多项式第"+i+"项的系数和指数");
            l1.insert(new PolyNode(sc.nextFloat(),sc.nextInt()));
        }
        System.out.println("多项式l1为："+l1);
        System.out.println("多项式l2的项数：");
        size=sc.nextInt();
        System.out.println("依次输入多项式各项");
        for(int i=1;i<size;i++){
            System.out.println("多项式第"+i+"项的系数和指数");
            l2.insert(new PolyNode(sc.nextFloat(),sc.nextInt()));
        }
         */
        PolyList l3=new PolyList();
        l3=PolyList.add(l1,l2);
        System.out.println("多项式l1为： "+l1);
        System.out.println("多项式l2为： "+l2);
        System.out.println("求和        "+l3);
        System.out.println();


    }

}





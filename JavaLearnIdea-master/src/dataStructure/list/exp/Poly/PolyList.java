package dataStructure.list.exp.Poly;

public class PolyList{
    PolyNode head;
    PolyNode current;

    public PolyList(){
        head=new PolyNode();
        current=head;
        head.next=null;
    }
    //是否为空
    public boolean isEmpty(){
        return head.next==null;
    }
    //这里只考虑按顺序插入元素
    public void insert(PolyNode node){
        current.next=node;
        current=node;
    }
    //打印多项式
    public String toString(){

        StringBuilder s=new StringBuilder();
        StringBuilder a=new StringBuilder();
        StringBuilder i=new StringBuilder();
        StringBuilder theOne=new StringBuilder();
        current=head.next;
        int count1=0;
        int count2=0;
        while(current!=null){
            if(current.getCoe() == 0){
                count1++;
            }
            count2++;
            current = current.next;
        }
        if(count1 == count2){
            s.append("0");
        }else{

            current=head.next;
            while(current!=null){

                a.delete(0, a.length());
                i.delete(0, i.length());
                theOne.delete(0, theOne.length());

                if((current.getCoe()==1 || current.getCoe()==-1) && current.getIndex()!=0) {
                }
                else if(current.getCoe() < 0){
                    a.append(-current.getCoe());
                }else{
                    a.append(current.getCoe());
                }

                if(current.getIndex()==1)
                {
                    theOne.append(a).append("x").append(i);
                } else if(current.getIndex()==0){
                    theOne.append(a);
                } else{
                    i.append(current.getIndex());
                    theOne.append(a).append("x^").append(i);
                }

                if(current.getCoe() == 0){
                }else{
                    if(current==head.next && current.getCoe()<0){
                        s.append("-").append(theOne);
                    }else if(current==head.next && current.getCoe()>0){
                        s.append(theOne);
                    }
                    else if(current.getCoe() < 0){
                        s.append(" - ").append(theOne);
                    }else
                        s.append(" + ").append(theOne);
                }

                current = current.next;
            }
        }
        return s.toString();
    }

    //加法运算
    public static PolyList add(PolyList p1,PolyList p2){
        //新表
        PolyList result=new PolyList();
        //分别指向p1 p2的第一个元素
        p1.current=p1.head.next;
        p2.current=p2.head.next;
        //p1p2指向的元素都不为空，也就是这两个链表都没到头
        while(p1.current!=null && p2.current!=null){
            //如果指向的元素的指数相等
            if(p1.current.getIndex()==p2.current.getIndex()){
                //就把这两个元素系数相加，指数任取其一，放到新链表内
                result.insert(new PolyNode(p1.current.getCoe()+p2.current.getCoe(),p1.current.getIndex()));
                //p1p2都指向下一元素
                p1.current=p1.current.next;
                p2.current=p2.current.next;
            }//指向元素不相等时
            else
                //如果p1指数小于P2指数
                if(p1.current.getIndex()<p2.current.getIndex()){
                    //让p1所指元素放到新链表
                    result.insert(p1.current);
                    //p1指向下一个
                    p1.current=p1.current.next;

            }//反之，即p1>p2指数
             else{
                 //让p2指的元素放到新表
                 result.insert(p2.current);
                 //p2指向下一个
                 p2.current=p2.current.next;
            }
        }
        //当其中一个表遍历到头
        //当p1还没到头
        while(p1.current!=null){
            //让p1剩下的元素接到新表
            result.insert(p1.current);
            //循环一个一个接到新表
            p1.current=p1.current.next;
        }
        //P2同上
        while(p2.current!=null){
            result.insert(p2.current);
            p2.current=p2.current.next;
        }
        result.current=result.head.next;
        PolyNode tempPrevious=result.current;
        PolyNode temp=result.current.next;
        return getPolyList(result, tempPrevious, temp);
    }

   //求和或者乘法会出现 2.0x + 2.0x + 2.0x
   // 合并系数变成 6.0x
    private static PolyList getPolyList(PolyList result, PolyNode tempPrevious, PolyNode temp) {
        while(result.current.next!=null){
            while(temp!=null)
            {
                if(temp.getIndex()!=result.current.getIndex())
                {
                    temp=temp.next;
                    tempPrevious=tempPrevious.next;
                }else{
                    result.current.setCoe(result.current.getCoe()+temp.getCoe());
                    tempPrevious.next=temp.next;
                    temp=temp.next;
                }
            }
            result.current=result.current.next;
            tempPrevious=result.current;
            temp=result.current.next;
        }
        return result;
    }

    //减法运算
    public static PolyList sub(PolyList p1,PolyList p2){


        PolyList result=new PolyList();

        p2.current = p2.head.next;
        while(p2.current!=null){
            p2.current.setCoe(-(p2.current.getCoe()));
            p2.current=p2.current.next;
        }
        //System.out.println(p2.printS());
        //分别指向p1 p2的第一个元素
        p1.current=p1.head.next;
        p2.current=p2.head.next;
        while(p1.current!=null && p2.current!=null){

            if(p1.current.getIndex()==p2.current.getIndex()){


                result.insert(new PolyNode(p1.current.getCoe()+p2.current.getCoe(),p1.current.getIndex()));
                p1.current=p1.current.next;
                p2.current=p2.current.next;
            }
            else if(p1.current.getIndex()<p2.current.getIndex()){

                result.insert(p1.current);
                p1.current=p1.current.next;

            }else{
                result.insert(p2.current);
                p2.current=p2.current.next;
            }
        }
        while(p1.current!=null){

            result.insert(p1.current);
            p1.current=p1.current.next;
        }
        while(p2.current!=null){

            result.insert(p2.current);
            p2.current=p2.current.next;
        }
        return result;

    }
    //乘法运算
    public static PolyList multiply(PolyList p1,PolyList p2){

        PolyList result=new PolyList();
        //分别指向p1 p2的第一个元素
        p1.current=p1.head.next;
        p2.current=p2.head.next;
        while(p1.current!=null){

            while(p2.current!=null)
            {
                double a=p1.current.getCoe()*p2.current.getCoe();
                int i=p1.current.getIndex()+p2.current.getIndex();
                result.insert(new PolyNode(a,i));
                p2.current=p2.current.next;
            }
            p1.current=p1.current.next;
            p2.current=p2.head.next;
        }
        //合并同类项
        result.current=result.head.next;
        PolyNode tempPrevious=result.current;
        PolyNode temp=result.current.next;
        PolyNode t = result.current.next;
        return getPolyList(result, tempPrevious, temp);
    }
    //就地逆置单链表
    public static void reverse(PolyList p_){
        PolyNode p,q;
        p = p_.head.next;
        p_.head.next = null;

        while(p!=null){
            q = p.next;
            p.next = p_.head.next;//让p.next变成p_.head.next;
            p_.head.next = p;//让p_.head.next变成p;
            p = q;//让p变成q;
        }
    }
}





package test.collections;

import java.util.*;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/20 18:27
 */
public class CollectionsTest1 {
    public static void main(String[] args) {

        ArrayList<Integer> strList = new ArrayList<>();

        //批量添加
        Collections.addAll(strList,1,2,3,4,5,6,7);
        strList.forEach(s -> System.out.print(s+" "));
        System.out.println();

        //打乱集合
        Collections.shuffle(strList);
        strList.forEach(s -> System.out.print(s+" "));
        System.out.println();

        //对集合排序（默认升序排序）
        Collections.sort(strList);
        strList.forEach(s -> System.out.print(s+" "));
        System.out.println();


        //对集合按照comparator接口实现自定义排序
        Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
        Collections.sort(strList, comparator);
        strList.forEach(s -> System.out.print(s+" "));
        System.out.println();

        //要对按照指定排序规则的列表使用Collections.binarySearch()方法，就要传入同样规则的比较器
        System.out.println(Collections.binarySearch(strList,2, comparator));



        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(new Integer[strList.size()]));

        //复制到arrayList
        Collections.copy(arrayList, strList);
        System.out.println(arrayList.size());
        System.out.println(strList);

        LinkedList<Integer> linkList = new LinkedList<>(Arrays.asList(new Integer[strList.size()+5]));
        //复制到linkList
        Collections.copy(linkList, strList);
        System.out.println(linkList.size());
        System.out.println(strList);


        //填充他,会全部覆盖
        Collections.fill(linkList,100);
        System.out.println(strList);


        //取最大值
        System.out.println(Collections.max(strList));
        System.out.println(Collections.min(strList));


        //交换集合中指定位置的元素
        System.out.println(strList);//[7, 6, 5, 4, 3, 2, 1]
        Collections.swap(strList,0,6);//ij都是索引
        System.out.println(strList);


    }
}

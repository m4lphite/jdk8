package lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author Malphite
 * @date 2022/06/28 00:08
 **/


/*
* Lambda衣达灯岁
1.举例：(o1,o2)->Integer.compare(o1,o2),
2.格式：
->:Lambda操作符或箭头操作弑
->左边：Lambda形参列表（其实就是接口中的抽象方法的形参列表）
->右边：Lambda体（其实就是重写的茄象方法的方法体）
*   3、 无参数  无返回值
*       有参数（写明参数类型）  无返回值
*       有参数（不写类型）  无返回值
*        只有一个参数，括号可以省略
*       多个参数，多条执行语句，有返回值
* 4、可以把lambda理解成接口的实现类
* */

public class Lambda01 {

    @Test
    public void test01(){
        //8之前
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        //8 lambda
        Runnable runnable1 =  () ->{

        };

        //8 lambda
        Runnable runnable2 = () -> System.out.println("");
    }


    @Test
    public void test02(){

        //8之前写法
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };

        //8写法
        System.out.println(comparator.compare(11,12));
        System.out.println("lambda++++++++++++++++++++");
        Comparator<Integer> comparator1 = (o1,o2)->{
            return o1 -o2;
        };
        System.out.println(comparator1.compare(12,11));

        //8写法
        System.out.println("lambda++++++++++++++++++++");
        Comparator<Integer> comparator3 = (o1,o2)->Integer.compare(o1,o2);

        //8方法引用写法
        System.out.println("lambda++++++++++++++++++++");
        System.out.println("方法引用");
        Comparator<Integer> comparator2 = Integer :: compare;

    }


}

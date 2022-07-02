package function;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 消费型
 * 供给性
 * 函数型
 * 断定型
 *
 * @author Malphite
 * @date 2022/06/28 21:21
 **/
public class TestFunction {

    // 消费型函数式接口
    @Test
    public void test01(){

        System.out.println("方式一");
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("价格为：" + aDouble);
            }
        });

        System.out.println("方式二");
        happyTime(500, (money)-> System.out.println("价格为:"+ money));
    }

    @Test
    public void test02(){

        List<String> strings = new ArrayList<>();
        strings.add("i");
        strings.add("i");
        strings.add("i");
        strings.add("j");
        filterString(strings,(s)-> s.equals("i"));

    }


    //方法引用
    //方法引用 对象：：非静态方法
    //方法引用 类：：静态方法
    //方法引用 类：：非静态方法

    @Test
    public void test03(){
        //lambda
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("北京");
        System.out.println("********************************");

        PrintStream out = System.out;
        Consumer<String> consumer1 = out :: println;
        consumer1.accept("上海");
    }

    @Test
    public void test04(){
        Supplier<String> supplier = ()-> "";
    }

    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }


    public List<String> filterString(List<String> s, Predicate<String> predicate){

        ArrayList<String> strings = new ArrayList<>();
        for (String s1 : s){
            if (predicate.test(s1)){
                strings.add(s1);
            }
        }
        return strings;

    }

    public static void main(String[] args) {

        MyInterface myInterface = ()-> System.out.println("你好");
        myInterface.call();
    }

}

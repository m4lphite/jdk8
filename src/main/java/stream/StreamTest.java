package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * @author Malphite
 * @date 2022/06/30 22:00
 **/
public class StreamTest {

    @Test
    public void test01(){

        //无限流  如果不用limit，会生成无数条数据
        //Stream.iterate(0 ,o->o+2).forEach(System.out::println);
        Stream.iterate(0 ,o->o+2).limit(10).forEach(System.out::println);

        Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);

        //limit

        //skip

        //filter


        //distinct 去重 根据hashcode和equals
    }

    //映射
    @Test
    public void test02(){

        //map(Function f)一接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会
        List<String> strings = new ArrayList<>();
        strings.add("aa");
        strings.add("bb");
        strings.add("cc");
        strings.add("dd");
        //通过map将小写转大写
        strings.stream().map(s -> s.toUpperCase(Locale.ROOT)).forEach(System.out::println);

        //fLatMap(Function f)一接收一个函数作为参数，将流中的每个值都换成另一个流,然后把所有流换成一个流


        //sort() 排序

    }

    //终止操作
    @Test
    public void test03(){
        //
        //dev修改
    }

}

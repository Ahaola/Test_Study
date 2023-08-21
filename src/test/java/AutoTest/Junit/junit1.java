package AutoTest.Junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class junit1 {
    public static Stream<Arguments> demo1() {
        return Stream.of(Arguments.arguments(1,"xiaohei"),
        Arguments.arguments(2,"xiaobai"),
        Arguments.arguments(3,"xiaohui"));
    }

    @Test
    void fun1(){
        System.out.println("这是添加注解的自动化代码，Test表示这是一个自动化用例");
    }

    @Disabled
    void fun2(){
        System.out.println("这是忽略方法的注解，即会跳过这个方法，执行其他注解下的方法");
    }

    @BeforeAll
    static void fun3(){
        System.out.println("BeforeAll在所有测试用例执行之前跑对应的方法");
    }

    @AfterAll
    static void fun4(){
        System.out.println("AfterAll在所有测试用例执行之后跑对应的方法");
    }

    @BeforeEach
    void fun5(){
        System.out.println("BeforeEach在每一个测试用例执行之前跑对应的方法");
    }

    @AfterEach
    void fun6(){
        System.out.println("AfterEach在每一个测试用例执行之后跑对应的方法");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void fun7(int num){
        System.out.println(num);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","2","3"})
    void fun8(String number){
        System.out.println(number);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test.csv")
    void fun9(String name){
        System.out.println(name);
    }

    //多种数据类型
    @ParameterizedTest //ParameterizedTest注解不可以和@Test注解一起使用，不然ParameterizedTest会失效
    @MethodSource("demo1")
    void dun10(int num,String name){
        System.out.println(name+":"+name);
    }
}

package com.zhuwuhui.utils;

import com.zhuwuhui.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("猪无悔", "小福贵", "小四喜");
        list.add("段云卿");
        System.out.println(list);
        System.out.println(123);
        System.out.println(123);
        System.out.println(999);
        System.out.println(999);

        Context contextA = new Context(new ConcreteStrategyA());
        contextA.ContextInterface();
        Context contextB = new Context(new ConcreteStrategyB());
        contextB.ContextInterface();
        Context contextC = new Context(new ConcreteStrategyC());
        contextC.ContextInterface();
    }
}

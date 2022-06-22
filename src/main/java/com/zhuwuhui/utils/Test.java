package com.zhuwuhui.utils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class Test {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("猪无悔", "小福贵", "小四喜");
        list.add("段云卿");
        System.out.println(list);
    }
}
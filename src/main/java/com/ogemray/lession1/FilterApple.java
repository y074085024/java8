package com.ogemray.lession1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yxl
 * @Date 2018/6/24
 */
public class FilterApple {

    private static List<Apple> findGreenList(List<Apple> storeList){
        List<Apple> list = new ArrayList<>();
        for (Apple a:storeList
             ) {
            if(a.getColor().equals("green")){
                list.add(a);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple("green",150L),
                new Apple("red",200L),
                new Apple("green",120L)
        );
        List<Apple> greenList = findGreenList(list);
        System.out.println(greenList);
    }
}

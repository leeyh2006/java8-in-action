package ch06.src;

import ch04.src.Dish;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Name:ex_6_1
 * Desc :
 * Developer :82108
 * Date : 2019-06-09
 * Time : 오후 5:11
 */
public class ex_6_1 {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish(800,"prok",false, Dish.Type.MEAT),
                new Dish(700,"p5ok",false, Dish.Type.MEAT),
                new Dish(600,"p3ok",false, Dish.Type.MEAT),
                new Dish(400,"te",false, Dish.Type.OTHER),
                new Dish(200,"fish",false, Dish.Type.FISH)
        );

        IntSummaryStatistics menuStatics = menu.stream().collect(Collectors.summarizingInt(i->i.getCalories()));

        System.out.println(menuStatics);

        Comparator<Dish> dishCaloriesComparator =
                Comparator.comparingInt(i->i.getCalories());
        Optional<Dish> mostCalorieDish =menu.stream().collect(Collectors.maxBy((dishCaloriesComparator)));

        int totalCalories = menu.stream().collect(Collectors.summingInt(i->i.getCalories()));

        System.out.println(totalCalories);

//        String shortMenu = menu.stream().map(i->i.getName()).collect(Collectors.joining(","));

        String shortMenu = menu.stream().map(i->i.getName()).collect(Collectors.reducing((i,j)->i+j)).get();



                System.out.println(shortMenu);
    }


}

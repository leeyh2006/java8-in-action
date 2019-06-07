package ch04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Name:Ch4
 * Desc :
 * Developer :82108
 * Date : 2019-06-07
 * Time : 오후 7:28
 */
public class Ch4 {
    public static void main(String[] args) {


        List<Dish> menu = Arrays.asList(
                new Dish(800,"prok",false, Dish.Type.MEAT),
                new Dish(700,"p5ok",false, Dish.Type.MEAT),
                new Dish(600,"p3ok",false, Dish.Type.MEAT),
                new Dish(400,"te",false, Dish.Type.OTHER),
                new Dish(200,"fish",false, Dish.Type.FISH)
        );

        List<String> threeHighCalroricDishNames=menu.stream()
                .filter(d->d.getCalrories()>300)
                .map(d->d.getName())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(threeHighCalroricDishNames);
    }
}

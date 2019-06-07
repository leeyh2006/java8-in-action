package ch05.quiz;

import ch04.src.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish(800,"prok",false, Dish.Type.MEAT),
                new Dish(700,"p5ok",false, Dish.Type.MEAT),
                new Dish(600,"p3ok",false, Dish.Type.MEAT),
                new Dish(400,"te",false, Dish.Type.OTHER),
                new Dish(200,"fish",false, Dish.Type.FISH)
        );
        List<Dish> vegetarianDishes = menu
                .stream()
                .filter(new Predicate<Dish>() {
                    @Override
                    public boolean test(Dish dish) {
                        return dish.isVegetarian();
                    }
                })
                .collect(Collectors.toList());

        List<Dish> dishes =menu
                .stream()
                .filter(i->i.getType().equals(Dish.Type.MEAT))
                .limit(2)
                .collect(Collectors.toList());

        List<String> dishNames = menu.stream()
                .map(d->d.getName())
                .collect(Collectors.toList());


        List<String> words = Arrays.asList("java8","lamdas","in");


        List<String> uniqueCharacters =
                words.stream()
                .map(w->w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        String [] arrayOfWords = {"goodBye","world"};
        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);

        List<Integer> numbers =Arrays.asList(1,2,1,3,3,2,4);
        numbers.stream()
                .filter(i->i%2==0)
                .distinct()
                .limit(2)
                .forEach(i-> System.out.println(i));

        if(menu.stream().anyMatch(i->i.isVegetarian())){
            System.out.println("haha");
        }

        int sum = numbers.stream().reduce(0 ,(a,b)->a+b);



        int calories = menu.stream()
                .mapToInt(i->i.getCalories())
                .sum();

        System.out.println(sum);


        Optional<Integer> max = numbers.stream().reduce((a,b)-> a+b);

        System.out.println(max);

        Stream.iterate(0,n->n+2)
                .limit(10)
                .forEach(System.out::println);

    }
}

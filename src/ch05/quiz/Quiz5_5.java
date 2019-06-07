package ch05.quiz;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Name:Quiz5_5
 * Desc :
 * Developer :82108
 * Date : 2019-06-07
 * Time : 오후 10:18
 */
public class Quiz5_5 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");


        List<Transaction> transactionList = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );


        // ex1
        List<Transaction> orderUp = transactionList.stream()
                .filter(i->i.getYear()==2011)
                .sorted(((o1, o2) -> o1.getValue()))
                .collect(Collectors.toList());

        orderUp.stream().
                forEach(transaction -> System.out.println(transaction.getTrader().toString()));

        //ex2
        List<String> workerList = transactionList
                .stream()
                .map(i->i.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        //ex3
        Set<String> nameOrder = transactionList
                .stream()
                .filter(i->i.getTrader().getCity().equals("Cambridge"))
                .map(i->i.getTrader().getName())
                .collect(Collectors.toSet());

        //ex4
        List<String> allWorker = transactionList
                .stream()
                .map(i->i.getTrader().getName())
                .sorted()
                .collect(Collectors.toList());

        //ex5
        boolean isExist = transactionList
                .stream()
                .anyMatch(i->i.getTrader().getCity() =="Milan");

        //ex6
        List<Integer> value = transactionList
                .stream()
                .filter(i->i.getTrader().getCity().equals("Cambridge"))
                .map(i->i.getValue())
                .collect(Collectors.toList());

        //ex7
        Optional<Integer> maxValue = transactionList
                .stream()
                .map(i->i.getValue())
                .reduce(Integer::max);

        //ex8
        Optional<Integer> min = transactionList
                .stream()
                .map(i->i.getValue())
                .reduce((a,b)->a<b ? a:b);

        System.out.println(maxValue.get());

        System.out.println(min.get());

    }

}

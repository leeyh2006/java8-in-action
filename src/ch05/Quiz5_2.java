package ch05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Name:Quiz5_2
 * Desc :
 * Developer :82108
 * Date : 2019-06-07
 * Time : 오후 9:26
 */
public class Quiz5_2 {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> result = numList.stream()
                .map(i-> i*i)
                .collect(Collectors.toList());

        System.out.println(result);

        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2= Arrays.asList(3,4);

        List<int[]> pairs =
                numbers1.stream()
                .flatMap(i-> numbers2.stream()
                        .filter(j->(i+j)%3==0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());




    }
}

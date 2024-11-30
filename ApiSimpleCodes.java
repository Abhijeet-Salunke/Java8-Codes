package JavaCodes;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ApiSimpleCodes {
    public static void main(String[] args) {
        //1 Integer Stream
        IntStream
                .range(1,10)
                .forEach(x->System.out.print(x + " "));
        System.out.println();

        //2 Integer Stream with SKIP operation
        IntStream
                .range(1,10)
                .skip(3)
                .forEach(x->System.out.print(x + " "));
        System.out.println();

        //3 Integer Stream with SUM
        System.out.println(
                IntStream
                        .range(1,10)
                        .sum()
        );

        //4. "stream.Of" sort and findFirst
        Stream.of("Ava","Abi","Avi")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);
        System.out.println();

        //5 Stream  from ARRAY, SORT, FILTER and print
        String [] names = {"Sushant","Raj","Rohan","Suraj","Bhushan","Abhi","kunal","Tejas","Pavan"};
        Arrays.stream(names)
                .filter(x->x.startsWith("S"))
                .sorted()
                .forEach(x -> System.out.print(x + " "));
//                .forEach(System.out::print);
        System.out.println();

        //6 Average of integer SQUARE
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x-> x * x)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        //7 Stream from LIST FILTER,SORT
        List<String> friends = Arrays.asList("Sushant","Raj","Rohan","Suraj","Bhushan","Abhi","kunal","Tejas","Pavan");
        friends.stream()
                .map(String::toUpperCase) //.toLowerCase()
                .filter(x->x.endsWith("N")) // .startsWith("a")
                .forEach(System.out::println);
        System.out.println();

        //8. Reduction - SUM
        double total = Stream.of(7.3, 1.5, 2.2)
                .reduce(0.0, (Double a, Double b) -> a + b);//0.0 is starting and is running and b is current.
        // That is now   is 0.0 and b is 7.3
        System.out.println("Total = " + total);
        System.out.println();

        //9. Reduction - Summary Statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);
        System.out.println();
    }
}
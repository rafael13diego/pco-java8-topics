package Java8.Streams.AE;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EjemploStreamRange {

    public static void main(String[] args) {

        IntStream num = IntStream.range(5, 10)
                .peek(System.out::println);

        //Integer resultado = nombres.reduce(0, (a,b) -> a+ b);
        //Integer resultado = num.sum();
        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: "+stats.getMax());
        System.out.println("min: "+stats.getMin());
        System.out.println("prom: "+stats.getAverage());
        System.out.println("total: "+stats.getCount());




    }
    




}

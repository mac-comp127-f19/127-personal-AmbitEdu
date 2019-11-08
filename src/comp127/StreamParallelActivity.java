package comp127;

import com.sun.security.jgss.GSSUtil;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamParallelActivity {

    private static final long N = 10_000_000L;
    private static long calibrationTime = 0L;

    public static long sequentialSum(long n) {
        calibrate();
        long start = System.nanoTime();
        long val =  Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start - calibrationTime));
        return val;
    }

    public static long parallelSequentialSum(long n) {
        calibrate();
        long start = System.nanoTime();
        long val = Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start - calibrationTime));
        return val;
    }

    public static void print() {
        Stream.iterate(1, i -> i + 1)
                .limit(20)
                .forEach(d -> System.out.print(" " + d));
        System.out.println();
    }

    public static void calibrate() {
        long start = System.nanoTime();
        long end = System.nanoTime();
        calibrationTime = end - start;
        System.out.println("calibrationTime: " + calibrationTime);
    }

    public static void parallelPrint() {
        Stream.iterate(1, i -> i + 1)
                .limit(20)
                .parallel()
                .forEach(d -> System.out.print(" " + d));
        System.out.println();
    }

    public static long total = 0;
    public static void add(long value) { total += value; }

    public static long sideEffectSum(long n) {
        total = 0;
        LongStream.rangeClosed(1, n)
                .parallel()
                .forEach(StreamParallelActivity::add);
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sequentialSum(N));
        System.out.println(parallelSequentialSum(N));
        print();
        parallelPrint();
        System.out.println("Test of a modification to the inspection profile of IntelliJ, to see if I understand what's going on. It seems that I do.");
        for(int i = 0; i < 15; i++) {
            System.out.println(sideEffectSum(50));
        }
    }
}

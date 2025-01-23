package de.telran.fibonacci;

import java.util.stream.Stream;

public class FibonacciRecur_Stream {
    public static long fibRec(int index) {
        if (index == 0) {
            return 0;
        }
        return index == 1 || index == 2 ? 1 : fibRec(index - 1) + fibRec(index - 2);
    }

    public static long fibStream(int index) {
        var result =
                Stream.iterate(new long[]{0, 1}, arr ->
                                new long[]{arr[1], arr[0] + arr[1]})
                        .limit(index + 1)
                        .map(y -> y[0])
                        .max(Long::compareTo);
        return result.orElseThrow(IllegalAccessError::new);
    }

    public static void main(String[] args) {
        int n = 10;
        long FtimeRec = System.currentTimeMillis();
        System.out.println(fibRec(n));
        long FtimeRecEnd = System.currentTimeMillis() - FtimeRec;
        System.out.println("fibRec time = " + FtimeRecEnd);

        long FtimeS = System.currentTimeMillis();
        System.out.println(fibStream(n));
        long FtimeStreamEnd = System.currentTimeMillis() - FtimeS;
        System.out.println("fibStream time = " + FtimeStreamEnd);
    }
}

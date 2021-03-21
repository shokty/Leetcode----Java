package EZ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class readBinaryWatch {
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(2));
    }

    static List r = new LinkedList();

    public static List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
        return times;
    }
}

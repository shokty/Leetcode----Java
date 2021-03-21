package EZ;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class frequencySort {
    private static frequencySort.intstring intstring;

    public static void main(String[] args) {
        System.out.println(soul("tree"));
    }
    public static String soul(String s){
        String answear = "";
        HashMap<Character,Integer> mymap = new HashMap<>();
        for (char curr: s.toCharArray()){
            mymap.putIfAbsent(curr,0);
            mymap.replace(curr,mymap.get(curr)+1);
        }

        PriorityQueue<intstring> maxHeap = new PriorityQueue<>(Comparator.comparingInt((intstring k)->(k.number)).reversed());
        for (Map.Entry<Character, Integer> entry : mymap.entrySet()) {
            String toadd = entry.getKey().toString();
            maxHeap.add(new intstring(entry.getValue(),toadd.repeat(entry.getValue())));
        }

        while (!maxHeap.isEmpty())
            answear = answear + maxHeap.poll().string;
        return answear;
        };

    public static class intstring {
        public int number = 0;
        public String string ;
        public intstring(int _number,String _string){
            number = _number;
            string = _string;
        }
    }


}



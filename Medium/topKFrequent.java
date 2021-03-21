package Medium;

import java.util.*;

public class topKFrequent {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> myhash = new HashMap();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingInt((int s[])->(s[1])).reversed());
        int num;
        for (int i = 0; i < nums.length; i++) {
            if (myhash.containsKey(nums[i])) {
                num = myhash.get(nums[i]) + 1;
                myhash.replace(nums[i], num);
            } else
                myhash.put(nums[i], 1);
        }
        Iterator hmIterator = myhash.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int[] marks = new int[] {(int)mapElement.getKey(),(int)mapElement.getValue()};
            maxHeap.add(marks);
        }

        int[] returnv = new int[k];
        for (int i = 0; i < k; i++) {
            returnv[i] = maxHeap.poll()[0];
        }

        return returnv;
    }
}

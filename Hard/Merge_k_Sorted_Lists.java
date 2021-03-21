package Hard;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;


public class Merge_k_Sorted_Lists {
    public static void main(String[] args) {
        PriorityQueue<int[]> minHeap = new PriorityQueue(Comparator.comparingInt((int s[])->(s[0])));
        ListNode link1 = new ListNode(1,new ListNode(4,new ListNode(5)));
        ListNode link2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode link3 = new ListNode(2,new ListNode(6));
        ListNode arr[] = new ListNode[3];
        arr[0] = link1;
        arr[1] = link2;
        arr[2] = link3;
        mergeKLists(arr);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode rvalue = new ListNode();
        ListNode temp = rvalue;
        PriorityQueue<int[]> minHeap = new PriorityQueue(Comparator.comparingInt((int s[])->(s[0])));
        for (int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
                minHeap.add(new int[]{lists[i].val, i});
                lists[i] = lists[i].next;
            }
        }

        int[] currmin;
        int i;
        while (!minHeap.isEmpty()) {
            currmin = minHeap.poll();
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = currmin[0];
            i = currmin[1];
            if (lists[i] != null){
                minHeap.add(new int[] {lists[i].val,i});
                lists[i] = lists[i].next;
            }
        }
        return rvalue.next;
    }
}

import java.util.*;
class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // create a deque
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.size(); i++) {
            dq.add(arr.get(i)); // insert into deque
        }
        return dq;
    }
}

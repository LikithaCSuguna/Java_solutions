class Solution {
    static Stack<Integer> deleteMid(int n, Stack<Integer> st) {
        delete(st, n / 2);
        return st;
    }
    static void delete(Stack<Integer> st, int k) {
        if (k == 0) {
            st.pop();
            return;
        }
        int temp = st.pop();
        delete(st, k - 1);
        st.push(temp);
    }
}

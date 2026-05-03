class Solution {
    public static String concatenateStrings(ArrayList<String> arr) {
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }
        return result.toString();
    }
}

package sdeSheetQues;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] arr, int n) {
        StringBuilder sb = new StringBuilder(arr[0]);
        for(int i=1; i<n; i++) {
            while(arr[i].indexOf(sb.toString()) != 0) {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}

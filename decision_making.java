package decision_making;
public class Solution{
    public static String compareNM(int n,int m){
        if(n<m){
            return "lesser";
        }else if(n==m){
            return "equal";
        }else {
            return "greater";
        }
    }
    public static void main(String[] args){
        int n=5;
        int m=3;
        System.out.println(compareNM(n,m));
    }
}

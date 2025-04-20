public class Ques1{
    public static int[] prefixsum(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n ; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int arr[]=  {1,2,3,4,5};
        int ans[] = prefixsum(arr);
        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
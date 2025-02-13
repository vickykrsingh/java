package Arrays;

public class SuffixPrefix {
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefixArray(int[] arr){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        return prefix;
    }
    static int[] suffixArray(int[] arr){
        int suffix[] = new int[arr.length];
        suffix[0] = arr[arr.length-1];
        for(int i = 1;i<arr.length;i++){
            suffix[i] = suffix[i-1]+arr[arr.length-(i+1)];
        }
        return suffix;
    }
    static void checkSumSuffixPrefix(int[] prefix,int[] suffix){
        for(int i = 0;i<prefix.length-1;i++){
            if (prefix[i]==suffix[(prefix.length-2)-i]) {
                System.out.println("Present ");
            }
        }
    }
    static void checkSumPrefixSum(int[] prefix){
        int total = prefix[prefix.length-1];
        for(int i = 0;i<prefix.length-1;i++){
            if(prefix[i]==total-prefix[i]){
                System.out.println("Present");
                System.out.println(prefix[i]);
            }
        }
    }
    static void checkSubArraySum(int arr[],int total){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum=sum+arr[i];
            if (sum==total-sum) {
                System.out.println("Present "+sum);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4,3,4};
        System.out.print("Prefix Array : ");
        int prefix[] = prefixArray(arr);
        printArray(prefix);
        System.out.print("Suffix Array : ");
        int suffix[] = suffixArray(arr);
        printArray(suffix);
        // checkSumSuffixPrefix(prefix,suffix);

        // checkSumPrefixSum(prefix);
        checkSubArraySum(arr, 22);
    }
}

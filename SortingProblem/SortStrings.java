package SortingProblem;

public class SortStrings {
    static void sortString(String arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex])<0){
                    minIndex=j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"college","camel","cow","ant","buff","bug","bull"};
        sortString(arr);
        for(String ele:arr){
            System.out.print(ele+" ");
        };
        System.out.println();
    }
}

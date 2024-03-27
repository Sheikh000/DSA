public class tsubarraysum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        calculateSubarraySums(arr);
    }

    static void calculateSubarraySums(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
               
                sum += arr[end];
                System.out.println("Sum of subarray [" + start + ".." + end + "] = " + sum);
            }
        }
    }
}

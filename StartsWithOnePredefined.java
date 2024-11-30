package JavaCodes;

public class StartsWithOnePredefined {
    public static void main(String[] args) {
        int[] arr = {10, 2, 15, 6, 11, 31};

        for (int i = 0; i < arr.length; i++) {
            if(String.valueOf(arr[i]).startsWith("1")) {
                System.out.println(arr[i]);
            }
        }
    }
}

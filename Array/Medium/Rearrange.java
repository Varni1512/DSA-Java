public class Rearrange {
    public static int[] rearrange(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int posIndex = 0, negIndex = 1;
        for(int i = 0;i<n;i++){
            if(arr[i] < 0){
                temp[negIndex] = arr[i];
                negIndex += 2;
            } else {
                temp[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] result = rearrange(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
import java.util.*;

public class Rearrange1 {
    public static int[] rearrange(int[] arr) {
        int n = arr.length;
        Vector<Integer> pos = new Vector<>();
        Vector<Integer> neg = new Vector<>();
        for(int i = 0;i<n;i++){
            if(arr[i] >= 0){
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        if(pos.size() > neg.size()){
            for(int i = 0;i<neg.size();i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = 2*neg.size();
            for(int i = neg.size();i<pos.size();i++){
                arr[index] = pos.get(i);
                index++;
            }
        }
        else{
            for(int i = 0;i<pos.size();i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = 2*pos.size();
            for(int i = pos.size();i<neg.size();i++){
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5,3};
        int[] result = rearrange(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

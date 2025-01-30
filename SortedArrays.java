import java.util.Arrays;
import java.util.Collections;

public class SortedArrays {
    Integer[] arr;

    public SortedArrays(int[] arr){
        this.arr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(this.arr, Collections.reverseOrder());;
    }

    public Integer[] getArr(){
        return this.arr;
    }
}

package ex_8;
import java.util.*;

public class GenericSwap {
	public static <T> void swap(T[] array, int l, int r){
		
        T temp = array[r];
        array[r] = array[l];
        array[l] = temp;
        System.out.println("Swapped : "+array[l]+" and "+array[r]);
    }


    public static void main(String[] args){

        Integer[] nums = {1, 2, 3, 4};
        swap(nums, 0, 1);
        swap(nums, 2, 3);
    }

}

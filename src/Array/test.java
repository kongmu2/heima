package Array;

import org.junit.Test;

import java.util.Arrays;

public class test {
    @Test
    public void test1(){
        int sum=0;
        int[] arr={212,132,534,21};
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
    @Test
    public void test2(){
        System.out.println("萨达1");
    }
    @Test
    public void testtoString(){
        int[] arr={3,8,4,69,7};
        String s=Arrays.toString(arr);
        System.out.println(s);
    }
    
    
    @Test
    public void testbinarysearch(){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr);
        int index=Arrays.binarySearch(arr,4);
        System.out.println(index);
    }
    @Test
    public void testArraycopy(){
        int[] a =new int[]{65,81,555};
        int[] b=new int[]{111,55,22,66,88,99};
        // System.arraycopy(原数组名，从原数组的那个位置开始拷贝，目标数组，放到目标数组的那个索引，一共拷贝原数组的元素的个数);
        System.arraycopy(a,1,b,2,2);
        System.out.println(Arrays.toString(b));

    }

    @Test
    public void testmaopaosort(){
        int[] arr=new int[]{4,8,2,3,5,7,6,9};
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

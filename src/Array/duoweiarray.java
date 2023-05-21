package Array;

public class duoweiarray {

    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,5,9,9,4},{4,18,5,8,8},{6,7,6,8,1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

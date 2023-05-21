package suanfa.sparsearray;

public class SparseArray {
    public static void main(String[] args) {
        //0表示没有棋子1表示黑子2表示白子
        int chessArr1[][]=new int[11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        System.out.println("原始的二维数组");
        for (int[] rows : chessArr1) {
            for (int data : rows) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //转换成稀疏数组


        int sum=0;//获取原先数组的非零数
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] !=0){
                    sum++;
                }
            }
        }

        //创建稀疏数组
        int sparseArr[][]=new int[sum+1][3];
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;


        int count=0;//记录有几个非零数据
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] !=0){
                    count++;
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=chessArr1[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("得到的稀疏数组为");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }

        //稀疏数组返回原先数组
        int chessArr2[][]=new int[sparseArr[0][0]][sparseArr[0][1]];

        for (int i = 1; i <sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
        }

        //转换后的稀疏数组
        System.out.println();
        System.out.println("转换后的原先数组");
        for (int[] rows : chessArr2) {
            for (int data : rows) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }


    }
}

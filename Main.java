public class Main {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=3;
        for(int i=0;i<n;i++){
            rotateArray(matrix);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void rotateArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                swap(i,j,matrix);
            }
        }
        for(int i=0;i<matrix.length;i++){
            int l=0;
            int r=matrix[0].length-1;
            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

    }
    public static void swap(int i,int j,int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}

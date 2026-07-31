package lab2;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] ja = new int[3][];
        ja[0] = new int[]{1, 2, 3,5,8};
        ja[1] = new int[]{4, 77,5};
        ja[2] = new int[]{6, 7, 8, 9,12,33,4,55,4};

        for (int i = 0; i < ja.length; i++) {
            for (int j = 0; j < ja[i].length; j++) {
                System.out.print(ja[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

public class MultiArray {
    public static void main(String[] args) {
        
        // int numbers[][]={
        //     {10,20,30},
        //     {40,50,60},
        //     {70,80,90},
        //     {23,45,65}
        // };
        // System.out.println(numbers[1][1]);
        int numbers[][]=new int[4][3];
        for (int i=0;i<4;i++){
            for (int j=0; j<3;j++){
                numbers[i][j]=2;
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0; j<3;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

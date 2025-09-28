public class Array {
    public static void main(String[] args) {
        
        //int Numbers[]= {10,20,30,40,50};
        int Numbers[]= new int[5];
        for (int i=0; i<Numbers.length; i++){
            Numbers[i]=i+1; 
        }
        int sum =0;
        for(int num:Numbers)
        {
            sum = sum+num;
        }
        /*int sum =0;
        for (int i=0; i<Numbers.length;i++){
            sum = sum + Numbers[i];
        }
            */
        System.out.println(sum);
    }
}
  
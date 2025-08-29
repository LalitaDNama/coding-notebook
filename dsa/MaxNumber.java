public class MaxNumber {

    public static int getMaxInt(int[] array){
        int max=array[0];
        for(int i=1;i<=array.length-1;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}

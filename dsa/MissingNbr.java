public class MissingNbr {

    public static int getMissingNbr(int[] array){

        int n=array.length;
        int totalSum=n*(n+1)/2;
        int actualSum=0;

        for(int num:array){
            actualSum+=num;
        }
        return totalSum-actualSum;
    }
}

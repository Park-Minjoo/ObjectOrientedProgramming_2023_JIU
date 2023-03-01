public class Example7_22 {
    public static void main(String[] args) {
        final int[] x = {1,2,3,4};
        int[] y = x;
//        x = new int[2];
        for(int i = 0; i < y.length;i++){
            System.out.println(y[i]+" ");
        }

    }
}

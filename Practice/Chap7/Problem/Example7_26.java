public class Example7_26 {
    public static void main(String[] args) {
        int[] list1 = {1,2,3};
        int[] list2 = {1,2,3};
        list2 = list1;
        list1[0] = 0; list1[1] = 1; list1[2] = 2;

        for(int i = 0; i < list1.length; i++){
            System.out.println(list1[i] + " ");
        }
    }
}

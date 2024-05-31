public class Main2dDynamicArray {
    public static void main(String[] args) {
        DynamicArray2d d = new DynamicArray2d(3, 3);

        int[] a = {1, 2, 3};
        for (int i = 0; i < 5; i++) {
            d.appendCol(a);
        }
        int[] b = {1, 2, 3, 4, 5};
        for (int i = 0; i < 6; i++) {
            d.appendRow(b);
        }
        d.print2d();
    }
}

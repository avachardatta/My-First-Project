public class Array { // Class name changed to PascalCase for convention

    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;
    int sub6;
    int sub7;
    int total;

    public Array(int sub1, int sub2, int sub3, int sub4, int sub5, int sub6, int sub7) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
        this.sub6 = sub6;
        this.sub7 = sub7;

        // Calculate and assign total in the constructor for direct use
        this.total = calculateTotal();
    }

    private int calculateTotal() {
        return sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7;
    }

    @Override
    public String toString() {
        return sub1 + " + " + sub2 + " + " + sub3 + " + " + sub4 + " + " + sub5 + " + " + sub6 + " + " + sub7 + " = " + total;
    }

    public static void main(String[] args) {

        Array a1 = new Array(50, 35, 35, 35, 35, 35, 35);
        System.out.println(a1);  // Print using toString directly

    }
}
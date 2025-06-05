package array;

public class ArrayRef2 {

    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        for(int i = 0 ; i < 5; i ++) {
            students[i] = i * 10;
        }
        for(int i = 0; i < 5; i ++) {
            System.out.println(students[i]);
        }
    }
}

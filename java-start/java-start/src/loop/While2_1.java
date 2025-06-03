package loop;

public class While2_1 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        while(i<=3){
            sum += i;
            i += 1;
        }
        System.out.println("sum = " + sum);
    }
}

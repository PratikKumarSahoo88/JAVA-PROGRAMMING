public class Avg {
    public static void main(String[] args) {
        int i=1,sum=0,avg=0;
        for ( i = 0; i < 10; i++) {
            sum=sum+i;
        }
        System.out.println("Sum is"+sum);
        avg=sum/10;
        System.out.println("Avg is"+avg);
    }
}

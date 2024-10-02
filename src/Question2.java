public class Question2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<=10) {
            sum = sum  + i;
            sum+=1;
            i++;
        }
        System.out.println(sum);
    }
}

public class Reduce{

    public static void main(String[] args) {
        int steps = reduce(100);
        System.out.println(steps);
    }

    public static int reduce(int n){
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            }
            count++;
        }
        return count;
    }

}

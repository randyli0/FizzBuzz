

public class FizzBuzz2 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 100){

            boolean divisibleby3 = count % 3 == 0;
            boolean divisibleby5 = count % 5 == 0;

            if (divisibleby3 && divisibleby5){
                System.out.println("fizz Buzz");
            } else if (divisibleby3){
                System.out.println("Fizz");
            } else if (divisibleby5){
                System.out.println("Buzz");
            } else{
                System.out.println(count);
            }
            count++;
        }


    }
}
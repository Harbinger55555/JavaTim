public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int total = myFirstNumber + mySecondNumber + myThirdNumber;

        int diff = 1000 - total;

        System.out.println(myFirstNumber);
        System.out.println(total);
        System.out.println(diff);
    }
}
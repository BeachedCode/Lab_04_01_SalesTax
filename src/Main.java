public class Main {
    public static void main(String[] args)
    {
        double objectPrice;
        double salesTax;
        double taxOutput;
        salesTax = 0.05;
        objectPrice = 25.00;
        taxOutput = (objectPrice * salesTax);
        System.out.println("Sales Tax: " + taxOutput);
    }
}
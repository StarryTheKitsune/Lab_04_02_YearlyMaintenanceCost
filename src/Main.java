public class Main {
    public static void main(String[] args)
    {
        double summerCost = 2600.45;
        double winterCost = 3000.00;
        double springCost = 157.00;
        double fallCost = 259.99;
        double totalCost = 0;

        totalCost = summerCost + winterCost + springCost + fallCost;

        System.out.println("The total cost is $" + totalCost + " based on a summer cost of $" + summerCost + ", a winter cost of $" + winterCost + ", a spring cost of $" + winterCost + ", and a fall cost of $" + fallCost);
    }
}
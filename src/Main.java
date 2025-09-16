public class Main {
    public static void main(String[] args) {
        double springCost = 120.00;
        double summerCost = 180.00;
        double fallCost = 140.00;
        double winterCost = 160.00;

        double yearlyTotal = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance: $" + String.format("%.2f", springCost));
        System.out.println("Summer maintenance: $" + String.format("%.2f", summerCost));
        System.out.println("Fall maintenance: $" + String.format("%.2f", fallCost));
        System.out.println("Winter maintenance: $" + String.format("%.2f", winterCost));
        System.out.println("Total yearly maintenance: $" + String.format("%.2f", yearlyTotal));
    }
}
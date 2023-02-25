public class Main {
    public static void main(String[] args) {

        int[] sales = { 10, 23, 43, 12, 4, 32 };
        SalesManager manager = new SalesManager(sales);
        int maxSale = manager.max();
        System.out.println("Максимальная продажа - " + maxSale);
    }


}
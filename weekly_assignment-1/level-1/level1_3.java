public class level1_3 {
    public static void main(String[] args){
        int cost, sell;
        float profit, profit_percentage;
        cost = 129;
        sell = 191;
        profit = sell - cost;
        profit_percentage = (profit * 100) / cost;
        System.out.println("The cost price is INR 129 and selling price is INR 191");
        System.out.println("The profit is INR "+profit+" and the profit percentage is "+profit_percentage);
    }
    
}

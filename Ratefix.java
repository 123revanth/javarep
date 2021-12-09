import java.util.Scanner;

public class javaclass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Supply");
            int supply = sc.nextInt();

            System.out.println("Enter the demand");
            int demand = sc.nextInt();

            System.out.println("Enter the cost taken to produce the one product");
            int CostPrice = sc.nextInt();

            System.out.println("Enter profit expected");
            int expectProfit = sc.nextInt();

            float SellingPrice = 0;
            float totalProfit = 0;
            float div = 0;
            float NetProfit = 0;
            float TotNetProf = 0;

            if (supply == demand) {
                SellingPrice = CostPrice + expectProfit;
                System.out.println("The selling price for one product is " + SellingPrice);
                totalProfit = SellingPrice * supply;
                System.out.println("The total selling price that u get is " + totalProfit);
                NetProfit = SellingPrice - CostPrice;
                System.out.println("The net profit for one product is " + NetProfit);
                TotNetProf = NetProfit * supply;
                System.out.println("The total net profit is " + TotNetProf);

            }

            else if (supply > demand) {
                div = demand / supply;
                SellingPrice = (CostPrice + expectProfit) * div;
                System.out.println("The selling price for one product is " + SellingPrice);
                totalProfit = SellingPrice * supply;
                System.out.println("The total selling price that u get is " + totalProfit);
                NetProfit = SellingPrice - CostPrice;
                System.out.println("The net profit for one product is " + NetProfit);
                TotNetProf = NetProfit * supply;
                System.out.println("The total net profit is " + TotNetProf);

            } else {
                div = demand / supply;
                SellingPrice = (CostPrice + expectProfit) * div;
                System.out.println("The selling price for one product is " + SellingPrice);
                totalProfit = SellingPrice * supply;
                System.out.println("The total selling price that u get is " + totalProfit);
                NetProfit = SellingPrice - CostPrice;
                System.out.println("The net profit for one product is " + NetProfit);
                TotNetProf = NetProfit * supply;
                System.out.println("The total net profit is " + TotNetProf);

            }

        }
    }
}

import java.util.Scanner;
public class ProfitLoss {
    public void calculate(){
    double sellingPrice, costPrice;
    System.out.println("Enter Selling Price:");
    Scanner sc = new Scanner(System.in);
    sellingPrice = sc.nextDouble();
    System.out.println("Enter Cost price:");
    costPrice = sc.nextDouble();
    double pol = sellingPrice - costPrice;
    if (pol > 0)
    {
    System.out.println("Profit:"+pol);
    }
    else{
            System.out.println("Loss:"+Math.abs(pol));
    }
}
}


public class Run {

	public static void main(String[] args) {
		Generate obj = new Generate();
		         obj.getCustDetail();
		         obj.dispMenu();
		         obj.getOrder();
		         System.out.println("////////////////////////////////////////////////");
		         System.out.println("                    RESTAURENT                  ");
		         System.out.println("////////////////////////////////////////////////");
		         System.out.println("                       Bill                     ");
		         System.out.println("################################################");
		         System.out.println();
		         obj.dispcustDetail();
		         obj.dispBill();
		         System.out.println("     Total Bill                price :"+obj.bill+" rs");
		         System.out.println("################################################");
		         System.out.println("             Thank You For Visiting!!!!         ");

	}

}

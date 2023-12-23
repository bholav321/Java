import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String name;
	char gender;
	System.out.println("Enter your name");
	name = sc.nextLine();
	System.out.println("Enter your gender in the form of 'M' & 'F' ");
	gender = sc.next().charAt(0);
	int Item1r,Item2r,Item3r,Item4r,Item5r,Item6r,Item7r,Item8r,Item9r,Item10r;
	int IQ1,IQ2,IQ3,IQ4,IQ5,IQ6,IQ7,IQ8,IQ9,IQ10;
	Item1r = 10;
	Item2r = 20;
	Item3r = 30;
	Item4r = 40;
	Item5r = 50;
	Item6r = 60;
	Item7r = 70;
	Item8r = 80;
	Item9r = 90;
	Item10r = 100;
	int Item1,Item2,Item3,Item4,Item5,Item6,Item7,Item8,Item9,Item10;
	

	System.out.println("Enter 1st item's quantity");
	IQ1 = sc.nextInt();
	System.out.println("Enter 2nd item's quantity");
	IQ2 = sc.nextInt();
	System.out.println("Enter 3rd item's quantity");
	IQ3 = sc.nextInt();
	System.out.println("Enter 4th item's quantity");
	IQ4 = sc.nextInt();
	System.out.println("Enter 5th item's quantity");
	IQ5 = sc.nextInt();
	System.out.println("Enter 6th item's quantity");
	IQ6 = sc.nextInt();
	System.out.println("Enter 7th item's quantity");
	IQ7 = sc.nextInt();
	System.out.println("Enter 8th item's quantity");
	IQ8 = sc.nextInt();
	System.out.println("Enter 9th item's quantity");
	IQ9 = sc.nextInt();
	System.out.println("Enter 10th item's quantity");
	IQ10 = sc.nextInt();
	
	if (IQ1>0){
	Item1 = 1;
	}
	else{
	Item1 = 0;
	}

	if (IQ2>0){
	Item2 = 1;
	}
	else{
	Item2 = 0;
	}

	if (IQ3>0){
	Item3 = 1;
	}
	else{
	Item3 = 0;
	}

	if (IQ4>0){
	Item4 = 1;
	}
	else{
	Item4 = 0;
	}

	if (IQ5>0){
	Item5 = 1;
	}
	else{
	Item5 = 0;
	}

	if (IQ6>0){
	Item6 = 1;
	}
	else{
	Item6 = 0;
	}

	if (IQ7>0){
	Item7 = 1;
	}
	else{
	Item7 = 0;
	}

	if (IQ8>0){
	Item8 = 1;
	}
	else{
	Item8 = 0;
	}

	if (IQ9>0){
	Item9 = 1;
	}
	else{
	Item9 = 0;
	}

	if (IQ10>0){
	Item10 = 1;
	}
	else{
	Item10 = 0;
	}
	
	int BasicAmount;

	BasicAmount = ((Item1r*IQ1)+(Item2r*IQ2)+(Item3r*IQ3)+(Item4r*IQ4)+(Item5r*IQ5)+(Item6r*IQ6)+(Item7r*IQ7)+(Item8r*IQ8)+(Item9r*IQ9)+(Item10r*IQ10));
	// System.out.println(BasicAmount);
	
	int Totalitems = (Item1+Item2+Item3+Item4+Item5+Item6+Item7+Item8+Item9+Item10);

	//System.out.println("Total no. of items = "+Totalitems);

	// int dist1,dist2,dist3,dist4,dist5,dist6,dist7,dist8,dist9,dist10;
	// int Total;
	int dist;
	if(IQ1>4 && Totalitems<=4){
	 dist = ((Item1r*IQ1*5)/100);
	//   Total = dist1;
	}
	else if(Totalitems>=5 && Totalitems<10){
	 dist = ((Item5*10)/100);	 
	//  dist2 = ((Item5*10)/100);	 
	//  dist3 = ((Item5*10)/100);	 
	//  dist4 = ((Item5*10)/100);	 
	//  dist5 = ((Item5*10)/100);	 
    //   Total = dist1+dist2+dist3+dist4+dist5;
	}
	else{
	 dist = ((Item10*15)/100);
	//  dist2 = ((Item10*15)/100);
	//  dist3 = ((Item10*15)/100);
	//  dist4 = ((Item10*15)/100);
	//  dist5 = ((Item10*15)/100);
	//  dist6 = ((Item10*15)/100);
	//  dist7 = ((Item10*15)/100);
	//  dist8 = ((Item10*15)/100);
	//  dist9 = ((Item10*15)/100);
	//  dist10 = ((Item10*15)/100);
	//   Total = dist1+dist2+dist3+dist4+dist5+dist6+dist7+dist8+dist9+dist10;
	}
	//System.out.println(TotalAmount);
	//System.out.println(Discount);

	int Discount = 1;
	
	if (BasicAmount>10000){
	  Discount = ((BasicAmount*15)/100);
	}
	else if(BasicAmount>5000){ 
	  Discount = ((BasicAmount*10)/100);
	}
	else{
	  Discount = 0;
	}

	int TotalAmount;
  	TotalAmount = (BasicAmount+Discount);
	//System.out.println(TotalAmount);

	int GST;
	GST = ((TotalAmount*10)/100);

	char bag;
	System.out.println("Would You want to carry a bag/ y = yes & n = no");
	bag = sc.next().charAt(0);
	
	int a;
	if (bag=='y'){
	a = TotalAmount+10;
	
	}
 	else{
	a = TotalAmount;
	}
	
	
	String Gift;
	if (gender=='F'){
	Gift = "Cadebarry";
	}
	else{
	Gift = "Ladger Wallet";
	}
	
	int GrossAmount = GST+a;

	System.out.println("");
	System.out.println("");

	System.out.println("					D-Mart			                ");
	System.out.println("");
	System.out.println("	Name:" +name+ "					       Date: 09.06.2023");
	System.out.println("");
	System.out.println("------------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println("Item Name" + "	    Quantity"+  "	    Price"+ "	    Total"+ "	    After-Discount"  );
	System.out.println("");
	System.out.println("  Item-1 "+	"		" +(IQ1)+"	     "+(Item1r)+"	 	     "+(IQ1*Item1r)+" 		 "+dist);
	System.out.println("  Item-2 "+	"		" +(IQ2)+"	     "+(Item2r)+"	 	     "+(IQ2*Item2r)+" 		 "+dist);
	System.out.println("  Item-3 "+	"		" +(IQ3)+"	     "+(Item3r)+"	 	     "+(IQ3*Item3r)+" 		 "+dist);
	System.out.println("  Item-4 "+	"		" +(IQ4)+"	     "+(Item4r)+"	 	     "+(IQ4*Item4r)+" 		 "+dist);
	System.out.println("  Item-5 "+	"		" +(IQ5)+"	     "+(Item5r)+"	 	     "+(IQ5*Item5r)+" 		 "+dist);
	System.out.println("  Item-6 "+	"		" +(IQ6)+"	     "+(Item6r)+"	 	     "+(IQ6*Item6r)+" 		 "+dist);
	System.out.println("  Item-7 "+	"		" +(IQ7)+"	     "+(Item7r)+"	 	     "+(IQ7*Item7r)+" 		 "+dist);
	System.out.println("  Item-8 "+	"		" +(IQ8)+"	     "+(Item8r)+"	 	     "+(IQ8*Item8r)+" 		 "+dist);
	System.out.println("  Item-9 "+	"		" +(IQ9)+"	     "+(Item9r)+"	 	     "+(IQ9*Item9r)+" 		 "+dist);
	System.out.println("  Item-10 "+"	        " +(IQ10)+"            "+(Item10r)+"             "+(IQ10*Item10r)+"                  "+dist);
	System.out.println("");
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println("\t\t\t\t\t\t"+"     A.P"+"\t\t D.P");
	System.out.println("");
	System.out.println("\t\t\t\t\t\t    "+BasicAmount+"\t\t "+TotalAmount);
	System.out.println("  Gift :-"+Gift);
	System.out.println("");
	System.out.println("  Carry Bag : "+"\t\t\t\t\t    "+BasicAmount);
	System.out.println("");
	System.out.println("  GST (10%)"+"\t\t\t\t\t    "+GST);
	System.out.println("");
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println("\t\t\t\t\t\t    "+GrossAmount+"\t\t"+TotalAmount+"rs");
	System.out.println("");
	System.out.println("");
	System.out.println("\t\t\tThank You");
	System.out.println("\t\t\t To visit");
	System.out.println("\t\t\t  D-Mart");
	System.out.println("");
	System.out.println("");

	System.out.println("-----------------------------------------------------------------------------------");

	
	
























  }


}
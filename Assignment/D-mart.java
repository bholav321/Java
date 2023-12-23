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
	
	double BasicAmount;

	BasicAmount = ((Item1r*IQ1)+(Item2r*IQ2)+(Item3r*IQ3)+(Item4r*IQ4)+(Item5r*IQ5)+(Item6r*IQ6)+(Item7r*IQ7)+(Item8r*IQ8)+(Item9r*IQ9)+(Item10r*IQ10));
	
	double dist1=0,dist5=0,dist10=0,tp1=1,tp5=1,tp10=1;
	if(IQ1>4 && IQ1<10){
	dist1 = (((Item1r*IQ1)*5)/100);
	dist5 = (((Item5r*IQ5)*10)/100);
	tp1 = (Item1r*IQ1)-dist1;
	tp5 = (Item5r*IQ5)-dist5;	 
	}
	else{
	dist1 = (((Item1r*IQ1)*5)/100);
	dist5 = (((Item5r*IQ5)*10)/100);
	dist10 = (((Item10r*IQ10)*15)/100);
	tp1 = (Item1r*IQ1)-dist1;
	tp5 = (Item5r*IQ5)-dist5;
	tp10 = (Item10r*IQ10)-dist10;
	}

	double Discount;
	double TotalAmount;
	TotalAmount = (BasicAmount-tp1-(tp5)-(tp10));
	if (TotalAmount>10000){
	  Discount = ((TotalAmount*15)/100);
	}
	else if(TotalAmount>5000){ 
	  Discount = ((TotalAmount*10)/100);
	}
	else{
	  Discount = 0;
	}
	TotalAmount = TotalAmount-Discount;
	char bag;
	System.out.println("Would You want to carry a bag/ y = yes & n = no");
	bag = sc.next().charAt(0);
	
	double a,b;
	if (bag=='y'){
	a = BasicAmount+10;
	b = TotalAmount+10;
	
	}
 	else{
	a = BasicAmount;
	b = TotalAmount;
	}
	
	String Gift;
	if (gender=='F'){
	Gift = "Cadebarry";
	}
	else{
	Gift = "Ladger Wallet";
	}
	double GST1,GST2;
	GST1 = ((a*10)/100);
	GST2 = ((b*10)/100);
	double GrossAmount1 = GST1+a;
	double GrossAmount2 = GST2+b;

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
	System.out.println("  Item-1 "+	"		" +(IQ1)+"	     "+(Item1r)+"	 	     "+(IQ1*Item1r)+" 		 "+tp1);
	System.out.println("  Item-2 "+	"		" +(IQ2)+"	     "+(Item2r)+"	 	     "+(IQ2*Item2r)+" 		 "+(IQ2*Item2r));
	System.out.println("  Item-3 "+	"		" +(IQ3)+"	     "+(Item3r)+"	 	     "+(IQ3*Item3r)+" 		 "+(IQ3*Item3r));
	System.out.println("  Item-4 "+	"		" +(IQ4)+"	     "+(Item4r)+"	 	     "+(IQ4*Item4r)+" 		 "+(IQ4*Item4r));
	System.out.println("  Item-5 "+	"		" +(IQ5)+"	     "+(Item5r)+"	 	     "+(IQ5*Item5r)+" 		 "+tp5);
	System.out.println("  Item-6 "+	"		" +(IQ6)+"	     "+(Item6r)+"	 	     "+(IQ6*Item6r)+" 		 "+(IQ6*Item6r));
	System.out.println("  Item-7 "+	"		" +(IQ7)+"	     "+(Item7r)+"	 	     "+(IQ7*Item7r)+" 		 "+(IQ7*Item7r));
	System.out.println("  Item-8 "+	"		" +(IQ8)+"	     "+(Item8r)+"	 	     "+(IQ8*Item8r)+" 		 "+(IQ8*Item8r));
	System.out.println("  Item-9 "+	"		" +(IQ9)+"	     "+(Item9r)+"	 	     "+(IQ9*Item9r)+" 		 "+(IQ9*Item9r));
	System.out.println("  Item-10 "+"	        " +(IQ10)+"            "+(Item10r)+"             "+(IQ10*Item10r)+"                  "+tp10);
	System.out.println("");
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println("\t\t\t\t\t\t"+"     A.P"+"\t\t D.P");
	System.out.println("");
	System.out.println("\t\t\t\t\t\t    "+BasicAmount+"\t\t "+TotalAmount);
	System.out.println("  Gift :-"+Gift);
	System.out.println("");
	System.out.println("  Carry Bag : "+bag+"\t\t\t\t\t    "+a+"\t\t"+b);
	System.out.println("");
	System.out.println("  GST (10%)"+"\t\t\t\t\t    "+GST1+"\t\t"+GST2);
	System.out.println("");
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println("\t\t\t\t\t\t    "+GrossAmount1+"\t\t"+GrossAmount2+"rs");
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
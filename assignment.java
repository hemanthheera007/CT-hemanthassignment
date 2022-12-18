package hk;
import java.util.Scanner;
public class assignment {
	//Q1. write a java program to get a no from the user and print whether it is positive or negative 
		public void checkposorneg() {
			System.out.println("Positive or Negative Check");
			int num;
			Scanner c = new Scanner(System.in);
			System.out.println("enter a no");
			num = c.nextInt();
			if (num < 0) {
				System.out.println("the no is negative");
			} else if (num > 0) {
				System.out.println("the no is positive");
			} else {
				System.out.println("the no is zero");
			}
		}

		public void greatestof3() {
			//Q2.take 3 numbers from the user and print greatest no
			System.out.println("GREATEST OF 3 NUMBERS");
			int x, y, z;

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the 1st no");
			x = sc.nextInt();
			System.out.println("enter the 2nd no");
			y = sc.nextInt();
			System.out.println("enter the 3rd no");
			z = sc.nextInt();
			if (x > y && x > z) {
				System.out.println("the largest no is " + x);
			} else if (y > z) {
				System.out.println("the largest no is " + y);
			} else {
				System.out.println("the largest no is " + z);
			}
		}

		public void weekday() {
			//Q3. WAP that keeps a no from the user and generates a integer btw
			// 1 and 7 and displays the name of week day
			System.out.println("WEEKDAY ACCORDING TO INPUT NO");
			Scanner s = new Scanner(System.in);

			System.out.println("input no:");
			int d = s.nextInt();
			String day;
			switch (d) {
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			case 7:
				day = "Sunday";
				break;
			default:
				day = "Invalid day";
			}
			System.out.println(day);
		}

		public void naturalno() {
      //Q4.wap to print the first 10 natural numbers
			System.out.println("The First 10 Natural Numbers are");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}

		public void sumandavg()
       //Q5.WAP to input 5 numbers from numbers from keyboard and find their sum and average 
		{
			System.out.println("SUM AND AVERAGE OF INPUT NOS");
			int i, n = 0, s = 0;

			double avg;

			System.out.println("Input the 5 numbers : ");

			for (i = 0; i < 5; i++) {
				Scanner in = new Scanner(System.in);
				n = in.nextInt();

				s += n;
			}
			avg = s / 5;
			System.out.println("The sum of 5 no is : " + s + "\nThe Average is : " + avg);
		}  
		
	     public void productinfo()
	    
	     {
	    	//WAP to take product information using scanner like productid, product_name
		     //,product_price, quantity,category , brand and display
		       int prod_id ,quantity;   
	     	   float prod_price;       
	   	       String prod_name,category,brand; 
	    	 System.out.println(" storing of product information ");
	    	 Scanner b=new Scanner(System.in);
	    	 System.out.println("enter no of details");
	    	 int n=b.nextInt();
	    	 for(int i=0;i<n;i++)
	    	 {
	    		 System.out.println("enter product id");
	    		 prod_id=b.nextInt();
	    		 System.out.println("enter quantity");
	    		 quantity=b.nextInt();
	    		 System.out.println("enter product name");
	    		 prod_name=b.next();
	    		 System.out.println("enter category type");
	    		 category=b.next();
	    		 System.out.println("enter brand name");
	    		 brand=b.next();
	    		 System.out.println("enter product price");
	    		 prod_price=b.nextFloat();
	    	 
	    	 
	    		 System.out.println("product id :"+prod_id);
	   
	    		 System.out.println("quantity :"+quantity);
	   
	    		 System.out.println("product name "+prod_name);
	    		 
	    		 System.out.println("category :"+category);
	    	
	    		 System.out.println("brand :"+brand);
	    		 
	    		 System.out.println("product price :"+prod_price);
	    	 }
	    	   
	     }
		public static void main(String[] args) {
			assignment obj = new assignment();
			int b;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("1. check whether the no is positive or negative");
		    System.out.println("2. finding greatest of 3 numbers ");
		    System.out.println("3. Identifying weekday by selecting the numbers btw 1-7 ");
		    System.out.println("4. printing 1st 10 natural numbers");
		    System.out.println("5. Taking 5 input nos and calculating the sum and avg of them ");
		    System.out.println("6. storing and displaying product information");
		    System.out.println("7. exit");
		    while(true)
            	 
             {
            	 System.out.println(" enter question no of assignment 1");  
            	 b=sc.nextInt();
             
		    switch(b)
		    {    
		    case 1: obj.checkposorneg(); break;
		    case 2: obj.greatestof3(); break;
		    case 3: obj.weekday(); break;
		    case 4: obj.naturalno(); break;
		    case 5: obj.sumandavg(); break;
		    case 6: obj.productinfo(); break;
		    case 7: System.exit(b); break;
		    default: System.out.println("you've entered wrong question no");
		    }
		}
		}

	}

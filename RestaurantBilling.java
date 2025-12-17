\\RESTURANT ORDER SYSTEM 
import java.util.Scanner; 
public class RestaurantBilling { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
int choice, qty; 
double total = 0; 
System.out.println("----- RESTAURANT MENU -----"); 
System.out.println("1. Pizza   - Rs.150"); 
System.out.println("2. Burger  - Rs.80"); 
System.out.println("3. Coffee  - Rs.40"); 
System.out.println("4. Exit"); 
while (true) { 
System.out.print("Enter your choice: "); 
choice = sc.nextInt(); 
if (choice == 4) { 
break; 
} 
System.out.print("Enter quantity: "); 
qty = sc.nextInt(); 
switch (choice) { 
case 1: 
total += 150 * qty; 
break; 
case 2: 
total += 80 * qty; 
break; 
case 3: 
total += 40 * qty; 
break; 
default: 
System.out.println("Invalid choice"); 
} 
} 
System.out.println("\n----- BILL -----"); 
System.out.println("Total Amount: Rs." + total); 
System.out.println("Thank You! Visit Again "); 
} 
} 
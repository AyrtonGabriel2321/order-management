package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.Order2;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Productn;



public class Exercicio126 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date moment = new Date();
		List<String> product = new ArrayList<>();



		
		System.out.println("ENTER CLIENT DATA: ");
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Email: ");
		String email=sc.next();
		System.out.print("Birth date(dd/MM/yyyy): ");
		String birthDate=sc.next();
		Date birthdate=sdf.parse(birthDate);
		
		Client client = new Client(name,email,birthdate);
		
		System.out.println("---------- ------------");
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status=sc.next();
		
		OrderStatus os1=OrderStatus.valueOf(status);
		Order2 order = new Order2(moment, os1, client);
		System.out.print("How many items to this order? ");
		int c=sc.nextInt();
		
		
		String namef = null;
		Double pricep=0.0;
		int quantity = 0;
		
		for(int i=1;i<=c;i++) {
			System.out.println("Product #"+i);
			System.out.print("Product name: ");
			namef=sc.next();
			System.out.print("Product price:  ");
			pricep=sc.nextDouble();
			Productn p1= new Productn(namef,pricep);
			System.out.print("Quantity: ");
			System.out.println("");
			quantity=sc.nextInt();
			OrderItem oi1 = new OrderItem(quantity,pricep,p1);
			order.addItem(oi1);
			

			
		}
		
		System.out.println("");
		System.out.println("ORDER SUMMARY");
		

			System.out.println(order.toString());

		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

		}
	}


package com;

import com.company.classes.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

@SpringBootApplication
public class ZookeeperHomework1Application {

	public static void main(String[] args) throws FileNotFoundException {
		int days;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of days: ");
		days = scan.nextInt();

		ZooKeeper elmer = new ZooKeeper("Dennis");
		//Marsupial
		Kangaroo k1 = new Kangaroo("Ken");
		Kangaroo k2 = new Kangaroo("Kevin");
		Wombat w1 = new Wombat("Wendy");
		Wombat w2 = new Wombat("William");
		//Pachyderm
		Elephant e1 = new Elephant("Elmer");
		Elephant e2 = new Elephant("Edd");
		Hippo h1 = new Hippo("Henry");
		Hippo h2 = new Hippo("Herk");
		Rhino r1 = new Rhino("Ryan");
		Rhino r2 = new Rhino("Rex");
		//Feline
		Cat c1 = new Cat("Carry");
		Cat c2 = new Cat("Carl");
		Tiger t1 = new Tiger("Tim");
		Tiger t2 = new Tiger("Terry");
		//Canine
		Dog d1 = new Dog("Derek");
		Dog d2 = new Dog("Dennis");
		Dog d3 = d1;
		Wolf dw1 = new Wolf("Wayne");
		Wolf dw2 = new Wolf("Wes");

		List<Animal> zoo = Arrays.asList(k1, k2, w1, w2, e1, e2, h1, h2, r1, r2, c1, c2, t1, t2, d1, d2, dw1, dw2);
		//https://stackoverflow.com/questions/1994255/how-to-write-console-output-to-a-txt-file
		PrintStream out = new PrintStream(new FileOutputStream("output.txt")); //writing console out to output.txt file
		System.setOut(out);

		//identity
		if (d1 == d2)
		{
			System.out.println(d1.getName()+" the "+ d1.getType()+" is the same as "+d2.getName()+" the " +d2.getType()+".");
		}
		else
		{
			System.out.println(d1.getName()+" the "+ d1.getType()+" is not the same as "+d2.getName()+" the " +d2.getType()+".");
		}

		//identity
		if (d1 == d3)
		{
			System.out.println(d1.getName()+" the "+ d1.getType()+" is the same as "+d3.getName()+" the " +d3.getType()+".\n");
		}
		else
		{
			System.out.println(d1.getName()+" the "+ d1.getType()+" is not the same as "+d3.getName()+" the " +d3.getType()+".\n");
		}
		//abstraction
		elmer.doDailyWork(days, zoo);
	}
}

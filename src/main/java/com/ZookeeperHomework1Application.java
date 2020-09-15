package com;

import com.company.classes.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class ZookeeperHomework1Application {

	public static void main(String[] args) throws FileNotFoundException {
		//SpringApplication.run(ZookeeperHomework1Application.class, args);
		int days;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of days: ");
		days = scan.nextInt();

		ZooKeeper elmer = new ZooKeeper("Dennis");
		//Marsupial
		Kangaroo a1 = new Kangaroo("Ken");
		Wombat a2 = new Wombat("Wendy");
		Kangaroo a3 = new Kangaroo("Kenny");
		//Pachyderm
		//
		//https://stackoverflow.com/questions/1994255/how-to-write-console-output-to-a-txt-file
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
		Animal[] list = new Animal[2];
		list[0] = a1;
		list[1] = a2;
		for(int i = 0; i < days; i++)
		{
			elmer.doDailyWork(i + 1, list);
		}
	}

}

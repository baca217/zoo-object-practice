package com;

import com.company.classes.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class ZookeeperHomework1Application {

	public static void main(String[] args) {
		//SpringApplication.run(ZookeeperHomework1Application.class, args);
		int days;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of days: ");
		days = scan.nextInt();

		ZooKeeper elmer = new ZooKeeper("Dennis");
		Rhino r1 = new Rhino("Elmer");
		Cat c1 = new Cat("tim");
		Tiger t1 = new Tiger("me");
		Animal[] list = new Animal[3];
		list[0] = r1;
		list[1] = c1;
		list[2] = t1;
		for(int i = 0; i < days; i++)
		{
			elmer.doDailyWork(i + 1, list);
		}
	}

}

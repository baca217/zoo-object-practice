package com;

import com.company.classes.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class ZookeeperHomework1Application {

	public static void main(String[] args) {
		//SpringApplication.run(ZookeeperHomework1Application.class, args);
		ZooKeeper elmer = new ZooKeeper();
		Rhino r1 = new Rhino("Elmer");
		//cam force a name like this class
		Cat c1 = new Cat("tim");
		Tiger t1 = new Tiger("me");
		Animal[] list = new Animal[3];
		list[0] = r1;
		list[1] = c1;
		list[2] = t1;
		elmer.doDailyWork(1, list);
	}

}

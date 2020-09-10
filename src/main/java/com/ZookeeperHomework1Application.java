package com;

import com.company.classes.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class ZookeeperHomework1Application {

	public static void main(String[] args) {
		//SpringApplication.run(ZookeeperHomework1Application.class, args);
		Rhino test = new Rhino();

		test.roam();
		test.setName("timmy");
		test.getName();

		test.wakeUp();
		test.eat();
		test.makeNoise();
		test.roam();
		test.sleep();
	}

}

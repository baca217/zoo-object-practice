package com;

import com.company.classes.Tiger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class ZookeeperHomework1Application {

	public static void main(String[] args) {
		//SpringApplication.run(ZookeeperHomework1Application.class, args);

		Tiger tig = new Tiger("tiggah");
		for (int i = 0; i < 5; i++) {
			System.out.println("Trainer command " + i);
			tig.onCall();
		}

	}

}

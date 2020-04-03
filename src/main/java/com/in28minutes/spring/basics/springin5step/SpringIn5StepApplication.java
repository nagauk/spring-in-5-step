package com.in28minutes.spring.basics.springin5step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.in28minutes.*")
public class SpringIn5StepApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringIn5StepApplication.class);
	public static void main(String[] args) {
		/*BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm(new BubbleSort());
		int searchValue = binarySearchAlgorithm.searchValue(new int[]{10,20,30}, 10 );
		System.out.println(searchValue);*/
		SpringApplication.run(SpringIn5StepApplication.class, args);
        /*BinarySearchAlgorithm binarySearchAlgorithm = applicationContext.getBean(BinarySearchAlgorithm.class);
        BinarySearchAlgorithm binarySearchAlgorithm1 = applicationContext.getBean(BinarySearchAlgorithm.class);

        System.out.println(binarsomeExternalPropertiesySearchAlgorithm);
        System.out.println(binarySearchAlgorithm1);
        int result = binarySearchAlgorithm.searchValue(new int[]{12,20}, 10);
        System.out.println(result);*/



	}

}


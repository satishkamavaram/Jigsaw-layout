package com.satish.jigsaw.main;

import java.util.List;

import com.satish.serviceconsumer.ServiceConsumerIF;
import com.satish.serviceconsumer.Task;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to JIGSAW!!!");
		List<ServiceConsumerIF> listOfProviders = Task.getListOfServiceProviders();
		listOfProviders.forEach(sp -> sp.printProvider());
	}
}

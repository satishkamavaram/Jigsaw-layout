package com.satish.TaskproviderOne;

import com.satish.serviceconsumer.ServiceConsumerIF;

public class ServiceProviderOne implements ServiceConsumerIF {

	@Override
	public void printProvider() {
	System.out.println("Provider One:::::::");
	}

	
}

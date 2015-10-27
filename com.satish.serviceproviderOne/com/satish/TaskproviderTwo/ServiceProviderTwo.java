package com.satish.TaskproviderTwo;

import com.satish.serviceconsumer.ServiceConsumerIF;

public class ServiceProviderTwo implements ServiceConsumerIF {

	@Override
	public void printProvider() {
	System.out.println("Provider Two:::::::");
	}

	
}

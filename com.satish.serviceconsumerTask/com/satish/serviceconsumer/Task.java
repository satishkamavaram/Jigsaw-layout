package com.satish.serviceconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Task {

	public static List<ServiceConsumerIF> getListOfServiceProviders()
	{
		List<ServiceConsumerIF> listOfProviders = new ArrayList<ServiceConsumerIF>();
		ServiceLoader<ServiceConsumerIF> ServiceConsumers = ServiceLoader.load(ServiceConsumerIF.class);
		ServiceConsumers.forEach(p -> listOfProviders.add(p));
		return listOfProviders;
	}
	
}

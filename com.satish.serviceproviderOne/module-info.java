module com.satish.serviceproviderOne{
	requires com.satish.serviceconsumerTask;
	provides com.satish.serviceconsumer.ServiceConsumerIF with com.satish.TaskproviderOne.ServiceProviderOne;
	provides com.satish.serviceconsumer.ServiceConsumerIF with com.satish.TaskproviderTwo.ServiceProviderTwo;
}
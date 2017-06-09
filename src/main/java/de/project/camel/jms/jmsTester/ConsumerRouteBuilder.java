package de.project.camel.jms.jmsTester;

import org.apache.camel.builder.RouteBuilder;

public class ConsumerRouteBuilder extends RouteBuilder{

	@Override
	public void configure()
		throws Exception
	{
		from("jms:queue:ExpiryQueue").log("Body is: ${body}");
		
	}
}

package de.project.camel.jms.jmsTester;

import org.apache.camel.builder.RouteBuilder;

public class JmsRouteBuilder extends RouteBuilder{

	@Override
	public void configure()
		throws Exception
	{
		// TODO Auto-generated method stub
		from("quartz2://myGroup/myTimerName?trigger.repeatInterval=5000").setBody(simple("HelloWorld")).to("jms:queue:ExpiryQueue");
		
	}
}

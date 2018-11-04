package com.mobile.data.usage;

import javax.xml.ws.Endpoint;

public class MobileDataUsagePublisher {
	public static void main(String[] args) {
		  Endpoint.publish("http://localhost:8080/WS/MobileDataUsageIntf",new MobileDataUsageImpl());
		 }
}

package com.mobile.data.usage;

import javax.jws.WebService;


@WebService(endpointInterface="com.mobile.data.usage.MobileDataUsageIntf")
public class MobileDataUsageImpl implements MobileDataUsageIntf{


	public String getMobileData(String phNumber) {
		StringBuilder builder = new StringBuilder();
		String totatCalls="23";
		String totalSms="5";
		String mobileInternateDataUsed="2.5GB";
		String billedAmount="257";
		String unbilledAmount="500";
		String billDate="07/12/2017";
		String billPlan="PLAN500";
		builder.append("--------------------------Mobile Usage---------------------- \n");
		builder.append("Mobile Data Usage for Phone Number: "+phNumber).append("\n");
		builder.append("Total Calls: ").append(totatCalls).append("\n");
		builder.append("Total SMS: ").append(totalSms).append("\n");
		builder.append("Total Mobile Internate Data Used: ").append(mobileInternateDataUsed).append("\n");
		builder.append("Billed Amount: ").append(billedAmount).append("\n");
		builder.append("Unbilled Amount: ").append(unbilledAmount).append("\n");
		builder.append("Bill Date: ").append(billDate).append("\n");
		builder.append("Bill Plan: ").append(billPlan).append("\n");
		builder.append("--------------------------Mobile Usage----------------------");
		
		
		return builder.toString();
		
		
	}

}

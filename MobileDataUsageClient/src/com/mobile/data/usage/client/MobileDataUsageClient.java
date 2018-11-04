package com.mobile.data.usage.client;

import com.mobile.data.usage.MobileDataUsageImplService;
import com.mobile.data.usage.MobileDataUsageIntf;

public class MobileDataUsageClient {

	public static void main(String[] args) {
		MobileDataUsageImplService mobileDataUsageImplService = new MobileDataUsageImplService();
		MobileDataUsageIntf mobileData = mobileDataUsageImplService.getMobileDataUsageImplPort();
        System.out.println(mobileData.getMobileData("97979877787"));

	}

}

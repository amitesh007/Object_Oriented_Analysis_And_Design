package com.mobile.data.usage;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MobileDataUsageIntf {
	@WebMethod public String getMobileData(String data);
}

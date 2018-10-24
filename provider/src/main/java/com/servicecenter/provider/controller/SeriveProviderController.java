package com.servicecenter.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.servicecenter.provider.model.ServiceItem;
import com.servicecenter.provider.proxy.request.ServiceItemRequest;
import com.servicecenter.provider.proxy.response.ServiceItemResponse;
import com.servicecenter.provider.service.ServiceItemService;

@RestController
public class SeriveProviderController {
	
	@Autowired ServiceItemService serviceItemService;
	@PostMapping(value="/addservice", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ServiceItemResponse createService(@RequestBody ServiceItemRequest serviceItemRequest) {
		ServiceItemResponse serviceItemResponse = new ServiceItemResponse();
		ServiceItem item =  null;
		boolean addStatus = true;
		try {
			item = serviceItemService.addService(serviceItemRequest.getServiceItem());
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(item == null) {
			addStatus = false;
		}
		serviceItemResponse.setServiceItem(item); 
		serviceItemResponse.setAddStatus(addStatus);
		return serviceItemResponse;
	}

}

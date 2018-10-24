package com.servicecenter.provider.proxy.response;

import com.servicecenter.provider.model.ServiceItem;

public class ServiceItemResponse {
	private ServiceItem serviceItem;
	private boolean addStatus;
	public ServiceItem getServiceItem() {
		return serviceItem;
	}
	public void setServiceItem(ServiceItem serviceItem) {
		this.serviceItem = serviceItem;
	}
	public boolean isAddStatus() {
		return addStatus;
	}
	public void setAddStatus(boolean addStatus) {
		this.addStatus = addStatus;
	}

}

package com.servicecenter.provider.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicecenter.provider.model.ServiceItem;
import com.servicecenter.provider.repository.ServiceItemRepository;
import com.servicecenter.provider.service.ServiceItemService;

@Service
@Transactional
public class ServiceItemServiceImpl implements ServiceItemService{
	@Autowired
	ServiceItemRepository serviceItemRepository;

	@Override
	public ServiceItem addService(ServiceItem serviceItem) {
		ServiceItem item = serviceItemRepository.save(serviceItem);
		return item;
	}

	
}

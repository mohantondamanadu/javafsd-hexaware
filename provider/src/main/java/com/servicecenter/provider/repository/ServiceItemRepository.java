package com.servicecenter.provider.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.servicecenter.provider.model.ServiceItem;

@Component
public interface ServiceItemRepository extends CrudRepository<ServiceItem, Long> {
	
}

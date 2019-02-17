package com.example.service.circuitbreaker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "inventory-service" , fallback=HystrixInventoryFallback.class)
public interface InventoryServiceClient {

	@RequestMapping(method= RequestMethod.GET, value="/api/v1/books/{isbn}/inventory")
	public Integer getInventory(@PathVariable("isbn") String isbn);
}

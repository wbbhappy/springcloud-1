package com.hcmony;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-server")
public interface TestService {
	@RequestMapping("/test")
	public String test();
}

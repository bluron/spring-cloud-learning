package org.bluron.consumerserver;

import org.bluron.producerclient.UserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "producer-server", fallback = UserServiceFallback.class)
public interface UserServiceClient extends UserService {

}

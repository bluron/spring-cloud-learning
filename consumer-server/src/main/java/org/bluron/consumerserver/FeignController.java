package org.bluron.consumerserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    private UserServiceClient userServiceClient;

    @RequestMapping(value = "/getUsername")
    public String getUsernameById() {
        return userServiceClient.getUsername();
    }

}

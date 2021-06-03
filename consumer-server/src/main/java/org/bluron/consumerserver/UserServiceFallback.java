package org.bluron.consumerserver;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserServiceClient {

    @Override
    public String getUsername() {
        return "默认值";
    }

}

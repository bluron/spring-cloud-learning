package org.bluron.producerserver;

import org.bluron.producerclient.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserService {

    @Override
    public String getUsername() {
        return "李四";
    }

}

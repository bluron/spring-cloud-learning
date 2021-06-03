package org.bluron.producerclient;

import org.springframework.web.bind.annotation.GetMapping;

public interface UserService {

    @GetMapping(value = "/getUsername")
    String getUsername();

}

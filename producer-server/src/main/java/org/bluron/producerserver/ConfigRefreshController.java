package org.bluron.producerserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigRefreshController {

    @Value("${from}")
    private String from;

    @GetMapping(value = "/from")
    public String getFrom() {
        return this.from;
    }

}

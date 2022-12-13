package controller;

import model.LimitesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitesConfigurationController {

    @Autowired
    private LimitesConfiguration limits;

    @GetMapping("/limits")
    public LimitesConfiguration returnLimits(){
    return new LimitesConfiguration(limits.getMaximum(),limits.getMinimum());
    }
}

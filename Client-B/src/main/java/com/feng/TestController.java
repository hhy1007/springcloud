package com.feng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengzp
 * @date 17/5/9
 * @email fengzp@gzyitop.com
 */
@RestController
public class TestController {

    @Autowired
    ServiceAFeignClient serviceAFeignClient;

    @RequestMapping("/hi")
    public String hi(@RequestParam String id){
        return serviceAFeignClient.hi(id);
    }
}

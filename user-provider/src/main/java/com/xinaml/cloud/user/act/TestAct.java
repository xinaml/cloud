package com.xinaml.cloud.user.act;

import com.alibaba.fastjson.JSON;
import com.xinaml.cloud.user.ser.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAct {

    @Autowired
    private UserSer userSer;
    @Value("${server.port}")
    String port;

    @GetMapping("/search")
    public String test() throws Exception {
        return JSON.toJSONString(userSer.findAll());
    }

    @Value("${foo}")
    String foo;

    /**
     * 获取远程配置
     *
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

}

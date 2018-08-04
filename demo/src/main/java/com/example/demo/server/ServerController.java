package com.example.demo.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ServerController {

    @Autowired
    private ServerService serverService;

    @RequestMapping("/hi")
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping("/servers")
    public List<Server> getAllServers() {
        return serverService.getAllServers();
    }

    @RequestMapping(method = RequestMethod.POST, value="/servers")
    public void addServers(@RequestBody List<Server> servers) {
        serverService.addServers(servers);
    }
}

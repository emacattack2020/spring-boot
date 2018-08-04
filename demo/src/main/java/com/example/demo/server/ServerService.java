package com.example.demo.server;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServerService {
    private List<Server> servers =
            new ArrayList<>(Arrays.asList(
                    new Server("test server 1", 10, 2222),
                    new Server("test server 2", 20, 3333),
                    new Server("test server 3", 30, 4444)
            ));

    public List<Server> getAllServers() {
        return servers;
    }

    public void addServers(List<Server> servers) {
        this.servers = servers;
    }
}

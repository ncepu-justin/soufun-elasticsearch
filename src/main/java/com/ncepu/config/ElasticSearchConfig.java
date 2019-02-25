package com.ncepu.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Justin
 * 2018/8/23  17:09
 */
@Configuration
public class ElasticSearchConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {

        Settings settings = Settings.builder()
                .put("cluster.name", "justin")
               // .put("client.transport.sniff", true)
                .build();

        PreBuiltTransportClient client = new PreBuiltTransportClient(settings);

        int[] local_ports = {9300, 9301, 9302};
        for (int port : local_ports) {
            client.addTransportAddress(new TransportAddress(
                    InetAddress.getByName("40.73.34.210"), port
            ));
        }

        return client;
    }
}

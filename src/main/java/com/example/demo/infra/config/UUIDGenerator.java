package com.example.demo.infra.config;

import com.example.demo.core.service.IdentificadorGenerator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDGenerator implements IdentificadorGenerator {
    @Override
    public UUID gerarUUID() {
        return  UUID.randomUUID();
    }
}

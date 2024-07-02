package com.generation.helloworld.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MyService {

    public List<String> getBsms() {
        return Arrays.asList(
            "Proatividade",
            "Orientação ao Futuro",
            "Responsabilidade Pessoal",
            "Comunicação",
            "Trabalho em Equipe",
            "Mentalidade de Crescimento",
            "Persistência",
            "Orientação ao Detalhe"
        );
    }

    public List<String> getObjectives() {
        return Arrays.asList(
            "Estudar Spring Boot",
            "Praticar Java",
            "Desenvolver um projeto Spring",
            "Revisar conceitos de REST"
        );
    }
}

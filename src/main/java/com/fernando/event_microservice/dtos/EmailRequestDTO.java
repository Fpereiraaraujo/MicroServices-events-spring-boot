package com.fernando.event_microservice.dtos;

public record EmailRequestDTO(
        String to,
        String subject,
        String body
) {
}

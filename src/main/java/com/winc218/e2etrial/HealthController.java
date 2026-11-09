package com.winc218.e2etrial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Exposes a read-only endpoint for verifying that the trial application is running.
 */
@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP");
    }

    /**
     * Immutable health response payload.
     *
     * @param status current application status
     */
    public record HealthResponse(String status) {
    }
}

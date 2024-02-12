package dev.matheuscruz;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Locale;

@ApplicationScoped
public class UppercasePingService implements PingService {
    @Override
    public String ping() {
        return "ping".toUpperCase(Locale.ROOT);
    }
}

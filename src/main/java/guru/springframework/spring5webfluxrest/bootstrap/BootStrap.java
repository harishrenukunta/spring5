package guru.springframework.spring5webfluxrest.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        loadVendors();

    }

    private void loadVendors() {

    }
}

package org.thoth.boot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    protected ConfigurationRepository valuesRepository;

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Spring boot command line runner running ...%n");
        System.out.printf("Hard coded = \"%s\"%n", valuesRepository.getHardCoded());
        System.out.printf("Application name (common) = \"%s\"%n", valuesRepository.getApplicationName());
        System.out.printf("Personal name (profile) = \"%s\"%n", valuesRepository.getPersonalName());

    }
}

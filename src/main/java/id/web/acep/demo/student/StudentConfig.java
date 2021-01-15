package id.web.acep.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
              Student uu = new Student(
                    "UU",
                    "aa@gmail.com",
                    LocalDate.of(2000, AUGUST, 15)
                );

              Student ee = new Student(
                  "ee",
                  "ee@gmail.com",
                  LocalDate.of(2004, AUGUST, 15)
              );

              repository.saveAll(
                  List.of(uu, ee)
              );
        };
    }
}

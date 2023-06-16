package Qara.evo;

import Qara.evo.Model.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class EvoApplication implements CommandLineRunner {


    @Value("${ms.value}")
    private String companyName;

//    @Value("${ms.version}")
//    private String version;

    public static void main(String[] args) {
        SpringApplication.run(EvoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = Student.builder()
                .surname("Huseyn")
                .id(10)
                .build();
       log.info("student: {}", student);

        System.out.println(companyName);
//        System.out.println(version);
    }


}

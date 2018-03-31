package edu.kidswhocode.studentmgmt;
import com.github.javafaker.Faker;
import edu.kidswhocode.studentmgmt.domain.Level;
import edu.kidswhocode.studentmgmt.domain.Student;
import edu.kidswhocode.studentmgmt.repository.LevelRepository;
import edu.kidswhocode.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

@Component
public class LevelInitTester {
    @Autowired
    private LevelRepository levelRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostConstruct
    public void initLevels() {
//        studentRepository.deleteAll();
//        levelRepository.deleteAll();
//        Level level = new Level();
//        level.setName("KG");
//        Level savedLevel = levelRepository.save(level);
//
//        for (int i = 1; i <= 8; i++) {
//            level = new Level();
//            level.setName(String.valueOf(i));
//            savedLevel = levelRepository.save(level);
//            generateStudents(savedLevel);
//        }
    }

    private void generateStudents(Level level) {
        Faker faker = new Faker();
        IntStream.range(0,10).forEach(i -> {
            Student s = new Student();
            s.setLevel(level);
            s.setFirstName(faker.name().firstName());
            s.setLastName(faker.name().lastName());
            s.setPhoneNumber(faker.phoneNumber().phoneNumber());
            s.setEmail(faker.internet().emailAddress());
            studentRepository.save(s);
        });
    }
}


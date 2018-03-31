package edu.kidswhocode.studentmgmt;

import edu.kidswhocode.studentmgmt.repository.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		SecurityAutoConfiguration.class
})
public class StudentmgmtApplication {

	@Autowired
	private LevelRepository levelRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentmgmtApplication.class, args);
	}

}

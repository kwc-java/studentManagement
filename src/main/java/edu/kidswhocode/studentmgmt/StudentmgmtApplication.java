package edu.kidswhocode.studentmgmt;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;
import edu.kidswhocode.studentmgmt.domain.Level;
import edu.kidswhocode.studentmgmt.repository.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmgmtApplication {

	@Autowired
	private LevelRepository levelRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentmgmtApplication.class, args);
	}

}

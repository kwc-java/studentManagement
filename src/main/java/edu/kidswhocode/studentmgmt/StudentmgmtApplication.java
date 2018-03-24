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

	public void generateLevels() {
		Level level = new Level();
		level.setName("KG");
		levelRepository.save(level);

		for (int i = 1; i <= 8; i++) {
			level = new Level();
			level.setName(String.valueOf(i);
			levelRepository.save(level);
		}
	}
}

package edu.kidswhocode.studentmgmt;

import edu.kidswhocode.studentmgmt.domain.Level;
import edu.kidswhocode.studentmgmt.repository.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LevelInitTester {
    @Autowired
    private LevelRepository levelRepository;

    @PostConstruct
    public void initLevels() {
        levelRepository.deleteAll();
        Level level = new Level();
        level.setName("KG");
        levelRepository.save(level);

        for (int i = 1; i <= 8; i++) {
            level = new Level();
            level.setName(String.valueOf(i));
            levelRepository.save(level);
        }
    }
}


package edu.kidswhocode.studentmgmt.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Student extends Person {
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(level, student.level);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), level);
    }
}


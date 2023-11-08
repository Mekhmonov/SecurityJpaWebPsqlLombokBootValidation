package uz.najottalim.SecurityJpaWebPsqlLombokBootValidation.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    Long Id;

    String name;

    @ManyToMany
    List<Group> groupList;

    @ManyToMany
    List<Teacher> teachers;
}

package com.example.lombok.builder.inheritance.buildermethodname;

import com.example.lombok.builder.inheritance.builderMethodName.Child;
import com.example.lombok.builder.inheritance.builderMethodName.Student;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuilderInheritanceUsingMethodNameUnitTest {

    @Test
    public void givenBuilderAtMethodLevel_ChildInheritingParentIsBuilt() {
        Child child = Child.childBuilder()
                .parentName("Andrea")
                .parentAge(38)
                .childName("Emma")
                .childAge(6)
                .build();

        assertThat(child.getChildName()).isEqualTo("Emma");
        assertThat(child.getChildAge()).isEqualTo(6);
        assertThat(child.getParentName()).isEqualTo("Andrea");
        assertThat(child.getParentAge()).isEqualTo(38);
    }

    @Test
    public void givenSuperBuilderOnAllThreeLevels_StudentInheritingChildAndParentIsBuilt() {
        Student student = Student.studentBuilder()
                .parentName("Andrea")
                .parentAge(38)
                .childName("Emma")
                .childAge(6)
                .schoolName("Baeldung High School")
                .build();

        assertThat(student.getChildName()).isEqualTo("Emma");
        assertThat(student.getChildAge()).isEqualTo(6);
        assertThat(student.getParentName()).isEqualTo("Andrea");
        assertThat(student.getParentAge()).isEqualTo(38);
        assertThat(student.getSchoolName()).isEqualTo("Baeldung High School");
    }
}

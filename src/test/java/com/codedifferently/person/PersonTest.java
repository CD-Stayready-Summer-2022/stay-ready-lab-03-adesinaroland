package com.codedifferently.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    @DisplayName("PersonTest")
    public void constructorTest01(){
        Person person = new Person("Roland","Adesina","911");
        String expected = "Roland Adesina 911";

        String actual = person.toString();

        Assertions.assertEquals(expected, actual);
    }
}

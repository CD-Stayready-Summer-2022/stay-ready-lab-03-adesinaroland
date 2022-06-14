package com.codedifferently.phonebook;

import com.codedifferently.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    @DisplayName("PhoneBookTest")
    public void constructorTest01(){
        Person person = new Person("Roland", "Adesina", "911");
        PhoneBook phonebook = new PhoneBook();
        phonebook.addPersonToPhoneBook(person);

        Assertions.assertNotNull(phonebook);
        
    }

    @Test
    @DisplayName("getNumberofPeopleTest")
    public void getNumberofPeopleTest(){
        Person person = new Person("Roland", "Adesina", "911");
        PhoneBook phonebook = new PhoneBook();
        phonebook.addPersonToPhoneBook(person);
        Integer expected = 1;

        Integer actual = phonebook.getNumberofPeople();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("findNumberTest")
    public void findPersonTest() throws PersonNotFoundException{
        Person person = new Person("Roland", "Adesina", "911");
        PhoneBook phonebook = new PhoneBook();
        phonebook.addPersonToPhoneBook(person);

        Person person1 = phonebook.findPersonByName("Roland", "Adesina");

        Assertions.assertEquals(person, person1);

    }

    @Test
    @DisplayName("findNumberTestFail")
    public void findPersonTestFail(){
        Assertions.assertThrows(PersonNotFoundException.class, ()->{
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.findPersonByName("A", "B");
        });
    }
}

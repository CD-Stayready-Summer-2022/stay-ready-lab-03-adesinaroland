package com.codedifferently.phonebook;

import com.codedifferently.person.Person;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Person> people;

    public PhoneBook(){
        people = new ArrayList<Person>();
    }

    public Integer getNumberofPeople(){
        return people.size();
    }

    public void addPersonToPhoneBook(Person person){
        people.add(person);
    }

    public Person findPersonByName(String firstName, String lastName) throws PersonNotFoundException{

        for(int i = 0; i < people.size(); i++){
            Person person = people.get(i);
            if (person.getFirstName() == firstName && person.getLastName() == lastName){
                return person;
            }
        }
        String error = String.format("Person with first name %s and last name %s was not found", firstName, lastName);
        throw new PersonNotFoundException(error);
    }
}

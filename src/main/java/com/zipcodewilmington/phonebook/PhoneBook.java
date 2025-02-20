package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
    String name;
    String phoneNumber;

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phonebook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
            phonebook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if (phonebook.containsKey(name)){
            return true;
        } else
        return false;
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        for (String name : phonebook.keySet()) {
            if (phonebook.get(name).contains(phoneNumber)) {
                return name;
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return phonebook.get(name);
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}

package com.contacts.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact{
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Contact[id=%d, name='%s']", id, name);
    }
}

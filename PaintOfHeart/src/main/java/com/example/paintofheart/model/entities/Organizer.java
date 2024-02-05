package com.example.paintofheart.model.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "organizer", schema = "project")
@PrimaryKeyJoinColumn(name = "id_user")
public class Organizer extends User{

    public Organizer(String username, String email, String surname, String name, String phoneNumber, String password) {
        super(username, email, surname, name, phoneNumber, password);
    }

    @Override
    public int userType() {
        return 4;
    }
}

package br.com.finai.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @ManyToOne
    private User user;


}

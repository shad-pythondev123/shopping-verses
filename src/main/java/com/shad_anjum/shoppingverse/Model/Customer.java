package com.shad_anjum.shoppingverse.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Customer {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}

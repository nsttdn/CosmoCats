package com.example.cosmocats.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Category {

    Long id;

    String name;

}

package com.rsoi.hotels.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "Cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;
    @Getter
    @Column(unique = true)
    @NonNull
    private UUID cityUid = UUID.randomUUID();
    @Getter
    @Setter
    @NonNull
    private String name;
    @ManyToOne(fetch= FetchType.EAGER)
    private Country country;
}

package org.application.core.studentrestapi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Column(name = "testscore")
    private int testScore;
}

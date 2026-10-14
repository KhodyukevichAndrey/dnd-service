package com.dnd_glory.dnd_service.model.race;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@Entity
@Table(name = "race")
@NoArgsConstructor
@AllArgsConstructor
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "visual_name")
    private String visualName;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "changed_at")
    private Timestamp changedAt;
}

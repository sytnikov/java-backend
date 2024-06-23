package dev.sytnikov.java_backend.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID id;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String username;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false, unique = true)
    private String email;
}

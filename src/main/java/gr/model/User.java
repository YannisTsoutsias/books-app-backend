package gr.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users", schema = "mydb")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;
}
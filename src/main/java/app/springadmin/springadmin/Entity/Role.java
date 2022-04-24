package app.springadmin.springadmin.Entity;

import app.springadmin.springadmin.enums.ERole;
import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;
}

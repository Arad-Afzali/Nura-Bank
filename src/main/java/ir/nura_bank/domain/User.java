package ir.nura_bank.domain;

import ir.nura_bank.base.domain.BaseEntity;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = User.TABLE_NAME)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseEntity<Long> {

    public static final String TABLE_NAME = "user";

    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String ssn;

    @Column(unique = true, nullable = true)
    private String email;

    private LocalDate dateOfBirth;

    @OneToOne
    private Account account;

    @Column(nullable = false)
    private String Password;

    @ManyToMany
    @Fetch(value = FetchMode.JOIN)
    private Set<Role> roles = new HashSet<>();

    @Column(nullable = false)
    private Boolean active = false;

}

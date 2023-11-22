package jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    public Member(String userName) {
        this.userName = userName;
    }
}

package study.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;

    // JPA 표준스펙에 엔티티는 기본 생성자가 있어야 한다.
    protected Member() {
    }

    public Member(String username) {
        this.username = username;
    }
}

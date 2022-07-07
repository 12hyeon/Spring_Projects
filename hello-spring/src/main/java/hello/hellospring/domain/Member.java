package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member { // JPA 관리 entitiy

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 자동 생성
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

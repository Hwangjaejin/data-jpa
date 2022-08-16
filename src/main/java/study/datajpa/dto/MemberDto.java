package study.datajpa.dto;

import lombok.Data;
import study.datajpa.entity.Member;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    // 엔티티는 DTO를 의존하면 안되지만 DTO는 엔티티를 의존해도 된다.
    public MemberDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
    }
}

package com.preproject.mainserver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/members")
@RestController
public class MemberController {


    private final MemberRepository memberRepository;

    @PostMapping
    public ResponseEntity postMember() {

        Member member = new Member();
        member.setMemberId(1L);
        member.setName("김");
        Member save = memberRepository.save(member);

        return new ResponseEntity(save, HttpStatus.OK);
    }


}

package com.bibleapp.bo.member.repository;


import com.bibleapp.bo.member.entity.Member;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findByUsername(String username);

    Optional<Member> findByNickname(String nickname);

    Optional<Member> findById(String id);
}

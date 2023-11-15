package com.bibleapp.bo.member.repository;

import com.bibleapp.bo.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepositoryImpl extends MemberRepository, JpaRepository<Member, String> {
}

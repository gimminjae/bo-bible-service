package com.bibleapp.bo.member.service;

import java.util.Map;
import com.bibleapp.bo.member.dto.LoginDto;
import com.bibleapp.bo.member.dto.MemberDto;
import com.bibleapp.bo.member.dto.SignUpDto;

public interface MemberService {

    void signUp(SignUpDto signUpDto);

    Map<String, String> login(LoginDto loginDto);

    void confirmMemberByNickname(String nickname);

    void confirmMemberByUsername(String username);

    MemberDto getByUsername(String username);

    String getAccessTokenWithRefreshToken(String refreshToken);

    void signOut(String memId);
}

package com.diary.repository;

import com.diary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // 이메일로 사용자 찾기 (로그인용)
    Optional<User> findByEmail(String email);

    // 이메일 존재 여부 확인 (중복 체크용), 회원가입 시 이메일 중복체크용
    boolean existsByEmail(String email);

    // 이메일과 비밀번호로 찾기 (로그인 검증용)
    Optional<User> findByEmailAndPassword(String email, String password);
}

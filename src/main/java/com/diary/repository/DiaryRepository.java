package com.diary.repository;

import com.diary.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {

    List<Diary> findByUserId

    // 일기 1개 조회
    Optional<Diary> findById(Long id);

    // 사용자별 일기 목록
    List<Diary> findByUserIdOrderByCreatedAtDesc(Long userId);

    // 특정 날짜 일기
    Optional<Diary> findByUserIdAndDiaryDate(Long userId, LocalDate diaryDate);

    // 중복 작성 체크
    boolean existsByUserIdAndDiaryDate(Long userId, LocalDate diaryDate);
}

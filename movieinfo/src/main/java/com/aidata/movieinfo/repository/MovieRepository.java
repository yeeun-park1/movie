package com.aidata.movieinfo.repository;

import com.aidata.movieinfo.entity.Movie;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface MovieRepository
        extends JpaRepository<Movie, Long> {
    //페이징 처리를 위한 Pageable 객체를 두번째 파라미터로 작성.
    Page<Movie> findByMnameContains(String keyword, Pageable pb);
    Page<Movie> findByMdirectorContains(String keyword, Pageable pb);
}

package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.Question;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}

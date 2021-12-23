package com.Ozyegin.CS393.Repository;

import com.Ozyegin.CS393.Model.AnswerComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerCommentRepository extends JpaRepository<AnswerComment, Integer> {
}

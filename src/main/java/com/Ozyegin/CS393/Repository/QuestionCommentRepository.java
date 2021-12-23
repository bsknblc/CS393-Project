package com.Ozyegin.CS393.Repository;

import com.Ozyegin.CS393.Model.QuestionComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionCommentRepository extends JpaRepository<QuestionComment, Integer> {
}


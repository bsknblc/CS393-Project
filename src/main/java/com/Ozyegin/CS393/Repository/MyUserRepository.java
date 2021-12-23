package com.Ozyegin.CS393.Repository;

import com.Ozyegin.CS393.Model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
    public MyUser findById(int id);
}

package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImp implements MyUserService{
    @Autowired
    MyUserRepository myUserRepository;

    public MyUser save(MyUser myUser) {
        return myUserRepository.save(myUser);}
}

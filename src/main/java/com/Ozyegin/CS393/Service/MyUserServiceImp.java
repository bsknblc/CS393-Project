package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.MyUserDTO;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserServiceImp implements MyUserService{
    @Autowired
    MyUserRepository myUserRepository;

    public MyUser save(MyUser myUser) {
        return myUserRepository.save(myUser);}

    public List<MyUserDTO> findAll(){
        List<MyUser> myUsers = myUserRepository.findAll();
        List<MyUserDTO> myUserDTOS = new ArrayList<MyUserDTO>();
        for (MyUser myUser: myUsers) {
            myUserDTOS.add(new MyUserDTO(myUser.getUserId(), myUser.getName(), myUser.getQuestions(), myUser.getAnswers(), myUser.getQuestionComments(), myUser.getAnswerComments()));
        }
        return myUserDTOS;
    }

    public MyUserDTO findById(int id){
        MyUser myUser = myUserRepository.findById(id);
        MyUserDTO myUserDTO = new MyUserDTO(myUser.getUserId(), myUser.getName(), myUser.getQuestions(), myUser.getAnswers(), myUser.getQuestionComments(), myUser.getAnswerComments());
        return myUserDTO;
    }

    public void deleteById(int id){ myUserRepository.deleteById(id); }
}


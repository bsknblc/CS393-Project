package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.MyUserDTO;
import com.Ozyegin.CS393.Model.MyUser;

import java.util.List;

public interface MyUserService {
    public MyUser save(MyUser myUser);
    public List<MyUserDTO> findAll();
    public MyUserDTO findById(int id);
    public void deleteById(int id);
}

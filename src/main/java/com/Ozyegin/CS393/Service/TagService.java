package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.TagDTO;
import com.Ozyegin.CS393.Model.Tag;

import java.util.List;

public interface TagService {
    public Tag save(Tag tag);
    public List<TagDTO> findAll();
    public TagDTO findById(int id);
    public void deleteById(int id);
}

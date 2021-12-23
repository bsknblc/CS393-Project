package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.TagDTO;
import com.Ozyegin.CS393.Model.Tag;
import com.Ozyegin.CS393.Repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImp implements TagService {
    @Autowired
    TagRepository tagRepository;

    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    public List<TagDTO> findAll(){
        List<Tag> tags = tagRepository.findAll();
        List<TagDTO> tagDTOs = new ArrayList<TagDTO>();
        for (Tag tag: tags) {
            tagDTOs.add(new TagDTO(tag.getTagId()));
        }
        return tagDTOs;
    }

    public TagDTO findById(int id){
        Tag tag = tagRepository.findById(id);
        TagDTO tagDTO = new TagDTO(tag.getTagId());
        return  tagDTO;
    }

    public void deleteById(int id){ tagRepository.deleteById(id); }
}

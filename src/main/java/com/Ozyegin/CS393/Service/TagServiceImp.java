package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.Model.Tag;
import com.Ozyegin.CS393.Repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImp implements TagService {
    @Autowired
    TagRepository tagRepository;

    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }
}

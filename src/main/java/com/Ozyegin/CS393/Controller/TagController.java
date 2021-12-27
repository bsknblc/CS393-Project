package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.TagDTO;
import com.Ozyegin.CS393.Model.Tag;
import com.Ozyegin.CS393.Service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {

    @Autowired
    TagService tagService;

    @GetMapping
    public List<TagDTO> findAll(){ return tagService.findAll(); }

    @GetMapping("/{tag-id}")
    public TagDTO getTagById(@PathVariable("tag-id") int id) {return tagService.findById(id); }

    @DeleteMapping("/{tag-id}")
    public void deleteById(@PathVariable("tag-id") int id){ tagService.deleteById(id); }

    @PostMapping
    public Tag save(@RequestBody Tag tag){
        return tagService.save(tag);
    }

}
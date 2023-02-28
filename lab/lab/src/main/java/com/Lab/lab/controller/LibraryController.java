package com.Lab.lab.controller;

import com.Lab.lab.model.Library;
import com.Lab.lab.service.IlibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private IlibraryService ilibaryService;
    @GetMapping("getlibrary/{id}")
    public Library findLibrary(@PathVariable int id)
    {
        return ilibaryService.getLibrary(id);
    }

    @GetMapping("/getAlllibarary")
    public List<Library> getListofLibary()
    {
        return ilibaryService.findAll();
    }
    @PostMapping("addLibrary")
    public void addLibrary(@RequestBody Library librayDetails)
    {
        ilibaryService.addLibrary(librayDetails);
    }
    @PutMapping("/updateLibrary/{LibaryId}")
    public void  updateLibrary(@PathVariable int LibaryId,@RequestBody Library librayDetails)
    {
        ilibaryService.updateById(LibaryId,librayDetails);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id)
    {
        ilibaryService.deleteLibarryByid(id);
    }

}

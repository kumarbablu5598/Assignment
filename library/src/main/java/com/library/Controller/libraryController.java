package com.library.Controller;

import com.library.library.Library;
import com.library.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class libraryController {
    @Autowired
    private LibraryService libservice;
    @GetMapping("getlibrary/{id}")
    public Library findLibrary(@PathVariable int id){
        return libservice.getLibrary(id);
    }

    @GetMapping("/getAlllibarary")
    public List<Library> getListofLibary(){
        return libservice.findAll();
    }
    @PostMapping("addLibrary")
    public void addLibrary(@RequestBody Library librayDetails){
        libservice.addLibrary(librayDetails);
    }
    @PutMapping("/updateLibrary")
    public void  updateLibrary(@PathVariable int LibaryId,@RequestBody Library librayDetails)
    {
        libservice.updateById(LibaryId,librayDetails);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        libservice.deleteLibarryByid(id);
    }

}

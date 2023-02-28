package com.Lab.lab.service;

import com.Lab.lab.model.Library;
import com.Lab.lab.repo.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService implements IlibraryService {
    private static List<Library> libr = new ArrayList<>();
   @Autowired
    private LibraryRepo libraryRepo;
    @Override
    public  List<Library> findAll() {
        return libraryRepo.findAll();
    }
    @Override
    public Library findById(int id){
        return  libraryRepo.findById(id).get();

    }
    @Override
    public void addLibrary(Library librarydetails){
        libraryRepo.save(librarydetails);
    }
    @Override
    public void deleteByid(int LibararyId){
        libraryRepo.deleteById(LibararyId);
    }
    @Override
    public  void updateById(int LibararyId,Library library) {
        Library upatelibrary = libraryRepo.findById(LibararyId).get();
        upatelibrary.setLibraryAddress(library.getLibraryAddress());
        upatelibrary.setLibraryName(library.getLibraryName());
        libraryRepo.save(upatelibrary);

    }

}

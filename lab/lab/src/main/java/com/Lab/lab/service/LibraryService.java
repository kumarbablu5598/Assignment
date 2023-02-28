package com.Lab.lab.service;

import com.Lab.lab.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService implements IlibraryService {
    private static List<Library> libr = new ArrayList<>();
    static {
        libr.add(new Library(10,"labrary1","patna"));
        libr.add(new Library(20,"labrary2","gaya"));
        libr.add(new Library(30,"labrary3","kolkata"));

    }
    @Override
    public  List<Library> findAll() {
        return libr;
    }
    @Override
    public Library getLibrary(int id){
        Library lb=libr.get(id);
        return lb;
    }
    @Override
    public void addLibrary(Library librarydetails){
        libr.add(librarydetails);
    }
    @Override
    public void deleteLibarryByid(int LibararyId){
        libr.remove(LibararyId);
    }
    @Override
    public  void updateById(int LibararyId,Library library) {
        Library upatelibrary = getLibrary(LibararyId);
        upatelibrary.setLibraryAddress(library.getLibraryAddress());
        upatelibrary.setLibraryName(library.getLibraryName());

    }

}

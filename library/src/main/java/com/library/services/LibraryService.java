package com.library.services;

import com.library.library.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class LibraryService {
    private static List<Library> libr = new ArrayList<>();
    static {
        libr.add(new Library("library1","patna",10,"all type of books"));
        libr.add(new Library("library2","gaya",20,"all type of books"));
        libr.add(new Library("library3","Aurangabad",30,"all type of books"));
    }
    public  List<Library> findAll()
    {
        return libr;
    }
    public Library getLibrary(int id){
        Library lb=libr.get(id);
        return lb;
    }
    public void addLibrary(Library librarydetails){
        libr.add(librarydetails);
    }
    public void deleteLibarryByid(int LibararyId){
        libr.remove(LibararyId);
    }
    public  void updateById(int LibararyId,Library library)
    {
        Library upatelibrary = getLibrary(LibararyId);
        upatelibrary.setLibraryName(library.getLibraryName());
        upatelibrary.setLibraryAddress(library.getLibraryAddress());
        upatelibrary.setLibraryFacilities(library.getLibraryFacilities());
    }
}

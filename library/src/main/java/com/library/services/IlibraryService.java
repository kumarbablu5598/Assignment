package com.library.services;

import com.library.library.Library;

import java.util.List;

public interface IlibaryService {
    public List<Library> findAll();

    public Library getLibrary(int id);

    public void addLibrary(Library librarydetails) ;
    public void deleteLibarryByid(int LibararyId) ;
    public  void updateById(int LibararyId,Library library);

}

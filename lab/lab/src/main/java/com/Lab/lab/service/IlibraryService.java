package com.Lab.lab.service;

import com.Lab.lab.model.Library;

import java.util.List;

public interface IlibraryService {
    public List<Library> findAll();

    public Library getLibrary(int id);

    public void addLibrary(Library librarydetails) ;
    public void deleteLibarryByid(int LibararyId) ;
    public  void updateById(int LibararyId,Library library);

}

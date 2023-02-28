package com.Lab.lab.service;

import com.Lab.lab.model.Library;

import java.util.List;

public interface IlibraryService {
    public List<Library> findAll();

    public Library findById(int id);

    public void addLibrary(Library librarydetails) ;
    public void deleteByid(int LibararyId) ;
    public  void updateById(int LibararyId,Library library);

}

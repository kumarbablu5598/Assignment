package com.Lab.lab.repo;

import com.Lab.lab.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends JpaRepository<Library,Integer> {
}

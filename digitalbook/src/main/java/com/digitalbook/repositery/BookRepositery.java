package com.digitalbook.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalbook.entities.BookEntity;

@Repository
public interface BookRepositery extends JpaRepository<BookEntity, Integer> {

}

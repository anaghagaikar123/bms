package com.bms.database;

import org.springframework.stereotype.Repository;

import com.bms.module.Movie;

@Repository
public class MovieDAOImpl extends GenericDAOImpl<Movie, Long> implements MovieDAO {

}

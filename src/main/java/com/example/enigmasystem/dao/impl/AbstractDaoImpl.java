package com.example.enigmasystem.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractDaoImpl {
    @PersistenceContext
    protected EntityManager entityManager;
}

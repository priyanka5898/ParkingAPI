package com.postmancode.postmancode.dao;

import com.postmancode.postmancode.entity.parking;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class parkingdao implements iparkingdao
{

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<parking> getparkings()
    {
        String hql = "FROM parking";
        return (List<parking>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public parking getparking(int parking_id) {
        return null;
    }

    @Override
    public parking searchparking(String area, String locality, int pincode) {
        return null;
    }

    @Override
    public parking updateparking(int parking_id) {
        return null;
    }

    @Override
    public parking deleteparking(int parking_id) {
        return null;
    }
}

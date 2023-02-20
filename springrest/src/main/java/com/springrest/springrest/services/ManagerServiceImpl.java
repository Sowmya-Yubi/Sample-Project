package com.springrest.springrest.services;

import com.springrest.springrest.dao.ManagerDao;
import com.springrest.springrest.entities.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements  ManagerService{

    @Autowired
    private ManagerDao managerDao;
    @Override
    public List<Manager> getManagers() {
        return this.managerDao.findAll();
    }

    @Override
    public Manager addManager(Manager manager) {
        managerDao.save(manager);
        return manager;
    }
}

package com.example.backendengineerdata.service.custom.serviceImpl;

import com.example.backendengineerdata.service.CrudService;
import com.example.backendengineerdata.service.custom.StudentService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public long count() throws Exception {
        return 0;
    }

    @Override
    public Object save(Object entity) throws Exception {
        return null;
    }

    @Override
    public void update(Object entity) throws Exception {

    }

    @Override
    public void deleteById(Object pk) throws Exception {

    }

    @Override
    public Optional findById(Object pk) throws Exception {
        return Optional.empty();
    }

    @Override
    public List findAll() throws Exception {
        return null;
    }

    @Override
    public boolean existsById(Object pk) throws Exception {
        return false;
    }
}

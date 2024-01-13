package com.example.backendengineerdata.service.custom.serviceImpl;

import com.example.backendengineerdata.entity.Company;
import com.example.backendengineerdata.repository.StudentRepo;
import com.example.backendengineerdata.service.custom.CompanyService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    private StudentRepo studentRepo;
    private ModelMapper mapper;


    @Override
    public long count() throws Exception {
        return 0;
    }

    @Override
    public String save(Company entity) throws Exception {
        return null;
    }

    @Override
    public void update(Company entity) throws Exception {

    }

    @Override
    public boolean deleteById(Integer pk) throws Exception {
        return false;
    }

    @Override
    public Optional<Company> findById(Integer pk) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<Company> findAll() throws Exception {
        return null;
    }

    @Override
    public boolean existsById(Integer pk) throws Exception {
        return false;
    }


}

package com.example.Deployment.Assignment.service;

import com.example.Deployment.Assignment.model.Data;
import com.example.Deployment.Assignment.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    DataRepository titleRepo;


    public Data createTitle(Data data) {
        return titleRepo.save(data);
    }

    public List<Data> getTitle() {
        return titleRepo.findAll();
    }

    public Data getTitleById(int id) {
        return titleRepo.findById(id).get();
    }

    public void updateTitle(int id, Data newData) {
        Data data = titleRepo.findById(id).get();
        data.setTitle(newData.getTitle());
        data.setDescription(newData.getDescription());
        titleRepo.save(data);
    }

    public void deleteTitle(int id) {
        titleRepo.deleteById(id);
    }
}

package com.example.Deployment.Assignment.controller;
import com.example.Deployment.Assignment.model.Data;
import com.example.Deployment.Assignment.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/test")
public class Controller {
    @Autowired
    DataService dataService;
    @PostMapping(value = "create-title")
    public Data createTitle(@RequestBody Data data){
        return dataService.createTitle(data);
    }
    @GetMapping(value = "get-title")
    public List<Data> getTitles(){
        return dataService.getTitle();
    }
    @GetMapping(value = "get-title/{id}")
    public Data getTitleById(@PathVariable int id){
        return dataService.getTitleById(id);
    }
    @PutMapping(value = "update-title/{id}")
    public void updateTitle(@PathVariable int id, @RequestBody Data data){
        dataService.updateTitle(id, data);
    }
    @DeleteMapping(value = "delete-title/{id}")
    public void deleteById(@PathVariable int id){
        dataService.deleteTitle(id);
    }
}

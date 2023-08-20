package com.devsuperior.dscatalog.resources;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {

    @Autowired
    private CategoryService service;
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();
//        list.add(new Category(1L, "Books"));
//        list.add(new Category(2L, "Eletronics"));
        return ResponseEntity.ok().body(list);
    }
}
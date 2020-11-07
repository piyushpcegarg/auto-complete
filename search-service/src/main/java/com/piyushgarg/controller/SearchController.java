package com.piyushgarg.controller;

import java.util.List;

import com.piyushgarg.model.Employee;
import com.piyushgarg.service.SearchService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SearchController {

    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping(path = "/search")
    public List<Employee> getEmployees(@RequestParam(name = "name") String name) {

        return searchService.fetchEmployees(name);
    }
    
}

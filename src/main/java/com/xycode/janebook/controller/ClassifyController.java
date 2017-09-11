package com.xycode.janebook.controller;

import com.xycode.janebook.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;


}

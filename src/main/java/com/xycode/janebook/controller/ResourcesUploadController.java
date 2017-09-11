package com.xycode.janebook.controller;


import com.xycode.janebook.model.Image;
import com.xycode.janebook.service.ResourceUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

@RestController

public class ResourcesUploadController {

    @Autowired
    ResourceUploadService resourceUploadService;

    @PostMapping("/upload")
    public String upload(@RequestParam("file")MultipartFile file, HttpServletRequest request){


        return resourceUploadService.upload(file, "/JBookResource/image/");
    }


    @PostMapping("/multiUpload")
    public Image multiUpload(HttpServletRequest request){
        return  resourceUploadService.multiUpload(request, "files", "http://192.168.231.136:8080/image/","/JBookResource/image/");
//        return  resourceUploadService.multiUpload(request, "files", "file:///D:/Desktop/img/","D:\\Desktop\\img\\");

    }

}

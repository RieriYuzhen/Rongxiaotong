package com.soft.demo6.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "*")
public class FileUpload {
    @PostMapping("/upload")
    public String Upload(MultipartFile file) throws IOException {
        file.transferTo(new File("F:\\学习用\\太仓实践\\imageServer"+file.getOriginalFilename()));
        return "上传成功";
    }
}

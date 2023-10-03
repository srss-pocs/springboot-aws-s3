package com.example.awss3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.HttpMethod;
import com.example.awss3.service.FileService;

@RestController
@RequestMapping("/api/s3")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/getuploadurl")
    public ResponseEntity<String> generateUrl(@RequestParam String fileName) {
        return ResponseEntity.ok(fileService.generatePreSignedUrl(fileName, HttpMethod.PUT));
    }

    @GetMapping("/getdownloadurl")
    public ResponseEntity<String> getUrl(@RequestParam String fileName) {
        return ResponseEntity.ok(fileService.generatePreSignedUrl(fileName, HttpMethod.GET));
    }

}

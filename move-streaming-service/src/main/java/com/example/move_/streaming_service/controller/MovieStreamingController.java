package com.example.move_.streaming_service.controller;


import com.example.move_.streaming_service.services.MoveStreamingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RestController
public class MovieStreamingController {

    @Autowired
    private MoveStreamingService moveCatalogService;



    private static final String VIDEO_DIRECTORY = "/Users/aymanabdulrahman/Movies/";

    @GetMapping("/stream/{videoPath}")
    ResponseEntity<InputStreamResource> streamVideo(@PathVariable String videoPath) throws FileNotFoundException {

        File file = new File(VIDEO_DIRECTORY + videoPath);
        System.out.println("_----__--_-__---25,873,543-----_--__-______" + file.getTotalSpace());


        if (file.exists()) {
            InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType("video/mp4"))
                    .body(inputStreamResource);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/stream/by-id/{id}")
    ResponseEntity<InputStreamResource> streamVideoWithId(@PathVariable Long id) throws FileNotFoundException {

        String videoPath = moveCatalogService.getMoviePath(id);

        File file = new File(VIDEO_DIRECTORY + videoPath);
        System.out.println("_----__--_-__---25,873,543-----_--__-______" + file.getTotalSpace());


        if (file.exists()) {
            InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType("video/mp4"))
                    .body(inputStreamResource);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

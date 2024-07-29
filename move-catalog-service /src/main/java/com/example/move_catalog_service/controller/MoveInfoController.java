package com.example.move_catalog_service.controller;


import com.example.move_catalog_service.model.MoveInfo;
import com.example.move_catalog_service.repository.MoveInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class MoveInfoController {
    @Autowired
    private MoveInfoRepository moveInfoRepository;

    @PostMapping("/movies/save")
    public List<MoveInfo> saveAll(@RequestBody List<MoveInfo> moveInfos) {
        return moveInfoRepository.saveAll(moveInfos);
    }


    @GetMapping("/movies/list")
    public List<MoveInfo> getAll() {
        return moveInfoRepository.findAll();
    }

    @GetMapping("/movies/find/{id}")
    public String findPathById(
            @PathVariable Long id
    ) {
        Optional<MoveInfo> move = moveInfoRepository.findById(id);
        return move.map(MoveInfo::getPath).orElse(null);
    }

}

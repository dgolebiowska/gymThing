package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class ExcercisesService {
    @Autowired
    ExcercisesRepository excercisesRepository;

    @RequestMapping("/excercises")
    @ResponseBody
    public String findAllExcercises() {
        StringBuilder response = new StringBuilder();

        for (AtlasOfExcercises atlasOfExcercises : excercisesRepository.findAll()) {
            response.append(atlasOfExcercises).append("<br>");
        }

        return response.toString();
    }

    @RequestMapping("/add-excercise")
    @ResponseBody
    public String addExercise() {
        AtlasOfExcercises atlasOfExcercises = new AtlasOfExcercises();
        atlasOfExcercises.setName("Przysiad");
        atlasOfExcercises.setBodyWeighted(false);
        atlasOfExcercises.setWeighted(true);
        atlasOfExcercises.setRepeats(false);
        atlasOfExcercises.setInstruments("sztanga");
        excercisesRepository.save(atlasOfExcercises);
        System.out.println(findAllExcercises());
        return findAllExcercises();
    }
}

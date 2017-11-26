package com.bootcamp.controllers;

import com.bootcamp.models.Projet;
import com.bootcamp.version.ApiVersions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("ProjetController")
@RequestMapping("/projet")
@Api(value = "Projet API", description = "Projet API")
public class ProjetController {

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get all the projects", notes = "Get all the projects")
    public ResponseEntity<List<Projet>> getProjet( ) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Projet>>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new project", notes = "Create a new project")
    public ResponseEntity<Projet> createProjet(@RequestBody Projet projet) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Projet>(new Projet(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Update a given project", notes = "Update a given project")
    public ResponseEntity<Projet> updateProjet(@RequestParam int id, @RequestBody Projet projet) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Projet>(new Projet(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Delete a project", notes = "Delete a project")
    public ResponseEntity deleteProjet(@RequestParam int id) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity( httpStatus);
    }
}

package com.bootcamp.controllers;

import com.bootcamp.models.Pilier;
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

@RestController("PilierController")
@RequestMapping("/pilier")
@Api(value = "Pilier API", description = "Pilier API")
public class PilierController {

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get all the pillars", notes = "Get all the pillars")
    public ResponseEntity<List<Pilier>> getPilier( ) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Pilier>>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new pillar", notes = "Create a new pillar")
    public ResponseEntity<Pilier> createPilier(@RequestBody Pilier pilier) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Pilier>(new Pilier(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Update a given pillar", notes = "Update a given pillar")
    public ResponseEntity<Pilier> updatePilier(@RequestParam int id, @RequestBody Pilier pilier) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Pilier>(new Pilier(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Delete a pillar", notes = "Delete a pillar")
    public ResponseEntity deletePilier(@RequestParam int id) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity( httpStatus);
    }
}

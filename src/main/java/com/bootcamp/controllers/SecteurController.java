package com.bootcamp.controllers;

import com.bootcamp.models.Secteur;
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

@RestController("SecteurController")
@RequestMapping("/secteur")
@Api(value = "Secteur API", description = "Secteur API")
public class SecteurController {

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get all the sectors", notes = "Get all the sectors")
    public ResponseEntity<List<Secteur>> getSecteur( ) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Secteur>>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new sector", notes = "Create a new sector")
    public ResponseEntity<Secteur> createSecteur(@RequestBody Secteur secteur) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Secteur>(new Secteur(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Update a given sector", notes = "Update a given sector")
    public ResponseEntity<Secteur> updateSecteur(@RequestParam int id, @RequestBody Secteur secteur) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Secteur>(new Secteur(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Delete a sector", notes = "Delete a sector")
    public ResponseEntity deleteSecteur(@RequestParam int id) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity( httpStatus);
    }
}

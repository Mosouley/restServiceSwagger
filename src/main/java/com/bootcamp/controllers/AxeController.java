package com.bootcamp.controllers;

import com.bootcamp.models.Axe;
import com.bootcamp.models.Comment;
import com.bootcamp.models.Media;
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

@RestController("AxeController")
@RequestMapping("/axe")
@Api(value = "Axe API", description = "Axe API")
public class AxeController {

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get all the axes", notes = "Get all the axes")
    public ResponseEntity<List<Axe>> getAxe( ) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Axe>>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new axe", notes = "Create a new axe")
    public ResponseEntity<Axe> createAxe(@RequestBody Axe axe) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Axe>(new Axe(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Update a given axe", notes = "Update a given axe")
    public ResponseEntity<Axe> updateAxe(@RequestParam int id, @RequestBody Axe axe) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Axe>(new Axe(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Delete a axe", notes = "Delete a axe")
    public ResponseEntity deleteAxe(@RequestParam int id) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity( httpStatus);
    }

        //add comments from an axe URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/comment/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a comment on a given axe", notes = "Create a comment on a given axe")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Comment>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/comments")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of comments made on a given axe", notes = "Get the list of comments made on a given axe")
    public ResponseEntity<List<Comment>> getComments(@RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Comment>>(httpStatus);
    }

    //add Media from a pillar URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/media/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a media on a given axe", notes = "Create a media on a given axe")
    public ResponseEntity<Media> addMedia(@RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Media>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/medias")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of media related to a given axe", notes = "Get the list of media related to a given axe")
    public ResponseEntity<List<Media>> getMedias(@RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Media>>(httpStatus);
    }
       //add Sector to an axe URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/sector/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Add sector to a specific axe", notes = "Add sector to a specific axe")
    public ResponseEntity<Secteur> addSector(@RequestBody Secteur secteur) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Secteur>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/sectors")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of sectors related to a given axe", notes = "Get the list of sectors related to a given axe")
    public ResponseEntity<List<Secteur>> getSecteurs(@RequestBody Secteur secteur) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Secteur>>(httpStatus);
    }
}

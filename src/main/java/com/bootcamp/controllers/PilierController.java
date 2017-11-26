package com.bootcamp.controllers;

import com.bootcamp.models.Axe;
import com.bootcamp.models.Comment;
import com.bootcamp.models.Media;
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
    public ResponseEntity<List<Pilier>> getPilier() {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Pilier>>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
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
        return new ResponseEntity(httpStatus);
    }

    //add axe on a given pilar from its URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/axe/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create an axe from a given pillar", notes = "Create an axe from a given pillar")
    public ResponseEntity<Pilier> addAxe(@RequestBody Axe axe) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Pilier>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/axes")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of axes of a given pillar", notes = "Get the list of axes of a given pillar")
    public ResponseEntity<List<Axe>> getAxes(@RequestBody Axe axe) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Axe>>(httpStatus);
    }

    //add comments from a pillar URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/comment/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a comment on a given pillar", notes = "Create a comment on a given pillar")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Comment>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/comments")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of comments made on a given pillar", notes = "Get the list of comments made on a given pillar")
    public ResponseEntity<List<Comment>> getComments(@RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Comment>>(httpStatus);
    }

    //add Media from a pillar URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/media/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a media on a given pillar", notes = "Create a media on a given pillar")
    public ResponseEntity<Media> addMedia(@RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Media>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/medias")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of media related to a given pillar", notes = "Get the list of media related to a given pillar")
    public ResponseEntity<List<Media>> getMedias(@RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Media>>(httpStatus);
    }
}

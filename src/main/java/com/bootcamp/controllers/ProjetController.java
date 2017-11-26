package com.bootcamp.controllers;

import com.bootcamp.models.Comment;
import com.bootcamp.models.Media;
import com.bootcamp.models.Projet;
import com.bootcamp.models.Region;
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
    public ResponseEntity<List<Projet>> getProjet() {

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
        return new ResponseEntity(httpStatus);
    }
    //add comments from a Project URI

    @RequestMapping(method = RequestMethod.POST, value = "/{id}/comment/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a comment on a given project", notes = "Create a comment on a given project")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Comment>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/comments")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of comments made on a given project", notes = "Get the list of comments made on a given project")
    public ResponseEntity<List<Comment>> getComments(@RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Comment>>(httpStatus);
    }

    //add Media from a project URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/media/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a media on a given project", notes = "Create a media on a given project")
    public ResponseEntity<Media> addMedia(@RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Media>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/medias")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of media related to a given project", notes = "Get the list of media related to a given project")
    public ResponseEntity<List<Media>> getMedias(@RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Media>>(httpStatus);
    }

       //add region of impact from a project URI
    @RequestMapping(method = RequestMethod.POST, value = "/{id}/region/")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a region of impact for a given project", notes = "Create a region of impact for a given project")
    public ResponseEntity<Region> addRegion(@RequestBody Region region) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Region>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/regions")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get the list of regions related of a given project", notes = "Get the list of regions related of a given project")
    public ResponseEntity<List<Region>> getRegions(@RequestBody Region region) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Region>>(httpStatus);
    }
}

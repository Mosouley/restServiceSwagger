package com.bootcamp.controllers;

import com.bootcamp.models.Media;
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


@RestController("MediaController")
@RequestMapping("/media")
@Api(value = "Media API", description = "Media API")
public class MediaController {

     @RequestMapping(method = RequestMethod.GET, value = "/list")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get all the medias", notes = "Get all the medias")
    public ResponseEntity<List<Media>> getMedia( ) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Media>>(httpStatus);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new media", notes = "Create a new media")
    public ResponseEntity<Media> createMedia(@RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Media>(new Media(), httpStatus);
    }

      @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Update a given media", notes = "Update a given media")
    public ResponseEntity<Media> updateMedia(@RequestParam int id, @RequestBody Media media) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Media>(new Media(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Delete a media", notes = "Delete a media")
    public ResponseEntity deleteMedia(@RequestParam int id) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity( httpStatus);
    }
}

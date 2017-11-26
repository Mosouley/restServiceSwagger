package com.bootcamp.controllers;

import com.bootcamp.models.Comment;
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

@RestController("CommentController")
@RequestMapping("/comment")
@Api(value = "Comment API", description = "Comment API")
public class CommentController {

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Get all the comments", notes = "Get all the comments")
    public ResponseEntity<List<Comment>> getComment( ) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<List<Comment>>(httpStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new comment", notes = "Create a new comment")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Comment>(new Comment(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Update a given comment", notes = "Update a given comment")
    public ResponseEntity<Comment> updateComment(@RequestParam int id, @RequestBody Comment comment) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<Comment>(new Comment(), httpStatus);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Delete a comment", notes = "Delete a comment")
    public ResponseEntity deleteComment(@RequestParam int id) {

        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity( httpStatus);
    }
}

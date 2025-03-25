package com.zebrunner.carina.demo.api;

import org.testng.annotations.Test;

public class PostsMethodsTest {

    @Test
    public void testGetPostsMethod(){
        GetPostsMethod getPostsMethod = new GetPostsMethod();
        getPostsMethod.callAPIExpectSuccess();
        getPostsMethod.validateResponse();
    }

    @Test
    public void testGetPostMethod(){
        GetPostMethod getPostMethod= new GetPostMethod();
        getPostMethod.callAPIExpectSuccess();
        getPostMethod.validateResponse();
    }

    @Test
    public void testDeletePostMethod(){
        DeletePostMethod deletePostMethod= new DeletePostMethod();
        deletePostMethod.callAPIExpectSuccess();
        deletePostMethod.validateResponse();
    }

    @Test
    public void testPostPostMethod(){
        PostPostMethod postPostMethod= new PostPostMethod();
        postPostMethod.callAPIExpectSuccess();
        postPostMethod.validateResponse();
    }

    @Test
    public void testPutPostMethod(){
        PutPostMethod putPostMethod= new PutPostMethod();
        putPostMethod.callAPIExpectSuccess();
        putPostMethod.validateResponse();
    }



}
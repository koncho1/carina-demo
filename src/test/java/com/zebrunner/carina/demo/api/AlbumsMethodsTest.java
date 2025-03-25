package com.zebrunner.carina.demo.api;

import org.testng.annotations.Test;

public class AlbumsMethodsTest {

    @Test
    public void testGetAlbumsMethod(){
        GetAlbumsMethod getAlbumsMethod= new GetAlbumsMethod();
        getAlbumsMethod.callAPIExpectSuccess();
        getAlbumsMethod.validateResponse();
    }

    @Test
    public void testGetAlbumMethod(){
        GetAlbumMethod getAlbumMethod= new GetAlbumMethod();
        getAlbumMethod.callAPIExpectSuccess();
        getAlbumMethod.validateResponse();
    }

    @Test
    public void testDeleteAlbumMethod(){
        DeleteAlbumMethod deleteAlbumMethod= new DeleteAlbumMethod();
        deleteAlbumMethod.callAPIExpectSuccess();
        deleteAlbumMethod.validateResponse();
    }

    @Test
    public void testPostAlbumMethod(){
        PostAlbumMethod postAlbumMethod= new PostAlbumMethod();
        postAlbumMethod.callAPIExpectSuccess();
        postAlbumMethod.validateResponse();
    }

    @Test
    public void testPutAlbumMethod(){
        PutAlbumMethod putAlbumMethod= new PutAlbumMethod();
        putAlbumMethod.callAPIExpectSuccess();
        putAlbumMethod.validateResponse();
    }
}

package edu.vt.cs5254.fancygallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "510910f2892559e7eb083551114fbcd6"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s,geo"
    )
    suspend fun fetchPhotos(@Query("per_page") pageLimit: Int): FlickrResponse
}
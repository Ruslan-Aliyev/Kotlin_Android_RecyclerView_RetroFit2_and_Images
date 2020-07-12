package com.example.recyclerview_retrofit2_and_images

import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

public interface ApiService {

    @GET("misc/api/movie.php")
    fun getAllPosts(): Observable<ArrayList<Movie>>

    @Multipart
    @POST("misc/api/movie.php")
    fun postMultipart(
        @Part uploaded_image: MultipartBody.Part?,
        @Part("title") title: RequestBody?,
        @Part("year") year: RequestBody?
    ): Call<ResponseBody?>?
}
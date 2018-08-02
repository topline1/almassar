package com.andproj.fs.myapplication.POJO;
import com.androidtutorialpoint.googlemapsdistancecalculator.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
/**
 * Created by TopLine on 02-Aug-18.
 */
public class RetrofitMaps {
    /*
         * Retrofit get annotation with our URL
         * And our method that will return us details of student.
         */
    @GET("api/directions/json?key=AIzaSyC22GfkHu9FdgT9SwdCWMwKX1a4aohGifM")
    Call<Example> getDistanceDuration(@Query("units") String units, @Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);

}

}

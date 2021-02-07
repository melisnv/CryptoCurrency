package com.example.cryptocurrency.service;

import com.example.cryptocurrency.model.CryptoModel;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    // GET, POST, UPDATE, DELETE
    @GET("prices?key=ae2e0d147b5e52eeff96f2432397ceac")
    Observable<List<CryptoModel>> getData();
}





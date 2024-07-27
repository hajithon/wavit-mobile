package com.example.challengeapp.data

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface TokenService {
    @POST("registerToken")
    fun registerToken(@Body tokenRequest: TokenRequest): Call<Void>
}

data class TokenRequest(
    val token: String
)

object RetrofitClient {
    private const val BASE_URL = "https://your-server.com/" // 서버의 URL로 변경

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val tokenService: TokenService by lazy {
        retrofit.create(TokenService::class.java)
    }
}
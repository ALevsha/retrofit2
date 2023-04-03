package API

import models.Product
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductApi {
    @GET("products/{id}")
    suspend fun getSingleProductById(
        @Path("id") id: Int
    ): Product
}
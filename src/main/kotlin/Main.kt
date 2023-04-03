import API.ProductApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun main() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val productApi = retrofit.create(ProductApi::class.java)
    CoroutineScope(Dispatchers.IO).launch {
        val product = productApi.getSingleProductById(1)
        println(product.title)
        }
    }
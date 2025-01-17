package otus.homework.coroutines.api

import otus.homework.coroutines.dto.Fact
import retrofit2.http.GET

interface CatFactsService {

  @GET("random?animal_type=cat")
  suspend fun getCatFact(): Fact
}
package io.micronaut.docs.streaming

// tag::imports[]
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Flowable
import reactor.core.publisher.Flux

// end::imports[]

// tag::class[]
@Client("/streaming")
interface HeadlineClient {

    @Get(value = "/headlines", processes = [MediaType.APPLICATION_JSON_STREAM]) // <1>
    fun streamHeadlines(): Flowable<Headline>  // <2>
    // end::class[]

    @Get(value = "/headlines", processes = [MediaType.APPLICATION_JSON_STREAM]) // <1>
    fun streamFlux(): Flux<Headline>
}

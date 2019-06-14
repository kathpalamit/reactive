package com.viator.reactive.fluxandmono;

import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxandmonoTestCase {

    @Test
    public void fluxTest(){

        Flux<String> flux = Flux.just("spring","spring boot","reactive spring");
        flux.subscribe(System.out::println);
    }
}

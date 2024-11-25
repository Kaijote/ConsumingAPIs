package dao;

import model.Results;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public class FakeBookDAO {

    private static final String base_URL = "https://fakerapi.it/api/v1/books";

    public static void getBooksResults(String locale, String quantity){
        WebClient webClient = WebClient.builder().baseUrl(base_URL).build();
        Results responseBody = null;
        try {
            responseBody = webClient
                    .get()
                    .uri("?_locale=" + locale + "&_quantity=" + quantity)
                    .retrieve()
                    .bodyToMono(Results.class)
                    .block();
        } catch (WebClientResponseException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(responseBody);
    }
}

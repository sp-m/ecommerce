package com.example.ecommerce;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
class EcommerceApplicationTests {

	@Test
	void contextLoads() {
	}
    
    /*@Test
    public void testGetProductGroupByBrand() throws URISyntaxException 
    {
        RestTemplate restTemplate = new RestTemplate();
        
        final String baseUrl = "http://localhost:8089/product/brand/raymonds";
        URI uri = new URI(baseUrl);

        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        
        //Verify request succeed
        Assert.assertEquals(200, result.getStatusCodeValue());
        Assert.assertEquals(true, result.getBody().contains("productListList"));
    }*/
}

package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class BaseUrl {

    protected RequestSpecification spec;

    @Before
    public void setUp(){

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://gmibank.com/").build();


    }


}
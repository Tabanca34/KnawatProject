
package testBase;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.After;
import org.junit.Before;

public class ApıTest {

        protected RequestSpecification spec;

        @Before
        public void setup() {


                spec = new RequestSpecBuilder().
                        setBaseUri("https://fakerestapi.azurewebsites.net/api/v1/Authors").
                        build();

        }
    }


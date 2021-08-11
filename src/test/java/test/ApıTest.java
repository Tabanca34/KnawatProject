package test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApıTest extends testBase.ApıTest {

    @Test
    public void getRequest() {
         /*
 When
I send GET Request to the URL  https://fakerestapi.azurewebsites.net/api/v1/Authors/3
Then
Status code is 200
And response body is like  {
 							 "id": 3,
							 "idBook": 1,
 							 "firstName": "First Name 3",
  							 "lastName": "Last Name 3"
						   }
     */

        spec.pathParam("parametre1", 3);

        Response response = given().accept("application/json").
                spec(spec).when().
                get("/{parametre1}");

        response.prettyPrint();
        response.then().assertThat().statusCode(200).contentType(ContentType.JSON).
                body("id", equalTo(3),
                        "idBook", equalTo(1),
                        "firstName", equalTo("First Name 3"),
                        "lastName", equalTo("Last Name 3")
                );

    }

    @Test
    public void postRequest() {
      /*


When
I send POST Request to the URL  https://fakerestapi.azurewebsites.net/api/v1/Authors
with request body
{
  "id": 50,
  "idBook": 100,
  "firstName": "Selcuk",
  "lastName": "tabanca"
}
Then
Status code is 200
And response body is like
{
  "id": 50,
  "idBook": 100,
  "firstName": "Selcuk",
  "lastName": "tabanca"
}

       */

        HashMap<String, Object> requestBodyMap = new HashMap<String, Object>();

        requestBodyMap.put("id", 50);
        requestBodyMap.put("idBook", 100);
        requestBodyMap.put("firstName", "Selcuk");
        requestBodyMap.put("lastName", "tabanca");

        Response response = given().
                contentType(ContentType.JSON).
                spec(spec).
                body(requestBodyMap).when().post();
        response.prettyPrint();

        JsonPath json = response.jsonPath();
        response.then().
                assertThat().
                statusCode(200);
        Assert.assertEquals(requestBodyMap.get("id"), json.getInt("id"));
        Assert.assertEquals(requestBodyMap.get("idBook"), json.getInt("idBook"));
        Assert.assertEquals(requestBodyMap.get("firstName"), json.getString("firstName"));
        Assert.assertEquals(requestBodyMap.get("lastName"), json.getString("lastName"));


    }

    @Test
    public void putRequest() {
      /*
      When
I send PUT Request to the URL  https://fakerestapi.azurewebsites.net/api/v1/Authors/50
with request body
{
  "id": 10,
  "idBook": 2,
  "firstName": "John",
  "lastName": "Smith"
}
Then
Status code is 200
And response body is like
{
 "id": 10,
  "idBook": 2,
  "firstName": "John",
  "lastName": "Smith"
}
       */

        HashMap<String, Object> requestBodyMap = new HashMap<String, Object>();

        requestBodyMap.put("id", 10);
        requestBodyMap.put("idBook", 2);
        requestBodyMap.put("firstName", "john");
        requestBodyMap.put("lastName", "Smith");

        spec.pathParam("parametre1", 50);
        Response response = given().
                contentType(ContentType.JSON).
                spec(spec).
                body(requestBodyMap).when().put("/{parametre1}");
        response.prettyPrint();


        JsonPath json = response.jsonPath();
        response.then().
                assertThat().
                statusCode(200);
        Assert.assertEquals(requestBodyMap.get("id"), json.getInt("id"));
        Assert.assertEquals(requestBodyMap.get("idBook"), json.getInt("idBook"));
        Assert.assertEquals(requestBodyMap.get("firstName"), json.getString("firstName"));
        Assert.assertEquals(requestBodyMap.get("lastName"), json.getString("lastName"));

    }

    @Test
    public void deleteRequest() {

        /*
        When
I send DEELTE Request to the URL  https://fakerestapi.azurewebsites.net/api/v1/Authors/50
Then
Status code is 200
         */

        spec.pathParam("parametre1", 50);
        Response response = given().
                spec(spec)
                .when().delete("/{parametre1}");
        response.prettyPrint();
        response.then().
                assertThat().
                statusCode(200);

    }
}
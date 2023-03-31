package token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.*;

public class BearerToken {
    public void changeResult(String testCaseName, Boolean isPassed) throws IOException {
        String endpoint = "https://xray.cloud.getxray.app/api/v1/import/execution";
        String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJmNTBmMTdjOC00OTIyLTMwZjQtOGY1Mi0zYzc3MzcwODMxODAiLCJhY2NvdW50SWQiOiI2M2Y0YTIwNGUyYzRjNjkyYzk3Nzk5NGYiLCJpc1hlYSI6ZmFsc2UsImlhdCI6MTY3ODg4MzUyOSwiZXhwIjoxNjc4OTY5OTI5LCJhdWQiOiJDRTRCRTEzNDlGNjc0QUMxQjQ0OUY1M0NERjI1Rjk1OCIsImlzcyI6ImNvbS54cGFuZGl0LnBsdWdpbnMueHJheSIsInN1YiI6IkNFNEJFMTM0OUY2NzRBQzFCNDQ5RjUzQ0RGMjVGOTU4In0.TLk4EDPc45pc3jrSCrKGYIFNOfj2dljM_B4eRU6_-dQ";

        // create the request body
        JSONObject requestBody = new JSONObject();
        JSONObject info = new JSONObject();
        info.put("summary", "Execution of automated tests for release");
        info.put("description", "This execution is automatically created when importing execution results from an external source");
        info.put("startDate", "2023-09-03T11:37:00+03:00");
        info.put("finishDate", "2023-09-04T11:50:00+03:00");
        requestBody.put("info", info);

        List<JSONObject> tests = new ArrayList<>();

        JSONObject test1 = new JSONObject();
        test1.put("testKey", testCaseName);
        test1.put("start", "2023-09-03T11:37:00+03:00");
        test1.put("finish", "2023-09-04T11:50:00+03:00");
        test1.put("comment", "Successful execution1");
        if(isPassed)
            test1.put("status", "PASSED");
        else test1.put("status", "FAILED");
        tests.add(test1);
        requestBody.put("tests", tests);

        // create the OkHttp client and request

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requestBody.toString());
        Request request = new Request.Builder()
                .url(endpoint)
                .addHeader("Authorization", "Bearer " + bearerToken)
                .post(body)
                .build();

        // send the request and get the response
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject jsonResponse = new JSONObject(responseBody);

        // handle the response
        if (response.isSuccessful()) {
            System.out.println("Test execution created with key: " + jsonResponse.getString("key"));
        } else {
            System.out.println("Error creating test execution: " + jsonResponse.getString("error"));
        }
    }

}

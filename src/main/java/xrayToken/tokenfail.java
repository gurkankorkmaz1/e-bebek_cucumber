package xrayToken;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.*;

import java.io.IOException;

public class tokenfail {
    public static void main(String[] args) throws IOException {
        String endpoint = "https://xray.cloud.getxray.app/api/v1/import/execution";
        String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJmNTBmMTdjOC00OTIyLTMwZjQtOGY1Mi0zYzc3MzcwODMxODAiLCJhY2NvdW50SWQiOiI2M2Y0YTIwNGUyYzRjNjkyYzk3Nzk5NGYiLCJpc1hlYSI6ZmFsc2UsImlhdCI6MTY3ODg4MzUyOSwiZXhwIjoxNjc4OTY5OTI5LCJhdWQiOiJDRTRCRTEzNDlGNjc0QUMxQjQ0OUY1M0NERjI1Rjk1OCIsImlzcyI6ImNvbS54cGFuZGl0LnBsdWdpbnMueHJheSIsInN1YiI6IkNFNEJFMTM0OUY2NzRBQzFCNDQ5RjUzQ0RGMjVGOTU4In0.TLk4EDPc45pc3jrSCrKGYIFNOfj2dljM_B4eRU6_-dQ";


        JSONObject requestBody = new JSONObject();
        JSONObject info = new JSONObject();
        info.put("summary", "Execution of automated tests for release");
        info.put("description", "This execution is automatically created when importing execution results from an external source");
        info.put("startDate", "2023-09-03T11:37:00+03:00");
        info.put("finishDate", "2023-09-04T11:50:00+03:00");
        requestBody.put("info", info);
        JSONArray tests = new JSONArray();

        JSONObject test1 = new JSONObject();
        test1.put("testKey", "UP-2");
        test1.put("start", "2023-09-03T11:37:00+03:00");
        test1.put("finish", "2023-09-04T11:50:00+03:00");
        test1.put("comment", "Successful execution1");
        test1.put("status", "FAILED");
        tests.put(test1);

        JSONObject test2 = new JSONObject();
        test2.put("testKey", "UP-4");
        test2.put("start", "2023-09-03T11:37:00+03:00");
        test2.put("finish", "2023-09-04T11:50:00+03:00");
        test2.put("comment", "Successful execution2");
        test2.put("status", "FAILED");
        tests.put(test2);

        JSONObject test3 = new JSONObject();
        test3.put("testKey", "UP-5");
        test3.put("start", "2023-09-03T11:37:00+03:00");
        test3.put("finish", "2023-09-04T11:50:00+03:00");
        test3.put("comment", "Successful execution3");
        test3.put("status", "FAILED");
        tests.put(test3);

        JSONObject test4 = new JSONObject();
        test4.put("testKey", "UP-6");
        test4.put("start", "2023-09-03T11:37:00+03:00");
        test4.put("finish", "2023-09-04T11:50:00+03:00");
        test4.put("comment", "Successful execution3");
        test4.put("status", "FAILED");
        tests.put(test4);

        JSONObject test5 = new JSONObject();
        test5.put("testKey", "UP-7");
        test5.put("start", "2023-09-03T11:37:00+03:00");
        test5.put("finish", "2023-09-04T11:50:00+03:00");
        test5.put("comment", "Successful execution3");
        test5.put("status", "FAILED");
        tests.put(test5);

        JSONObject test6 = new JSONObject();
        test6.put("testKey", "UP-8");
        test6.put("start", "2023-09-03T11:37:00+03:00");
        test6.put("finish", "2023-09-04T11:50:00+03:00");
        test6.put("comment", "Successful execution3");
        test6.put("status", "FAILED");
        tests.put(test6);

        JSONObject test7 = new JSONObject();
        test7.put("testKey", "UP-9");
        test7.put("start", "2023-09-03T11:37:00+03:00");
        test7.put("finish", "2023-09-04T11:50:00+03:00");
        test7.put("comment", "Successful execution3");
        test7.put("status", "FAILED");
        tests.put(test7);

        JSONObject test8 = new JSONObject();
        test8.put("testKey", "UP-10");
        test8.put("start", "2023-09-03T11:37:00+03:00");
        test8.put("finish", "2023-09-04T11:50:00+03:00");
        test8.put("comment", "Successful execution3");
        test8.put("status", "FAILED");
        tests.put(test8);

        JSONObject test9 = new JSONObject();
        test9.put("testKey", "UP-11");
        test9.put("start", "2023-09-03T11:37:00+03:00");
        test9.put("finish", "2023-09-04T11:50:00+03:00");
        test9.put("comment", "Successful execution3");
        test9.put("status", "FAILED");
        tests.put(test9);

        JSONObject test10 = new JSONObject();
        test10.put("testKey", "UP-12");
        test10.put("start", "2023-09-03T11:37:00+03:00");
        test10.put("finish", "2023-09-04T11:50:00+03:00");
        test10.put("comment", "Successful execution3");
        test10.put("status", "FAILED");
        tests.put(test10);

        JSONObject test11 = new JSONObject();
        test11.put("testKey", "UP-13");
        test11.put("start", "2023-09-03T11:37:00+03:00");
        test11.put("finish", "2023-09-04T11:50:00+03:00");
        test11.put("comment", "Successful execution3");
        test11.put("status", "FAILED");
        tests.put(test11);

        JSONObject test12 = new JSONObject();
        test12.put("testKey", "UP-14");
        test12.put("start", "2023-09-03T11:37:00+03:00");
        test12.put("finish", "2023-09-04T11:50:00+03:00");
        test12.put("comment", "Successful execution3");
        test12.put("status", "FAILED");
        tests.put(test12);

        JSONObject test13 = new JSONObject();
        test13.put("testKey", "UP-15");
        test13.put("start", "2023-09-03T11:37:00+03:00");
        test13.put("finish", "2023-09-04T11:50:00+03:00");
        test13.put("comment", "Successful execution3");
        test13.put("status", "FAILED");
        tests.put(test13);

        JSONObject test14 = new JSONObject();
        test14.put("testKey", "UP-16");
        test14.put("start", "2023-09-03T11:37:00+03:00");
        test14.put("finish", "2023-09-04T11:50:00+03:00");
        test14.put("comment", "Successful execution3");
        test14.put("status", "FAILED");
        tests.put(test14);

        JSONObject test15 = new JSONObject();
        test15.put("testKey", "UP-17");
        test15.put("start", "2023-09-03T11:37:00+03:00");
        test15.put("finish", "2023-09-04T11:50:00+03:00");
        test15.put("comment", "Successful execution3");
        test15.put("status", "FAILED");
        tests.put(test15);

        JSONObject test16 = new JSONObject();
        test16.put("testKey", "UP-18");
        test16.put("start", "2023-09-03T11:37:00+03:00");
        test16.put("finish", "2023-09-04T11:50:00+03:00");
        test16.put("comment", "Successful execution3");
        test16.put("status", "FAILED");
        tests.put(test16);

        JSONObject test17 = new JSONObject();
        test17.put("testKey", "UP-19");
        test17.put("start", "2023-09-03T11:37:00+03:00");
        test17.put("finish", "2023-09-04T11:50:00+03:00");
        test17.put("comment", "Successful execution3");
        test17.put("status", "FAILED");
        tests.put(test17);

        JSONObject test18 = new JSONObject();
        test18.put("testKey", "UP-20");
        test18.put("start", "2023-09-03T11:37:00+03:00");
        test18.put("finish", "2023-09-04T11:50:00+03:00");
        test18.put("comment", "Successful execution3");
        test18.put("status", "FAILED");
        tests.put(test18);

        JSONObject test19 = new JSONObject();
        test19.put("testKey", "UP-21");
        test19.put("start", "2023-09-03T11:37:00+03:00");
        test19.put("finish", "2023-09-04T11:50:00+03:00");
        test19.put("comment", "Successful execution3");
        test19.put("status", "FAILED");
        tests.put(test19);

        JSONObject test20 = new JSONObject();
        test20.put("testKey", "UP-22");
        test20.put("start", "2023-09-03T11:37:00+03:00");
        test20.put("finish", "2023-09-04T11:50:00+03:00");
        test20.put("comment", "Successful execution3");
        test20.put("status", "FAILED");
        tests.put(test20);

        JSONObject test21 = new JSONObject();
        test21.put("testKey", "UP-23");
        test21.put("start", "2023-09-03T11:37:00+03:00");
        test21.put("finish", "2023-09-04T11:50:00+03:00");
        test21.put("comment", "Successful execution3");
        test21.put("status", "FAILED");
        tests.put(test21);

        JSONObject test22 = new JSONObject();
        test22.put("testKey", "UP-24");
        test22.put("start", "2023-09-03T11:37:00+03:00");
        test22.put("finish", "2023-09-04T11:50:00+03:00");
        test22.put("comment", "Successful execution3");
        test22.put("status", "FAILED");
        tests.put(test22);


        requestBody.put("tests", tests);



        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requestBody.toString());
        Request request = new Request.Builder()
                .url(endpoint)
                .addHeader("Authorization", "Bearer " + bearerToken)
                .post(body)
                .build();


        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject jsonResponse = new JSONObject(responseBody);


        if (response.isSuccessful()) {
            System.out.println("Test execution created with key: " + jsonResponse.getString("key"));
        } else {
            System.out.println("Error creating test execution: " + jsonResponse.getString("error"));
        }
    }
}

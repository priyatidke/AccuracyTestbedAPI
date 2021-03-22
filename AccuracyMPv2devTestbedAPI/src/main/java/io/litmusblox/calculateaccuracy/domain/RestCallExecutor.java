package io.litmusblox.calculateaccuracy.domain;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestCallExecutor {

	public static void main(String  [] args){
		RestCallExecutor restCallExecutor= new RestCallExecutor();
		restCallExecutor.getRestAPIResponse();
	}
	
	private String url ="https://7p4y5czwve.execute-api.ap-south-1.amazonaws.com/default/PredictorDev/True?username=abc&password=def";
	
	// TestingForSubroles // https://woiz05jspg.execute-api.ap-south-1.amazonaws.com/default/TestingForSubroles/True?username=abc&password=def
	// PredictorDev // https://7p4y5czwve.execute-api.ap-south-1.amazonaws.com/default/PredictorDev/True?username=abc&password=def";
	// Testing_Mega-Predictor // https://gl2nd6u1q7.execute-api.ap-south-1.amazonaws.com/Test1/True?username=abc&password=def
	// PredictorProd // https://m4orcvguzf.execute-api.ap-south-1.amazonaws.com/prod/PredictorProd/True?username=abc&password=def
	
	private RequestBodyGenerator requestBodyGenerator = new RequestBodyGenerator();
	private RestAPIResponseMapper responseMapper = new RestAPIResponseMapper();
	private CloseableHttpClient httpClient;

	public RestAPIResponse getRestAPIResponse() {
		httpClient = HttpClients.createDefault();
		try {
			System.out.println("Send Http GET request");
			String requestBody= this.requestBodyGenerator.getRewuestBody("","Job Summary :"+

"As Software Developer, you must be able to complete all development tasks on hand and also ensure the quality of the code delivered. Self-initiate to ensure software changes control is in place. Explore new & innovative technologies to develop new solution. Proactive and committed to achieve objective and have positive work attitude."+

"Job Responsibilities :"+

"- Software development - ensure completion of all development task using one or more programming languages list below and other Google Cloud Platform technologies as required:"+

"Programming Language :"+

"- Typescript, JQuery, other languages exposure is an advantage."+

"- Framework Angular, Ionic."+

"- Database - MySQL, MS SQL (optional)."+

"- Deliver fixes, enhancements, interfaces, and new systems in accordance with expected, and committed schedules."+

"- Coordinate with team to complete task given."+

"- Assist/deliver time estimates and documentation needed for project development."+

"- Where required, prepare written design specifications for enhancements and/or new development.","");
			return this.sendGet(1,requestBody);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.close();
		}
		return null;
	}

	private void close() {
		try {
			httpClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public RestAPIResponse sendGet(int i,String requestBody) throws Exception {
        

		try {
            @SuppressWarnings({ "deprecation", "resource" })
			HttpClient client = new DefaultHttpClient();
            MyHttpGetWithEntity e = new MyHttpGetWithEntity(url);
            e.setEntity(new StringEntity(requestBody));
            HttpResponse response = client.execute(e);
            String responseString=IOUtils.toString(response.getEntity().getContent());
            System.out.println("Count ==> "+ i);
            return responseMapper.getRestAPIResponse(responseString);
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}

}

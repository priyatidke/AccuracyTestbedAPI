package io.litmusblox.calculateaccuracy.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestAPIResponseMapper {

	public RestAPIResponse getRestAPIResponse(String jsonResponse){
		RestAPIResponse response= new RestAPIResponse();
		ObjectMapper mapper = new ObjectMapper();
	      try
	      {
	    	  mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

	    	  response =  mapper.readValue(jsonResponse, RestAPIResponse.class);
	      } catch (JsonGenerationException e)
	      {
	         e.printStackTrace();
	      } catch (JsonMappingException e)
	      {
	         e.printStackTrace();
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }
	      return response;
	}
}

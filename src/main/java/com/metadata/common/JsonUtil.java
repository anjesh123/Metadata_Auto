package com.metadata.common;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static <T> T convertJsonStringToObject(final String jsonStr, final Class<T> classType) throws IOException {
		return objectMapper.readValue(jsonStr, classType);
	}

	public static byte[] convertObjectToJsonStream(final Object object) throws JsonProcessingException {
		return objectMapper.writeValueAsBytes(object);
	}

	public static String convertObjectToJsonString(final Object object) throws JsonProcessingException {
		return objectMapper.writeValueAsString(object);
	}

	public static ObjectMapper getMapper() {
		return objectMapper;
	}
}

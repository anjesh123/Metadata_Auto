package com.metadata.rest.dto;

import java.util.List;

public class MetadataStaticConfig {
	private String content;
	private List<headersConfig> header;
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<headersConfig> getHeader() {
		return header;
	}
	public void setHeader(List<headersConfig> header) {
		this.header = header;
	}
	
}

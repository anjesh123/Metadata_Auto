package com.metadata.rest.dto;

public class ApiDisplayConfig {
	private String name1;
	private String title1;
	private String description1;

	private Rows rows;

	private String ddLabel;

	private String transferFieldKey;

	private SourceApi sourceApi;

	private DisplayItems displayItem;

	private boolean testConfigure;

	private TestApi testAPI;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public Rows getRows() {
		return rows;
	}

	public void setRows(Rows rows) {
		this.rows = rows;
	}

	public String getDdLabel() {
		return ddLabel;
	}

	public void setDdLabel(String ddLabel) {
		this.ddLabel = ddLabel;
	}

	public String getTransferFieldKey() {
		return transferFieldKey;
	}

	public void setTransferFieldKey(String transferFieldKey) {
		this.transferFieldKey = transferFieldKey;
	}

	public SourceApi getSourceApi() {
		return sourceApi;
	}

	public void setSourceApi(SourceApi sourceApi) {
		this.sourceApi = sourceApi;
	}

	public DisplayItems getDisplayItem() {
		return displayItem;
	}

	public void setDisplayItem(DisplayItems displayItem) {
		this.displayItem = displayItem;
	}

	public boolean isTestConfigure() {
		return testConfigure;
	}

	public void setTestConfigure(boolean testConfigure) {
		this.testConfigure = testConfigure;
	}

	public TestApi getTestAPI() {
		return testAPI;
	}

	public void setTestAPI(TestApi testAPI) {
		this.testAPI = testAPI;
	}
}

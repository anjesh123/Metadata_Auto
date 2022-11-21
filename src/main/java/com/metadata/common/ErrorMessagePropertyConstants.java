package com.metadata.common;

public class ErrorMessagePropertyConstants {

    public static final String INTEGRATION_PACK_QUERY = "Exception occurred in IntegrationPack Query";
    public static final String INTEGRATION_PACK_INSTALL_API = "Exception occurred in IntegrationPackInstallation";
    public static final String INTEGRATION_PACK_INSTANCE_QUERY = "Exception occurred in IntegrationPackInstance Query";
    public static final String INTEGRATION_PACK_ENVIRONMENT_QUERY = "Exception occurred in IntegrationPackEnvironmentAttachment Query";
    public static final String INTEGRATION_PACK_ENVIRONMENT_ATTACHMENT_API = "Exception occurred in IntegrationPackEnvironmentAttachment";
    public static final String INTEGRATION_PACK_NOT_FOUND_ERROR = "Integration Pack Not Found";
    public static final String INTEGRATION_PACK_INSTALL_ERROR = "Integration Pack Installation Failed";
    public static final String SERVER_ERROR = "Unexpected Error Occurred";
    public static final String INVALID_REQUEST = "Invalid Request";
    public static final String GROUP_ACCOUNT_ID_NOT_FOUND_ERROR = " Group Account Id Not Found";
    public static final String ACCOUNT_GROUP_QUERY_API = "Exception occurred in Account Group Query";
    public static final String ACCOUNT_GROUP_ACCOUNT_QUERY_API = "Exception occurred in Account Group Account Query";
    public static final String ATTACH_SUBACCOUNT_API = "Exception occurred in Attach account";
    public static final String ENVIRONMENT_EXTENSION_API = "Exception occurred in fetching the environment extension";
    public static final String CSV_DATA_NOT_FOUND = "Could not upload the reference table because the file contains no data.";
    public static final String UPLOAD_CSV_ERROR = "Could not upload the reference table because of an error in the system.";
    public static final String CSV_CONTENT_ERROR =
            "Could not upload the reference table because the file is not a CSV file or it does not contain valid content.";
    public static final String REFERENCE_TABLE_ERROR = "This reference table is not in the integration template.";
    public static final String INTEGRATION_TEMPLATE_PLATFORM_EXCEPTION =
            "Could not download the reference table because of an error in the integration template.";
    public static final String REFERENCE_TABLE_NOT_FOUND = "This reference table is not in the integration template.";
    public static final String CSV_PARSE_FAILED = "Failed to write CSV content";
    public static final String FAILED_TO_DOWNLOAD = "Could not download the reference table because of an error in the system.";
    public static final String INVALID_RECORD_SIZE = "The cross-reference table cannot have more than 10,000 records.";
    public static final String CRT_DETAILS_LIST_EXCEPTION = "Exception occurred in fetching the crt details list";
    public static final String COLUMN_GREATER_THAN_HEADER =
            "Could not upload the reference table because the number of columns in data is greater than 20.";
    public static final String FAILED_TO_READ = "Could not read CSV file";

    private ErrorMessagePropertyConstants() {
    }

}

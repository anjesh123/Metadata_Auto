package com.metadata.common;

public class IhubPropertyConstants {

    public static final String BOOMI_IPACK_QUERY_URL = "/IntegrationPack/query";
    public static final String BOOMI_IPACK_INSTALLATION_URL = "/IntegrationPackInstance";
    public static final String BOOMI_IPACK_INSTANCE_QUERY_URL = "/IntegrationPackInstance/query";
    public static final String BOOMI_IPACK_ATTACH_URL = "/IntegrationPackEnvironmentAttachment";
    public static final String BOOMI_ENVIRONMENT_ATTACHMENT_QUERY_URL = "/IntegrationPackEnvironmentAttachment/query";
    public static final String IPACK_INSTALL_ATTACH_SUCCESS_MESSAGE = "Integration Pack installed and attached to environment successfully";

    public static final String NAME = "name";
    public static final String INTEGRATION_PACK_NAME = "integrationPackName";
    public static final String INTEGRATION_PACK_INSTANCE_ID = "integrationPackInstanceId";
    public static final String BOOMI_ACCOUNT_GROUP_QUERY_URL = "/AccountGroup/query";

    public static final String BOOMI_ACCOUNT_GROUP_ACCOUNT_QUERY_URL = "/AccountGroupAccount/query";

    public static final String BOOMI_ATTACH_ACCOUNT_URL = "/AccountGroupAccount";

    public static final String ACCOUNT_GROUP_ID = "accountGroupId";
    public static final String ACCOUNT_ID = "accountId";
    public static final String OVERRIDE_ACCOUNT = "overrideAccount";
    public static final String ENVIRONMENT_ID = "environmentId";

    public static final String PRIMARY_ACCOUNT_ID = "kronos-1496QK";
    public static final int HEADER_SIZE = 20;
    public static final long CRT_MAX_RECORDS_LIMIT = 10000;
    public static final String CSV_EXTENSION = ".csv";
    public static final String FILE_NAME_SEPARATOR = "-";
    public static final String CSV_CONTENT_TYPE = "text/csv";

    public static final String ENVIRONMENT_EXTENSION = "/EnvironmentExtensions/";
    public static final String URL_UPDATE = "/update/";

    /**
     * BoomiOpretorEnum
     */
    public enum BoomiOpretorEnum {
        EQUALS, AND
    }
}




package com.away1994.constants;

public class TestConstants {

    public static String TEST_RESOURCES_PATH = "./src/test/java/resources/";
    public static String IOS_HELLO_PROJECT_PATH = TEST_RESOURCES_PATH + "uml/project/ios_hello";
    public static String TEST_OUT_PATH = TEST_RESOURCES_PATH + "out/";
    public static String TEST_OUT_PLANTUML_PATH = TEST_RESOURCES_PATH + "out/plantuml";
    public static String TEST_OUT_SYMBOL_PATH = TEST_RESOURCES_PATH + "out/symbols";
    public static String IDLE_LAN_PROJECT_PATH = "../";
    public static String IDLE_OBJECTIVE_C_MODULE_PROJECT_PATH = "./";
    public static String AFNetworking_PROJECT_PATH = TEST_RESOURCES_PATH + "uml/project/AFNetworking";
    public static String ReactiveCocoa_PROJECT_PATH = TEST_RESOURCES_PATH + "uml/project/ReactiveCocoa";


    public static String WEVIEW_JAVASCRIPT_BRIDGE_SEND_DATA_FUNCTION = "- (void)sendData:(id)data responseCallback:(WVJBResponseCallback)responseCallback handlerName:(NSString*)handlerName {\n" +
            "    NSMutableDictionary* message = [NSMutableDictionary dictionary];\n" +
            "    \n" +
            "    if (data) {\n" +
            "        message[@\"data\"] = data;\n" +
            "    }\n" +
            "    \n" +
            "    if (responseCallback) {\n" +
            "        NSString* callbackId = [NSString stringWithFormat:@\"objc_cb_%ld\", ++_uniqueId];\n" +
            "        self.responseCallbacks[callbackId] = [responseCallback copy];\n" +
            "        message[@\"callbackId\"] = callbackId;\n" +
            "    }\n" +
            "    \n" +
            "    if (handlerName) {\n" +
            "        message[@\"handlerName\"] = handlerName;\n" +
            "    }\n" +
            "    [self _queueMessage:message];\n" +
            "}";

}

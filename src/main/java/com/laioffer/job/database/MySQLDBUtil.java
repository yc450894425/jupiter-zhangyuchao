package com.laioffer.job.database;

public class MySQLDBUtil {
    private static final String INSTANCE = "project-instance.cyhtts3twy2g.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "myproject";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "19950104";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}
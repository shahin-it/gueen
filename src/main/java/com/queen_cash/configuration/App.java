package com.queen_cash.configuration;

import com.queen_cash.domain.admin.Administrator;
import com.queen_cash.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class App {
    @Autowired
    ApplicationContext context;
    public String baseUrl() {
        return AppUtil.baseUrl();
    }
    public int maxResult() {
        return AppUtil.maxResult;
    }

    public String[] staticResource(String path) {
        File file = null;
        path = path != null ? path : "static/";
        try {
            file = new ClassPathResource(path).getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file != null ? file.list() : new String[0];
    }

    public Administrator loggedAdmin() {
        return AppUtil.loggedAdministrator();
    }


}

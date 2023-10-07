package com.internal.project.accenture.authentication.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class ConfigDb {
    public void ConfigFirebase(){

        @Value("")
        Resource resourceFile;

        @Bean
        public FirebaseAuth firebaseAuth() throw IOException {
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(resourceFile.getInputStream()))
                    .setServiceAccountId("").build();
        }
    }
}

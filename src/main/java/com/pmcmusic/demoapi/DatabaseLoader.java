/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmcmusic.demoapi;

import com.pmcmusic.demoapi.Respotivy.UsertRepository;
import com.pmcmusic.demoapi.Respotivy.VideoRespontivy;

import org.springframework.boot.CommandLineRunner;

/**
 *
 * @author Admin
 */
public class DatabaseLoader implements CommandLineRunner {

    private VideoRespontivy videoRespontivy;
    private UsertRepository usertRepository;

    public DatabaseLoader(VideoRespontivy videoRespontivy, UsertRepository usertRepository) {
        this.videoRespontivy = videoRespontivy;
        this.usertRepository = usertRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}

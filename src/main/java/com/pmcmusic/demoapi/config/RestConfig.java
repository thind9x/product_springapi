/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmcmusic.demoapi.config;

import com.pmcmusic.demoapi.Model.Product;
import com.pmcmusic.demoapi.Model.Video;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component
@Configuration
public class RestConfig implements RepositoryRestConfigurer {
  // @Override
  // public void configureRepositoryRestConfiguration(RepositoryRestConfiguration
  // config) {
  // config.exposeIdsFor(Video.class);
  // config.exposeIdsFor(Product.class);
  // }
}

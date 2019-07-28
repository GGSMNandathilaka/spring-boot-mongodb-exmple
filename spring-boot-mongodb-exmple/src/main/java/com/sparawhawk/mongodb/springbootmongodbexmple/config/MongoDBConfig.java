package com.sparawhawk.mongodb.springbootmongodbexmple.config;

import com.sparawhawk.mongodb.springbootmongodbexmple.document.Users;
import com.sparawhawk.mongodb.springbootmongodbexmple.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

}

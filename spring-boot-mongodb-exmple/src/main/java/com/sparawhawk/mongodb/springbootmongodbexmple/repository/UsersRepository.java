package com.sparawhawk.mongodb.springbootmongodbexmple.repository;

import com.sparawhawk.mongodb.springbootmongodbexmple.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends MongoRepository<Users, Integer> {
    @Override
    Optional<Users> findById(Integer integer);

    @Query("{'Address.city':?0}")
    List<Users> findByCity(String city);
}

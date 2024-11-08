package com.bank.fake_user_app.repository;

import com.bank.fake_user_app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FakeUserRepository extends JpaRepository<Person, Long> {
}

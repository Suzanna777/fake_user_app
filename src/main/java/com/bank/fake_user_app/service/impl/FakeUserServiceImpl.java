package com.bank.fake_user_app.service.impl;

import com.bank.fake_user_app.service.FakeUserService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class FakeUserServiceImpl implements FakeUserService {

    private final Faker faker;

    public FakeUserServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public String getRandomName() {
        return faker.name().fullName();
    }

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ApiKeyEntity;

public interface ApiKeyService {

    ApiKeyEntity create(ApiKeyEntity apiKey);

    ApiKeyEntity update(Long id, ApiKeyEntity apiKey);

    ApiKeyEntity getById(Long id);

    List<ApiKeyEntity> getAll();


    void deactivate(Long id);
}
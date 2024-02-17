package com.encore.mvc.controller;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;
import com.encore.mvc.service.EncoreServiceImpl;

import java.util.List;
import java.util.Map;

public class SelectController {

    private EncoreServiceImpl service;

    public SelectController() {
        service = new EncoreServiceImpl();
    }

    public List<PostResponseDTO> execute() {
        System.out.println(">>> selectController execute <<<");

        // 의존관계 형성 후 메서드 호출 / 반환
        List<PostResponseDTO> response = service.selectService();
        return response;
    }


}

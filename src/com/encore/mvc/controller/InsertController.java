package com.encore.mvc.controller;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.service.EncoreServiceImpl;

import java.util.Map;

// Controller 는 Service 를 갖는다.
public class InsertController {

    private EncoreServiceImpl service;

    public InsertController() {
        service = new EncoreServiceImpl();
    }

    public int execute(PostRequestDTO params) {
        System.out.println(">>> InsertController execute <<<");
        System.out.println(">>> params : " + params);

        // 의존관계 형성 후 메서드 호출 / 반환
        int flag = service.insertService(params);
        return flag;
    }

    public int execute(Map<String, String> params) {
        System.out.println(">>> InsertController execute <<<");
        System.out.println(">>> params : " + params);

        // 의존관계 형성 후 메서드 호출 / 반환
        int flag = service.insertService(params);
        return flag;
    }

}

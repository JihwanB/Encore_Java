package com.encore.mvc.service;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;
import com.encore.mvc.model.sql.EncoreDAO;

import java.util.List;
import java.util.Map;

// Service 는 DAO 를 갖는다
public class EncoreServiceImpl {

    private EncoreDAO dao;

    public EncoreServiceImpl() {
        dao = new EncoreDAO();
    }

    // DAO 의 insertRow() 메서드를 호출해서 결과 반환
    public int insertService(PostRequestDTO params) {
        System.out.println(">>> Service insertService <<<");
        System.out.println(">>> params : " + params);
        return dao.insertRow(params);
    }

    public int insertService(Map<String, String> params) {
        System.out.println(">>> Service insertService <<<");
        System.out.println(">>> params : " + params);
        return dao.insertRow(params);
    }

    public List<PostResponseDTO> selectService() {
        System.out.println(">>> Service selectService <<<");

        return dao.selectRow();
    }

}

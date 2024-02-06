package com.encore.workshop.workshop3.subway.service;

import com.encore.workshop.workshop3.subway.domain.CardDTO;
import com.encore.workshop.workshop3.subway.domain.StationDTO;

public interface SubwayService {

    // 운행요금을 반환하는 메서드(잔액 부족할 경우 -1)
    // CardDTO card : 소유카드(충전), StationDTO start : 출발역, StationDTO end : 종착역
    int chargeFee(CardDTO card, StationDTO start, StationDTO end);

    // 카드요금을 차감하는 메서드
    // amount : 차감 금액
    // 차감이 성공하면 true, 실패하면 false
    boolean subtractBalance(CardDTO card, int amount);

    // 출발역과 종착역 사이의 거리 계산
    // 역간 거리를 반환하는 메서드
    int getDistance(StationDTO start, StationDTO end);

}

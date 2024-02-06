package com.encore.workshop.workshop3.subway.service;

import com.encore.workshop.workshop3.subway.domain.CardDTO;
import com.encore.workshop.workshop3.subway.domain.StationDTO;

public class SubwayServiceImpl implements SubwayService {

    private static final int BASIC_FEE = 800;

    public int getBasicFee() {
        return BASIC_FEE;
    }

    @Override
    public int chargeFee(CardDTO card, StationDTO start, StationDTO end) {

        int fee;
        int distance = getDistance(start, end);

        if (distance <= 12) {
            fee = BASIC_FEE;
        } else if (distance <= 42) {
            fee = BASIC_FEE + (((distance - 12 - 1) / 6) + 1) * 100;
        } else {
            fee = BASIC_FEE + 500 + (((distance - 42 - 1) / 12) + 1) * 100;
        }

        if (subtractBalance(card, fee)) {
            return fee;
        } else {
            return -1;
        }

    }

    @Override
    public boolean subtractBalance(CardDTO card, int amount) {

        if (card.getBalance() < BASIC_FEE)
            return false;

        if (card.getBalance() < amount) {
            return false;
        } else {
            card.setBalance(card.getBalance() - amount);
            return true;
        }

    }

    @Override
    public int getDistance(StationDTO start, StationDTO end) {

        return Math.abs(end.getLocation() - start.getLocation());

    }
}

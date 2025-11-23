package com.pm.parkinglot.factory;

import com.pm.parkinglot.models.SpotAssignmentStratergyType;
import com.pm.parkinglot.stratergies.RandomSpotAssignmentStartergy;
import com.pm.parkinglot.stratergies.SpotAssignmentStratergy;

public class SpotAssignmentStartergyFactory {
    public static SpotAssignmentStratergy getSpotAssignmentStartergy(SpotAssignmentStratergyType spotAssignmentStratergyType) {
        return new RandomSpotAssignmentStartergy();

    }

}

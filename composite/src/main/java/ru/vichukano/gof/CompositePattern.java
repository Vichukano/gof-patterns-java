package ru.vichukano.gof;

import java.util.List;

public class CompositePattern {

    void usageExample() {
        WorkUnit team = new DeveloperTeam(
                List.of(
                        new DeveloperTeamLead(List.of(new JavaDeveloper(), new FrontendDeveloper(), new DevOps())),
                        new ManualTester()
                )
        );
        team.doWork();
    }

}

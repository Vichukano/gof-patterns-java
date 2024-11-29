package ru.vichukano.gof;

import java.util.List;

public class DeveloperTeamLead implements WorkUnit {
    private final List<WorkUnit> developers;

    public DeveloperTeamLead(List<WorkUnit> developers) {
        this.developers = developers;
    }

    @Override
    public void doWork() {
        System.out.println("Start to delegate tasks to developers...");
        developers.forEach(WorkUnit::doWork);
        System.out.println("Code review...");
    }

}

package ru.vichukano.gof;

import java.util.List;

public class DeveloperTeam implements WorkUnit {
    private final List<WorkUnit> members;

    public DeveloperTeam(List<WorkUnit> members) {
        this.members = members;
    }

    @Override
    public void doWork() {
        System.out.println("Start to do project!");
        members.forEach(WorkUnit::doWork);
        System.out.println("Project finished!");
    }

}

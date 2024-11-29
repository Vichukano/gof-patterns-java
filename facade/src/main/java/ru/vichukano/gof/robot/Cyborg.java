package ru.vichukano.gof.robot;

import ru.vichukano.gof.robot.parts.Arm;
import ru.vichukano.gof.robot.parts.Body;
import ru.vichukano.gof.robot.parts.Head;
import ru.vichukano.gof.robot.parts.Leg;

public class Cyborg {
    private final Arm leftArm;
    private final Arm rightArm;
    private final Body body;
    private final Leg leftLeg;
    private final Leg rightLeg;
    private final Head head;

    public Cyborg(Arm leftArm, Arm rightArm, Body body, Leg leftLeg, Leg rightLeg, Head head) {
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.body = body;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.head = head;
    }

    public void activate() {
        System.out.println("Cyborg activated...");
        leftArm.hold();
        rightArm.hold();
        body.move();
        head.think();
        leftLeg.walk();
        rightLeg.walk();
    }
}

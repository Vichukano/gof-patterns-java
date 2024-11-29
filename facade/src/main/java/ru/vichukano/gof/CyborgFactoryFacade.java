package ru.vichukano.gof;

import ru.vichukano.gof.robot.Cyborg;
import ru.vichukano.gof.robot.factory.*;

public class CyborgFactoryFacade {

    /**
     * Simple interface for complex logic.
     *
     * @return cyborg.
     */
    Cyborg makeCyborg() {
        ArmFactory leftArmFactory = new LeftArmFactory();
        ArmFactory rightArmFactory = new RightArmFactory();
        LegFactory leftLegFactory = new LeftLegFactory();
        LegFactory rightLegFactory = new RightLegFactory();
        HeadFactory headFactory = new MetalHeadFactory();
        BodyFactory bodyFactory = new ArmoredBodyFactory();
        return new Cyborg(
                leftArmFactory.makeArm(),
                rightArmFactory.makeArm(),
                bodyFactory.makeBody(),
                leftLegFactory.makeLeg(),
                rightLegFactory.makeLeg(),
                headFactory.makeHead()
        );
    }

}

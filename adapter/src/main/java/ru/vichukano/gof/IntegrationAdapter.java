package ru.vichukano.gof;

import ru.vichukano.gof.domain.DomainModel;

public interface IntegrationAdapter {

    void publishDomainModel(DomainModel model);

}

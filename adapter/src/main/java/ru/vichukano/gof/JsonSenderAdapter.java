package ru.vichukano.gof;

import ru.vichukano.gof.domain.DomainModel;
import ru.vichukano.gof.integration.JsonSender;

public class JsonSenderAdapter implements IntegrationAdapter {
    private final JsonSender sender;

    public JsonSenderAdapter(JsonSender sender) {
        this.sender = sender;
    }

    @Override
    public void publishDomainModel(DomainModel model) {
        JsonSender.Json json = convert(model);
        sender.sendJson(json);
    }

    public JsonSender.Json convert(DomainModel model) {
        return new JsonSender.Json();
    }
}

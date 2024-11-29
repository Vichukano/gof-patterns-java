package ru.vichukano.gof;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vichukano.gof.domain.DomainModel;
import ru.vichukano.gof.integration.JsonSender;
import ru.vichukano.gof.integration.XmlExporter;


class IntegrationAdapterTest {

    @Test
    void adapterPatternExample() throws Exception {
        var model = new DomainModel(100500, "model-2000");
        IntegrationAdapter jsonAdapter = new JsonSenderAdapter(new JsonSender());
        IntegrationAdapter xmlAdapter = new XmlExporterAdapter(new XmlExporter());

        String jsonOut = SystemLambda.tapSystemOut(() -> jsonAdapter.publishDomainModel(model));
        String xmlOut = SystemLambda.tapSystemOut(() -> xmlAdapter.publishDomainModel(model));

        Assertions.assertEquals(jsonOut, "Send json file\n");
        Assertions.assertEquals(xmlOut, "Export xml\n");
    }


}
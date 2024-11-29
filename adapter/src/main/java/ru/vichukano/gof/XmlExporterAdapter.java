package ru.vichukano.gof;

import ru.vichukano.gof.domain.DomainModel;
import ru.vichukano.gof.integration.XmlExporter;

public class XmlExporterAdapter implements IntegrationAdapter {
    private final XmlExporter exporter;

    public XmlExporterAdapter(XmlExporter exporter) {
        this.exporter = exporter;
    }

    @Override
    public void publishDomainModel(DomainModel model) {
        XmlExporter.Xml xml = convert(model);
        exporter.exportXml(xml);
    }

    private XmlExporter.Xml convert(DomainModel model) {
        return new XmlExporter.Xml();
    }
}

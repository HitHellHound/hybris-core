package concerttours.attributehandlers;

import concerttours.model.ProducerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.springframework.stereotype.Component;

@Component
public class ProducerFullNameAttributeHandler extends AbstractDynamicAttributeHandler<String, ProducerModel> {
    @Override
    public String get(ProducerModel model) {
        return model.getName() + " " + model.getSurname();
    }
}

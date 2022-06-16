package softuni.mobilele.service.impl;

import org.springframework.stereotype.Service;
import softuni.mobilele.repository.ModelRepository;
import softuni.mobilele.service.ModelService;


@Service
public class ModelServiceImpl implements ModelService {
    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }
}

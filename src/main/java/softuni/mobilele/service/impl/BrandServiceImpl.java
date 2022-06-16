package softuni.mobilele.service.impl;

import org.springframework.stereotype.Service;
import softuni.mobilele.repository.BrandRepository;
import softuni.mobilele.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
}

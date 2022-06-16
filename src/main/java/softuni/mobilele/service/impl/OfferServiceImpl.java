package softuni.mobilele.service.impl;

import org.springframework.stereotype.Service;
import softuni.mobilele.repository.OfferRepository;
import softuni.mobilele.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }
}

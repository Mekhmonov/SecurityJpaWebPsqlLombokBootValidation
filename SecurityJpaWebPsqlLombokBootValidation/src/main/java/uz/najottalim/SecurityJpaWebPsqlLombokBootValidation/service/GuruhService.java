package uz.najottalim.SecurityJpaWebPsqlLombokBootValidation.service;

import org.springframework.stereotype.Service;
import uz.najottalim.SecurityJpaWebPsqlLombokBootValidation.repository.GuruxRepository;

@Service

public class GuruhService  {
    private final GuruxRepository guruxRepository;

    public GuruhService(GuruxRepository guruxRepository) {
        this.guruxRepository = guruxRepository;
    }
}

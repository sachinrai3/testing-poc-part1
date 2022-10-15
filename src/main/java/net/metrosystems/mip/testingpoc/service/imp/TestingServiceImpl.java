package net.metrosystems.mip.testingpoc.service.imp;

import net.metrosystems.mip.testingpoc.service.TestingService;
import org.springframework.stereotype.Service;

@Service
public class TestingServiceImpl implements TestingService {
    @Override
    public String getResponse() {
        return "Hello POC";
    }
}

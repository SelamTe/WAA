package miu.edu.lab1.service.Applicatioser;

import miu.edu.lab1.domain.ApplicationLogger;
import miu.edu.lab1.repository.ApplicationLoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationLoggerServiceImp implements ApplicationLoggerService{


    @Autowired
    private ApplicationLoggerRepository applicationLoggerRepository;


    @Override
    public void saveApplicationLog(ApplicationLogger applicationLogger) {
        applicationLoggerRepository.save(applicationLogger);
    }




}

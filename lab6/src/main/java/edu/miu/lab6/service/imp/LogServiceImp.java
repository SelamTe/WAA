package edu.miu.lab6.service.imp;

import edu.miu.lab6.entity.Log;
import edu.miu.lab6.entity.dto.LogDto;
import edu.miu.lab6.repo.LogRepo;
import edu.miu.lab6.service.LogService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImp implements LogService {
    @Autowired
    LogRepo logRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void save(LogDto log) {
        logRepo.save(modelMapper.map(log, Log.class));
    }
}

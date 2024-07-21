package com.example.assignmentinternship.service;

import com.example.assignmentinternship.entity.Load;
import com.example.assignmentinternship.repository.LoadRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LoadService {

    @Autowired
    private LoadRepository loadRepository;

    public Load addLoad(Load load) {
        return loadRepository.save(load);
    }

    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    public Optional<Load> getLoadById(Long loadId) {
        return loadRepository.findById(loadId);
    }

    public Load updateLoad(Long loadId, Load load) {
        load.setId(loadId);
        return loadRepository.save(load);
    }

    public void deleteLoad(Long loadId) {
        loadRepository.deleteById(loadId);
    }

}

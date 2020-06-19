package com.xuanke.service.Impl;

import com.xuanke.entity.Estimate;
import com.xuanke.entity.EstimateExample;
import com.xuanke.entity.StudentExample;
import com.xuanke.mapping.EstimateMapper;
import com.xuanke.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstimateServiceImpl implements EstimateService {

    @Autowired
    EstimateMapper estimateMapper;

    @Override
    public List<Estimate> getAllEstimate() {
        return estimateMapper.selectByExample(new EstimateExample());
    }

    @Override
    public List<Estimate> getEstimateBycid(EstimateExample estimateExample) {
        return estimateMapper.selectByExample(estimateExample);
    }


}


package com.xuanke.service;

import com.xuanke.entity.Estimate;
import com.xuanke.entity.EstimateExample;

import java.util.List;

public interface EstimateService {

    List<Estimate>  getAllEstimate();

    List<Estimate> getEstimateBycid(EstimateExample estimateExample);


}

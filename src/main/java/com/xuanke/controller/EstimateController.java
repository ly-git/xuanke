package com.xuanke.controller;

import com.xuanke.entity.Estimate;
import com.xuanke.entity.EstimateExample;
import com.xuanke.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
public class EstimateController {

    @Autowired
    EstimateService estimateService;


    @RequestMapping("/allEstimate")
    @ResponseBody
    public List<Estimate> getAllEstimate(){
        return estimateService.getAllEstimate();
    }

    @RequestMapping("/getEstimateBycid")
    @ResponseBody
    public List<Estimate> getEstimateBycid(){
        List<Estimate> estimateList=null;
        EstimateExample ee=new EstimateExample();
        ee.createCriteria().andCidEqualTo("C09");
        estimateList=estimateService.getEstimateBycid(ee);
      return  estimateList;
    }

}

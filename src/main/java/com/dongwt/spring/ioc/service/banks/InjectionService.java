package com.dongwt.spring.ioc.service.banks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dongwt on 2017/9/8.
 */
@Service
public class InjectionService {

    @Autowired
    private  RanksService rankOneServiceImpl;

    @Autowired
    private RankTwoServiceImpl rankTwoServiceImpl;

    @Resource(name="rankThreeServiceImpl")
    private RanksService ranksService;


    public void injection(){
        rankOneServiceImpl.toString();
        rankTwoServiceImpl.toString();
        ranksService.toString();
    }
}

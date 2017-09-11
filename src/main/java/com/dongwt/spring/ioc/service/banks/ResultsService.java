package com.dongwt.spring.ioc.service.banks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongwt on 2017/9/8.
 */
@Service
public class ResultsService {
    @Autowired
    private List<RanksService> ranksService ;

    @Override
    public String toString(){
        return ranksService.toString();
    }
}

package com.example.lombok.intro;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Create by Atiye Mousavi 
    Date: 3/2/2022
    Time: 12:41 PM
**/
public class GetterLazy {
    private static final String DELIMETER=",";

    @Getter(lazy = true)
    private final Map<String,Long> transactions=getTransactions();

    private Map<String,Long> getTransaction(){

        final Map<String,Long> cache=new HashMap<>();
        List<String> txnRows=readTxnListFromFile();

        txnRows.forEach(s ->{
            String[] txnIdValueTuple=s.split(DELIMETER);
            cache.put(txnIdValueTuple[0],Long.parseLong(txnIdValueTuple[1]));
        });
        return cache;
    }

    private List<String> readTxnListFromFile(){
        return Stream.of("file content here").collect(Collectors.toList());
    }
}

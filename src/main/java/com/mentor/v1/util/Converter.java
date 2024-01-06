package com.mentor.v1.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {
    private final ModelMapper modelMapper;

    public Converter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public  <S,T>  T convert(S source, Class<T> target){return modelMapper.map(source,target);}

    public  <S,T> List<T> toList(List<S> source, Class<T> target){return source
                                                                            .stream()
                                                                            .map(sourceItem -> modelMapper.map(sourceItem, target))
                                                                            .collect(Collectors.toList());}
}

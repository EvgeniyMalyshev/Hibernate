package ru.malyshev.embedded.converter;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

@Service
public class AbstractConverter {

    public<T,E> E convertToEntity (T dto, Class<E>entityClass){
        DozerBeanMapper mapper = new DozerBeanMapper();
        return mapper.map(dto, entityClass);
    }

    public<T,E> T convertToDTO (E entity, Class<T>dtoClass){
        DozerBeanMapper mapper = new DozerBeanMapper();
        return mapper.map(entity, dtoClass);
    }
}

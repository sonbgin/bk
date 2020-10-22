package com.bk.service;

import com.bk.entity.Type;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.List;

/**
 * @author songbin
 * @date 2020/10/9
 */
public interface TypeService {

    int saveType(Type type);

    Type getType(int id);

    Type getTypeByName(String name);

    List<Type> listType();

    int update(int id,Type type);

    void deleteType(int id);
}

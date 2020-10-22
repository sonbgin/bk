package com.bk;

import com.bk.entity.Blog;
import com.bk.entity.Comment;
import com.bk.entity.Tag;
import com.bk.mapper.CommentMapper;
import com.bk.mapper.TypeMapper;
import com.bk.entity.Type;
import com.bk.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class BkApplicationTests {

    @Resource
    TypeService typeService;

    @Test
    void contextLoads() {
        typeService.listType().forEach(System.out::println);
    }

}

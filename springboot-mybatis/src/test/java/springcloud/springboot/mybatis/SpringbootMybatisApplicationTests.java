package springcloud.springboot.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springcloud.springboot.mybatis.domain.TbUser;
import springcloud.springboot.mybatis.mapper.TbUserMapper;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
@Autowired
private TbUserMapper tbUserMapper;
    @Test
    public void contextLoads() {
        List<TbUser> tbUsers = tbUserMapper.getAllUsers();
        System.out.println(tbUsers);
    }

}

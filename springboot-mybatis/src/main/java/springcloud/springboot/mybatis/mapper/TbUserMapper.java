package springcloud.springboot.mybatis.mapper;

import springcloud.springboot.mybatis.domain.TbUser;
import springcloud.springboot.utils.MyMapper;

import java.util.List;

public interface TbUserMapper extends MyMapper<TbUser> {

    List<TbUser> getAllUsers();
}
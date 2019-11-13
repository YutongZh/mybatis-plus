package com.yt;

import static org.junit.Assert.assertTrue;

import com.yt.mybatis.entity.TPosition;
import com.yt.mybatis.entity.TRole;
import com.yt.mybatis.entity.TUser;
import com.yt.mybatis.mapper.TRoleMapper;
import com.yt.mybatis.mapper.TUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest{

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        inputStream.close();
    }

    // 一对一 嵌套结果
    @Test
    public void selectByAssociationResult(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
        List<TUser> userAndPosition = mapper.selectByAssociation();
        System.out.println(userAndPosition);
    }


    //一对一  N+1 问题解决  延迟加载 fetchType = lazy
    @Test
    public void selectByAssociationQuery(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
        List<TUser> userAndPositions = mapper.selectByAssociationQuery();
        for (TUser userAndPosition : userAndPositions) {
            System.out.println(userAndPosition.getUserName());
        }
    }

    //多对多  新建中间表 转化成两个一对多处理
    @Test
    public void selectByCollectionQuery(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
        List<TUser> tUsers = mapper.selectByCollectionQuery();
        System.out.println(tUsers);
        TRoleMapper roleMapper = sqlSession.getMapper(TRoleMapper.class);
        List<TRole> tRoles = roleMapper.selectByCollection();
        System.out.println(tRoles);
    }

    @Test
    public void selectByDiscriminator(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
        List<Object> o = mapper.selectByDiscriminator();
        System.out.println(o);
    }

}

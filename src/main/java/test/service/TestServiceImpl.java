package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.Test;
import test.dao.TestMapper;

/**
 * Created by tyg on 2015/3/30.
 */
@Service("TestSevice")
public class TestServiceImpl implements  TestSevice {

    private TestMapper testMapper;

    public TestMapper getTestMapper() {
        return testMapper;
    }

    @Autowired
    public void setTestMapper(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public void insertTest(Test test) {
        testMapper.insertSelective(test);
    }
}

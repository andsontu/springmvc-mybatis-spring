package test.dao;

import org.apache.ibatis.annotations.Insert;
import test.Test;

/**
 * Created by tyg on 2015/3/30.
 */
public interface TestMapper {

    public void insert(Test test);

    public void insertSelective(Test test);
}

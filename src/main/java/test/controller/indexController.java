package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import test.Test;
import test.service.TestSevice;

/**
 * Created by tyg on 2015/3/30.
 */
@Controller
@RequestMapping("/index.do")
public class indexController {

    private TestSevice testSevice;

    public TestSevice getTestSevice() {
        return testSevice;
    }

    @Autowired
    public void setTestSevice(TestSevice testSevice) {
        this.testSevice = testSevice;
    }

    @RequestMapping(value = "")
    public String getIndex(){
        Test test=new Test();
        test.setName("xxx");
        test.setPassword("password");
        testSevice.insertTest(test);
        return "test";
    }
}

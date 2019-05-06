package cn.itsoure.aigou.controller;

import cn.itsource.aigou.AjaxResult;
import cn.itsource.aigou.domain.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    /**
     * RequestBody:用于接收页面请求体中的对象值，绑定到一个对象上
     * @param employee
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //@RequestBody用于接收post的请求参数
        //模拟service层数据
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }

}

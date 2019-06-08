package cn.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author RemainderTime
 * @date 2019/6/8 19:14
 */

@SpringBootApplication
// 扫描mybatis mapper包路径
@MapperScan(basePackages="cn.xf.mapper")
// 扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
/*@ComponentScan(basePackages= {"com.imooc", "org.n3r.idworker"})*/
public class WeContactLianXinAppliaction {

        public static void main(String[] args) {
            SpringApplication.run(WeContactLianXinAppliaction.class, args);
    }
}

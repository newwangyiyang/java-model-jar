package cn.yiyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("cn.yiyang.*.dao")
@EnableTransactionManagement // 开启注解事务管理
@EnableScheduling
@SpringBootApplication
public class ModelApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
        System.out.println("/**\n" +
				" *                             _ooOoo_\n" +
				" *                            o8888888o\n" +
				" *                            88\" . \"88\n" +
				" *                            (| -_- |)\n" +
				" *                            O\\  =  /O\n" +
				" *                         ____/`---'\\____\n" +
				" *                       .'  \\\\|     |//  `.\n" +
				" *                      /  \\\\|||  :  |||//  \\\n" +
				" *                     /  _||||| -:- |||||-  \\\n" +
				" *                     |   | \\\\\\  -  /// |   |\n" +
				" *                     | \\_|  ''\\---/''  |   |\n" +
				" *                     \\  .-\\__  `-`  ___/-. /\n" +
				" *                   ___`. .'  /--.--\\  `. . __\n" +
				" *                .\"\" '<  `.___\\_<|>_/___.'  >'\"\".\n" +
				" *               | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
				" *               \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n" +
				" *          ======`-.____`-.___\\_____/___.-`____.-'======\n" +
				" *                             `=---='\n" +
				" *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n" +
				" *                     佛祖保佑        永无BUG\n" +
				" *            佛曰:\n" +
				" *                   写字楼里写字间，写字间里程序员；\n" +
				" *                   程序人员写程序，又拿程序换酒钱。\n" +
				" *                   酒醒只在网上坐，酒醉还来网下眠；\n" +
				" *                   酒醉酒醒日复日，网上网下年复年。\n" +
				" *                   但愿老死电脑间，不愿鞠躬老板前；\n" +
				" *                   奔驰宝马贵者趣，公交自行程序员。\n" +
				" *                   别人笑我忒疯癫，我笑自己命太贱；\n" +
				" *                   不见满街漂亮妹，哪个归得程序员？\n" +
				"*/\n  ");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 注意的Application是启动类，就是main方法所属的类
		return builder.sources(ModelApplication.class);
	}
}

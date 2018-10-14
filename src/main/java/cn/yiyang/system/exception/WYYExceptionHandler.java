package cn.yiyang.system.exception;

import cn.yiyang.common.utils.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: Administrator
 * @Date: 2018/10/13 14:13
 * @Description:
 */

@RestControllerAdvice
public class WYYExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 自定义异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(WYYException.class)
    public ResultBean handleBDException(WYYException e) {
        logger.error(e.getMessage(), e);
        return ResultBean.exception(500, e.getMsg());
    }
}

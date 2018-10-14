package cn.yiyang.common.utils;

/**
 * @Author wangyiyang
 * @Description //TODO 
 * @Date 9:05 2018/9/10
 **/
public enum ResultEnum {
	
	SUCCESS(1,"请求成功"),
	
	ERROR(0,"请求出错"),
	
	EXCEPTION(2,"请求异常");
	
	private Integer code;
	
	private String msg;

	ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}

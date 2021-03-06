package org.ssssssss.magicapi.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/**
 * 接口信息
 */
public class ApiInfo {

	/**
	 * 接口ID
	 */
	private String id;

	/**
	 * 请求方法
	 */
	private String method;

	/**
	 * 请求路径
	 */
	private String path;

	/**
	 * 脚本内容
	 */
	private String script;

	/**
	 * 接口名称
	 */
	private String name;

	/**
	 * 接口分组名称
	 */
	private String groupName;

	/**
	 * 分组前缀
	 */
	private String groupPrefix;

	/**
	 * 设置的请求参数
	 */
	private String parameter;

	/**
	 * 设置的接口选项
	 */
	private String option;

	/**
	 * 输出结果
	 */
	private String output;

	/**
	 * 接口选项json->map
	 */
	private Map optionMap;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getGroupPrefix() {
		return groupPrefix;
	}

	public void setGroupPrefix(String groupPrefix) {
		this.groupPrefix = groupPrefix;
	}


	public Map getOptionMap() {
		return optionMap;
	}

	public void setOptionMap(Map optionMap) {
		this.optionMap = optionMap;
	}

	public String getOption() {
		return option;
	}

	public void setOptionValue(String optionValue){
		this.setOption(optionValue);
	}

	public void setOption(String option) {
		this.option = option;
		try {
			this.optionMap = new ObjectMapper().readValue(option, Map.class);
		} catch (Throwable ignored) {
		}
	}

	public Object getOptionValue(String key) {
		return this.optionMap != null ? this.optionMap.get(key) : null;
	}
}

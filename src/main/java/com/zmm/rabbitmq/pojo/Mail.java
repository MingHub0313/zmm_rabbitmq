package com.zmm.rabbitmq.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @Name Mail
 * @Author 900045
 * @Created by 2020/4/30 0030
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

	@Pattern(regexp = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", message = "邮箱格式不正确")
	private String to;

	@NotBlank(message = "标题不能为空")
	private String title;

	@NotBlank(message = "正文不能为空")
	private String content;

	/**
	 * 消息id
	 */
	private String msgId;
}

package cn.midnight.image.service;

import org.springframework.web.multipart.MultipartFile;

import cn.midnight.base.controller.CallContext;
import cn.midnight.image.entity.ImageOper;

public interface IImageService {

	/**
	 * 图片的上传
	 * 
	 * @param image
	 * @param callContent
	 * @param imagePath
	 * @return
	 * @throws Exception
	 */
	String uploadImage(MultipartFile image, CallContext callContent, String imagePath) throws Exception;

	/**
	 * 图片的下载
	 * 
	 * @param imagePath
	 * @param oper
	 * @throws Exception
	 */
	void downImage(String imagePath, ImageOper oper) throws Exception;

}

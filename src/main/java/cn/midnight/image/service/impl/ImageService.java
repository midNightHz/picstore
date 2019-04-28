package cn.midnight.image.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cn.midnight.base.controller.CallContext;
import cn.midnight.config.ApplicationProperties;
import cn.midnight.image.entity.ImageOper;
import cn.midnight.image.service.IImageService;


@Service
public class ImageService implements IImageService {
	@Autowired
	private ApplicationProperties applicationProperties;

	@Override
	public String uploadImage(MultipartFile image, CallContext callContent, String imagePath) throws Exception {
		
		//是否启动缓存
		
		return null;
	}

	@Override
	public void downImage(String imagePath, ImageOper oper) throws Exception {
		// TODO Auto-generated method stub

	}

}

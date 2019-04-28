package cn.midnight.image.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cn.midnight.base.controller.CallContext;
import cn.midnight.config.ImageProperties;
import cn.midnight.image.entity.ImageOper;
import cn.midnight.image.service.IImageService;

@Service
public class ImageService implements IImageService {
	@Autowired
	private ImageProperties imageProperties;

	@Override
	public String uploadImage(MultipartFile image, CallContext callContent, String imagePath) throws Exception {

		// 是否启动压缩

		boolean compress = imageProperties.isCompress();

		// 是否对图片大小进行限制

		return null;
	}

	@Override
	public void downImage(String imagePath, ImageOper oper) throws Exception {
		// TODO Auto-generated method stub

	}

}

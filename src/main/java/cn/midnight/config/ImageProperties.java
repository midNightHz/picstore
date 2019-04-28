package cn.midnight.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "image")
public class ImageProperties {

	/**
	 * 是否对上传图片进行压缩
	 */
	private boolean compress = false;
	/**
	 * 压缩质量
	 */
	private double compressQuality = 0.75;
	/**
	 * 图片上传大小限制
	 */
	private long imageMaxSize = 10 * 1024 * 1024L;

	public boolean isCompress() {
		return compress;
	}

	public void setCompress(boolean compress) {
		this.compress = compress;
	}

	public double getCompressQuality() {
		return compressQuality;
	}

	public void setCompressQuality(double compressQuality) {
		this.compressQuality = compressQuality;
	}

	public long getImageMaxSize() {
		return imageMaxSize;
	}

	public void setImageMaxSize(long imageMaxSize) {
		this.imageMaxSize = imageMaxSize;
	}

}

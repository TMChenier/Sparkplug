/*
 * Licensed Materials - Property of Cirrus Link Solutions
 * Copyright (c) 2016 Cirrus Link Solutions LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.cirruslink.sparkplug.message.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * A class to represent the meta data associated with a metric.
 */
@JsonInclude(Include.NON_NULL)
public class MetaData {

	/**
	 * Indicates if the metric represents one of multiple parts.
	 */
	private Boolean isMultiPart;
	
	/**
	 * A content type associated with the metric.
	 */
	private String contentType;
	
	/** 
	 * A size associated with the metric.
	 */
	private Long size;
	
	/**
	 * A sequence associated with the metric.
	 */
	private Long seq;

	/**
	 * A file name associated with the metric.
	 */
	private String fileName;
	
	/** 
	 * A file type associated with the metric.
	 */
	private String fileType;
	
	/**
	 * A MD5 sum associated with the metric.
	 */
	private String md5;
	
	/**
	 * A description associated with the metric.
	 */
	private String description;
	
	/**
	 * Default no-arg constructor.
	 */
	public MetaData() {}

	/**
	 * Constructor with fields.
	 * 
	 * @param isMultiPart if the metric represents one of multiple parts.
	 * @param contentType a content type associated with the metric.
	 * @param size a size associated with the metric.
	 * @param seq a sequence associated with the metric.
	 * @param fileName a file name associated with the metric.
	 * @param fileType a file type associated with the metric.
	 * @param md5 a MD5 sum associated with the metric.
	 * @param description a description associated with the metric
	 */
	public MetaData(Boolean isMultiPart, String contentType, Long size, Long seq, String fileName, 
			String fileType, String md5, String description) {
		this.isMultiPart = isMultiPart;
		this.contentType = contentType;
		this.size = size;
		this.seq = seq;
		this.fileName = fileName;
		this.fileType = fileType;
		this.md5 = md5;
		this.description = description;
	}

	public Boolean isMultiPart() {
		return isMultiPart;
	}

	public MetaData setMultiPart(Boolean isMultiPart) {
		this.isMultiPart = isMultiPart;
		return this;
	}

	public String getContentType() {
		return contentType;
	}

	public MetaData setContentType(String contentType) {
		this.contentType = contentType;
		return this;
	}

	public Long getSize() {
		return size;
	}

	public MetaData setSize(Long size) {
		this.size = size;
		return this;
	}

	public Long getSeq() {
		return seq;
	}

	public MetaData setSeq(Long seq) {
		this.seq = seq;
		return this;
	}

	public String getFileName() {
		return fileName;
	}

	public MetaData setFileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public String getFileType() {
		return fileType;
	}

	public MetaData setFileType(String fileType) {
		this.fileType = fileType;
		return this;
	}

	public String getMd5() {
		return md5;
	}

	public MetaData setMd5(String md5) {
		this.md5 = md5;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public MetaData setDescription(String description) {
		this.description = description;
		return this;
	}

	@Override
	public String toString() {
		return "MetaData [isMultiPart=" + isMultiPart + ", contentType=" + contentType + ", size=" + size + ", seq=" 
				+ seq + ", fileName=" + fileName + ", fileType=" + fileType + ", md5=" + md5 + ", description=" 
				+ description + "]";
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || this.getClass() != object.getClass()) {
			return false;
		}
		MetaData meta = (MetaData) object;
		return Objects.equals(isMultiPart, meta.isMultiPart())
				&& Objects.equals(contentType, meta.getContentType())
				&& Objects.equals(size, meta.getSize())
				&& Objects.equals(seq, meta.getSeq())
				&& Objects.equals(fileName, meta.getFileName())
				&& Objects.equals(fileType, meta.getFileType())
				&& Objects.equals(md5, meta.getMd5())
				&& Objects.equals(description, meta.getDescription());
	}
	
	/**
	 * A Builder for a MetaData instance.
	 */
	public static class MetaDataBuilder {

		private Boolean isMultiPart;
		private String contentType;
		private Long size;
		private Long seq;
		private String fileName;
		private String fileType;
		private String md5;
		private String description;
		
		public MetaDataBuilder() {};

		public MetaDataBuilder(MetaData metaData) {
			this.isMultiPart = metaData.isMultiPart();
			this.contentType = metaData.getContentType();
			this.size = metaData.getSize();
			this.seq = metaData.getSeq();
			this.fileName = metaData.getFileName();
			this.fileType = metaData.getFileType();
			this.md5 = metaData.getMd5();
			this.description = metaData.getDescription();
		}

		public MetaDataBuilder multiPart(Boolean isMultiPart) {
			this.isMultiPart = isMultiPart;
			return this;
		}

		public MetaDataBuilder contentType(String contentType) {
			this.contentType = contentType;
			return this;
		}
		
		public MetaDataBuilder size(Long size) {
			this.size = size;
			return this;
		}
		
		public MetaDataBuilder seq(Long seq) {
			this.seq = seq;
			return this;
		}
		
		public MetaDataBuilder fileName(String fileName) {
			this.fileName = fileName;
			return this;
		}
		
		public MetaDataBuilder fileType(String fileType) {
			this.fileType = fileType;
			return this;
		}
		
		public MetaDataBuilder md5(String md5) {
			this.md5 = md5;
			return this;
		}
		
		public MetaDataBuilder description(String description) {
			this.description = description;
			return this;
		}
		
		public MetaData createMetaData() {
			return new MetaData(isMultiPart, contentType, size, seq, fileName, fileType, md5, description);
		}
	}
}

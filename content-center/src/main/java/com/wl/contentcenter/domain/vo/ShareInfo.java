package com.wl.contentcenter.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: ShareInfo @Description: TODO @Author: WangLinLIN @Date:
 * 2020/10/15 19:13:31  @Version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("分享消息")
public class ShareInfo {
  // 作者
  @ApiModelProperty(name = "id", value = "链接id")
  private Integer id;
  // 作者
  @ApiModelProperty(name = "author", value = "作者")
  private String author;
  /** 发布者 */
  @ApiModelProperty(name = "author", value = "发布者")
  private String publisherName;
  // 下载地址
  @ApiModelProperty(name = "downloadUrl", value = "下载地址")
  private String downloadUrl;
  // 是否原创 0否 1 是
  @ApiModelProperty(name = "isOriginal", value = "是否原创 0否 1 是")
  private byte isOriginal;
  // 价格
  @ApiModelProperty(name = "price", value = "价格")
  private Integer price;
  // 简介
  @ApiModelProperty(name = "summary", value = "简介")
  private String summary;

  // 标题
  @ApiModelProperty(name = "title", value = "标题")
  private String title;
  // 封面
  @ApiModelProperty(name = "cover", value = "封面")
  private String cover;
}

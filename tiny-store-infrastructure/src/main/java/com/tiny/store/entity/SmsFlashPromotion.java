package com.tiny.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 限时购表
 * </p>
 *
 * @author roy
 * @since 2021-10-24
 */
@Getter
@Setter
@TableName("sms_flash_promotion")
@ApiModel(value = "SmsFlashPromotion对象", description = "限时购表")
public class SmsFlashPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("活动名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("开始日期")
    @TableField("start_date")
    private LocalDate startDate;

    @ApiModelProperty("结束日期")
    @TableField("end_date")
    private LocalDate endDate;

    @ApiModelProperty("上下线状态,1上线、0下线")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("秒杀时间段名称")
    @TableField("create_time")
    private LocalDateTime createTime;


}

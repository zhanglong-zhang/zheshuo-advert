package com.zheshuo.advert.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zheshuo.advert.core.easyexcel.ExcelModel;

import lombok.Data;
/**
 * 自定义demo表(AccountInfo)
 * @author ZhangLong
 * @since 2019-12-12 10:03:22
 */
@Data
@TableName("account_info.toLowerCase()")
public class AccountInfo implements ExcelModel {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    
    private String userName;
    
    private Integer accountTotal;
    
    private Object accountStatus;
    
}
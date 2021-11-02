package com.xuan.nm01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuanran
 * @since 2021-11-02
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class UserAddress implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Long userId;

    private String address;

    private String remark;

    private Integer isdefault;

      @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateTime;


}

package com.xuan.nm01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Order0Detail implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Integer order0Id;

    private Integer productId;

    private Integer quantity;

    private Integer cost;


}

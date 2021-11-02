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
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;

    private String description;

    private Long price;

    private Long stock;

    private Integer categoryleveloneId;

    private Integer categoryleveltwoId;

    private Integer categorylevelthreeId;

    private String fileName;


}

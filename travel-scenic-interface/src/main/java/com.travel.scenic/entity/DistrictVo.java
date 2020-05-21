package com.travel.scenic.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DistrictVo implements Serializable {

    private Integer id;
    private String name;
    private List<DistrictVo> districtVoList;
}

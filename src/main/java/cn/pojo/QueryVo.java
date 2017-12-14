package cn.pojo;

import lombok.Data;

/**
 * Created by cuibinbin on 2017/12/14.
 */
@Data
public class QueryVo {
    private String custName;
    private String custSource;
    private String custIndustry;
    private String custLevel;
    private int size = 5;
    private int page = 1;
    private int start = 0;


}

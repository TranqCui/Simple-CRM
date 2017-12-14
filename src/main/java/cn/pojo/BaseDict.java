package cn.pojo;

import lombok.Data;

/**
 * Created by cuibinbin on 2017/12/14.
 */
@Data
public class BaseDict {
    private String dict_id;
    private String dict_type_code;
    private String dict_type_name;
    private String dict_item_name;
    private String dict_item_code;
    private Integer dict_sort;
    private String dict_enable;
    private String dict_memo;
}

package cn.csu.ykf.inkin.common.model.po;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("user")
public class User {

    private int id;
    private String name;
    private String password;

}

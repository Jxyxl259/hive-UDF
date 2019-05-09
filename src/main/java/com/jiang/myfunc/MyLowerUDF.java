package com.jiang.myfunc;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * @description: 自定义转换小写函数
 * @author:
 * @create: 2019-05-09 16:23
 */
public class MyLowerUDF extends UDF {

    public Text evaluate(Text str){
        if(null == str.toString()){
            return null;
        }
        return new Text(str.toString().toLowerCase());
    }




}

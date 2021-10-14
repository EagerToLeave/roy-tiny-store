package com.tiny.store.generator;


import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.Table;
import cn.org.atool.generator.annotation.Tables;

/**
 * fluent-mtbatis代码生成器
 * @author EDZ
 */
public class FluentGenerator {
    static final String URL = "jdbc:mysql://localhost:3306/roy-mall?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8";

    public static void main(String[] args) {

        FileGenerator.build(Empty.class);
    }

    @Tables(
        /** 数据库连接信息 **/
        url = URL, username = "root", password = "root",
        /** Entity类parent package路径 **/
        basePack = "com.tiny.store.fluent",
        /** Entity代码源目录 **/
        srcDir = "tiny-store-infrastructure/src/main/java",
        /** Dao代码源目录 **/
        daoDir = "tiny-store-infrastructure/src/main/java",
        /** 如果表定义记录创建，记录修改，逻辑删除字段 **/
        gmtCreated = "gmt_create", gmtModified = "gmt_modified", logicDeleted = "is_deleted",
        /** 需要生成文件的表 **/
        tables = @Table(value = {"ums_member"})
    )
    static class Empty {
    }
}

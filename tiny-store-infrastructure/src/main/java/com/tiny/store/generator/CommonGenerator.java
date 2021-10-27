package com.tiny.store.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;

/** @author roy */
public class CommonGenerator {
  public static void main(String[] args) {

    FastAutoGenerator.create("jdbc:mysql://localhost:3306/tiny-store", "root", "root")
        .globalConfig(
            builder -> {
              builder
                  .author("roy") // 作者
                  .outputDir(
                      "/Users/roy/workspace/programs/roy-tiny-store/tiny-store-infrastructure/src/main/java") // 输出路径(写到java目录)
                  .enableSwagger() // 开启swagger
                  .commentDate("yyyy-MM-dd")
                  .fileOverride(); // 开启覆盖之前生成的文件
            })
        .packageConfig(
            builder -> {
              builder
                  .parent("com.tiny")
                  .moduleName("store")
                  .entity("entity")
                  .service("service")
                  .serviceImpl("serviceImpl")
                  .controller("controller")
                  .mapper("mapper")
                  .xml("mapper")
                  .pathInfo(
                      Collections.singletonMap(
                          OutputFile.mapperXml,
                          "/Users/roy/workspace/programs/roy-tiny-store/tiny-store-infrastructure/src/main/resources/mapper"));
            })
        .strategyConfig(
            builder -> {
              builder
                  //                  .addTablePrefix("ums_")
                  .serviceBuilder()
                  .formatServiceFileName("%sService")
                  .formatServiceImplFileName("%sServiceImpl")
                  .entityBuilder()
                  .enableLombok()
                  .logicDeleteColumnName("deleted")
                  .enableTableFieldAnnotation()
                  .controllerBuilder()
                  .formatFileName("%sController")
                  .enableRestStyle()
                  .mapperBuilder()
                  .superClass(BaseMapper.class)
                  .formatMapperFileName("%sMapper")
                  .enableMapperAnnotation()
                  .formatXmlFileName("%sMapper");
            })
        // 使用Freemarker引擎模板，默认的是Velocity引擎模板
        .templateEngine(new FreemarkerTemplateEngine())
        .execute();
  }
}

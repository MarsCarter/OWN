package com.own.generate;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

import java.sql.SQLException;

/**
 * @author mars
 */
public class CodeGenerator {

    /**
     * 执行 run
     */
    public static void main(String[] args) throws SQLException {
        String path = System.getProperty("user.dir")+"/own-single/own-single-generate/src/main/java";
        String url = "jdbc:mysql://127.0.0.1:3306/own?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false";
        String username = "root";
        String password = "123456";

        FastAutoGenerator.create(url, username, password)
                //  全局配置
                .globalConfig(builder -> {
                    builder.outputDir(path)                     // 输出目录
                            .author("Mars")                     // 设置作者
                            .fileOverride()                     // 覆盖已生成的文件
                            .disableOpenDir()                   // 禁止打开输出目录
                            .dateType(DateType.ONLY_DATE)       // 时间策略
                            .commentDate("yyyy-MM-dd")   // 注释日期
                            .build();
                })
                //  包配置
                .packageConfig(builder -> {
                    builder.parent("com.own.generate")      // 设置父包名
                            .entity("model")                // 包名 Entity
                            .controller("controller")       // 包名 Controller
                            .service("service")             // 包名 Service
                            .serviceImpl("service.impl")    // 包名 service.impl
                            .mapper("mapper")               // 包名 mapper
                            .xml("mapper.xml")              // 包名 mapper.xml
                            .build();
                })
                //  模板配置
                .templateConfig(builder -> {
                    builder.disable(TemplateType.ENTITY)
                            .entity("/templates/entity.java")
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .xml("/templates/mapper.xml")
                            .controller("/templates/controller.java")
                            .build();
                })
                // 策略配置
                .strategyConfig(builder -> {
                    builder.addInclude("customer")
                            .entityBuilder()        // Model 类配置
                            .controllerBuilder()    // Controller 类配置
                            .enableRestStyle()      // 开启 @RestController 控制器
                            .serviceBuilder()                   // Service 类配置
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImp")
                            .mapperBuilder()            // Mapper  类配置
                            .enableMapperAnnotation()   // 开启 @Mapper 注解
                            .enableBaseResultMap()      // 启用 BaseResultMap 生成
                            .enableBaseColumnList()     // 启用 BaseColumnList
                            .build();
                })
                // 执行
                .execute();
    }

}

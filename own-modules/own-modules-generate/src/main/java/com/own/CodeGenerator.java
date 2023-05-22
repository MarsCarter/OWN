package com.own;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

public class CodeGenerator {

    public static void main(String[] args) {
        //1、获取代码生成器对象
        AutoGenerator mpg = new AutoGenerator();

        //2、全局配置
        GlobalConfig gc = new GlobalConfig();
        //获取用户目录
        String projectPath = System.getProperty("user.dir");
        //代码生成路径
        gc.setOutputDir(projectPath + "/own-modules/own-modules-generate/src/main/java");
        //作者信息
        gc.setAuthor("mars");
        gc.setOpen(false);
        //生成ID类型
        gc.setIdType(IdType.AUTO);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setFileOverride(true);
        //去掉Service前缀
        gc.setServiceImplName("%sService");
        mpg.setGlobalConfig(gc);

        //3、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.0.211:3306/own?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //4、包配置
        PackageConfig pc = new PackageConfig();

        //设置模块名 com.own.project //没有第0步时此代码必写
        pc.setModuleName("project");

        //5、设置工程名
        pc.setParent("com.own");
        //设置包名
        pc.setEntity("model");
        pc.setMapper("repository");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);


        //6、策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库表名优先映射,配置
        strategy.setInclude("customer");
        //下划线转驼峰命名的策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库命名规则
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //自动生成lombok注解
        strategy.setEntityLombokModel(true);
        //自动添加控制结构
        strategy.setRestControllerStyle(true);
        //自动添加逻辑删除策略
        strategy.setLogicDeleteFieldName("deleted");

        //7、设置自动填充策略
        TableFill gmtCreatereate = new TableFill("gmt_create", FieldFill.INSERT);
        //设置自动更新时间策略
        TableFill gmtModifiedodified = new TableFill("gmt_modified", FieldFill.UPDATE);
        //获取自动填充对象
        ArrayList<TableFill> tableFills = new ArrayList<>();
        //添加填充策略
        tableFills.add(gmtCreatereate);
        tableFills.add(gmtModifiedodified);
        strategy.setTableFillList(tableFills);

        //8、设置乐观锁策略
        strategy.setVersionFieldName("version");
        //设置Restful风格
        strategy.setRestControllerStyle(true);
        //设置连接请求 http://localhost:8080/hello_id_2
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}


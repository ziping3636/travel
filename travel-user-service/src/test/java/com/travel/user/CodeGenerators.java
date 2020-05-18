package com.travel.user;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

public class CodeGenerators {

    public static void main(String[] args) {
        // 创建代码生成器对象
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 设置输出路径
        gc.setOutputDir(System.getProperty("user.dir") + "/travel-user-service/src/main/java/");
        gc.setAuthor("wangziping");

        // 设置返回的结果集
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);

        gc.setOpen(false);

        //设置代码生成器项目
        mpg.setGlobalConfig(gc);


        // 数据源的配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/travel?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC");
        dsc.setUsername("root");
        dsc.setPassword("123");

        // 设置代码生成器对象的数据源
        mpg.setDataSource(dsc);

        // 设置生成器到哪里  包
        PackageConfig pc = new PackageConfig();
        // 设置包名
//      pc.setParent("com.wangziping.bootplus2");
        pc.setParent(CodeGenerators.class.getPackage().getName());

        // 设置包的路径
        mpg.setPackageInfo(pc);

        // 生成策略
        StrategyConfig strategy = new StrategyConfig();
        // 生成表
        strategy.setInclude("t_user");
        // 排除表
//      strategy.setExclude();

        strategy.setTablePrefix("t_");
        //strategy.setFieldPrefix();

        strategy.setEntityLombokModel(true);

        // 设置生成策略
        mpg.setStrategy(strategy);

        // 执行生成
        mpg.execute();
    }
}

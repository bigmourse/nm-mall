package com.xuan.nm01;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final String URL="jdbc:mysql://localhost:3306/nm?useSSL=false&useUnicode=true&characterEncoding=UTF-8";
    public static void main(String[] args) {

        AutoGenerator autoGenerator=new AutoGenerator();

//数据源
        DataSourceConfig dataSourceConfig=new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl(URL);
        dataSourceConfig.setUsername("localuser");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        autoGenerator.setDataSource(dataSourceConfig);
//全局配置
        GlobalConfig globalConfig=new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");//生成的类放到哪里：工程的绝对路径+项目路径
        globalConfig.setOpen(false);//是否自动打开文件夹
        globalConfig.setAuthor("xuanran");
        globalConfig.setServiceName("%Service");//去掉实现类的I
        autoGenerator.setGlobalConfig(globalConfig);
//包信息
        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setParent("com.xuan.nm01");
//        packageConfig.setModuleName("generator");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);
//配置策略
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);
        //驼峰式命名法
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        //自动填充：利用mybatis plus的fill属性（start）
        List<TableFill> list=new ArrayList<>();
        TableFill tableFill1=new TableFill("create_time", FieldFill.INSERT);
        TableFill tableFill2=new TableFill("update_time", FieldFill.INSERT_UPDATE);
        list.add(tableFill1);
        list.add(tableFill2);
        strategyConfig.setTableFillList(list);
        //自动填充：利用mybatis plus的fill属性（end）
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}

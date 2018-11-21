package com.ssm.mapper;

import com.ssm.common.annotation.MybatisDao;
import com.ssm.model.Country;
import tk.mybatis.mapper.common.Mapper;
@MybatisDao
public interface CountryMapper extends Mapper<Country> {
}
package com.leon.generator.mapper;

import com.leon.generator.domain.AcidReport;

public interface AcidReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AcidReport row);

    int insertSelective(AcidReport row);

    AcidReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcidReport row);

    int updateByPrimaryKey(AcidReport row);
}
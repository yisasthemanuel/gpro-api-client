package org.jlobato.gpro.proxy.config;

import org.jlobato.gpro.proxy.model.AgeDriRange;
import org.jlobato.gpro.proxy.model.AgeTDRange;
import org.jlobato.gpro.proxy.model.ExpRange;
import org.jlobato.gpro.proxy.model.Groups;
import org.jlobato.gpro.proxy.model.LangOptions;
import org.jlobato.gpro.proxy.model.MinSalRange;
import org.jlobato.gpro.proxy.model.OffRange;
import org.jlobato.gpro.proxy.model.OldGroups;
import org.jlobato.gpro.proxy.model.SkillRange;
import org.jlobato.gpro.proxy.model.SortDriver;
import org.jlobato.gpro.proxy.model.SortTD;
import org.jlobato.gpro.proxy.model.Table;
import org.jlobato.gpro.proxy.model.WeiRange;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration(value = "org.jlobato.gpro.proxy.config.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.ageDriRangeConverter")
    Converter<String, AgeDriRange> ageDriRangeConverter() {
        return new Converter<String, AgeDriRange>() {
            @Override
            public AgeDriRange convert(String source) {
                return AgeDriRange.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.ageTDRangeConverter")
    Converter<String, AgeTDRange> ageTDRangeConverter() {
        return new Converter<String, AgeTDRange>() {
            @Override
            public AgeTDRange convert(String source) {
                return AgeTDRange.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.expRangeConverter")
    Converter<String, ExpRange> expRangeConverter() {
        return new Converter<String, ExpRange>() {
            @Override
            public ExpRange convert(String source) {
                return ExpRange.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.groupsConverter")
    Converter<String, Groups> groupsConverter() {
        return new Converter<String, Groups>() {
            @Override
            public Groups convert(String source) {
                return Groups.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.langOptionsConverter")
    Converter<String, LangOptions> langOptionsConverter() {
        return new Converter<String, LangOptions>() {
            @Override
            public LangOptions convert(String source) {
                return LangOptions.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.minSalRangeConverter")
    Converter<String, MinSalRange> minSalRangeConverter() {
        return new Converter<String, MinSalRange>() {
            @Override
            public MinSalRange convert(String source) {
                return MinSalRange.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.offRangeConverter")
    Converter<String, OffRange> offRangeConverter() {
        return new Converter<String, OffRange>() {
            @Override
            public OffRange convert(String source) {
                return OffRange.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.oldGroupsConverter")
    Converter<String, OldGroups> oldGroupsConverter() {
        return new Converter<String, OldGroups>() {
            @Override
            public OldGroups convert(String source) {
                return OldGroups.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.skillRangeConverter")
    Converter<String, SkillRange> skillRangeConverter() {
        return new Converter<String, SkillRange>() {
            @Override
            public SkillRange convert(String source) {
                return SkillRange.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.sortDriverConverter")
    Converter<String, SortDriver> sortDriverConverter() {
        return new Converter<String, SortDriver>() {
            @Override
            public SortDriver convert(String source) {
                return SortDriver.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.sortTDConverter")
    Converter<String, SortTD> sortTDConverter() {
        return new Converter<String, SortTD>() {
            @Override
            public SortTD convert(String source) {
                return SortTD.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.tableConverter")
    Converter<String, Table> tableConverter() {
        return new Converter<String, Table>() {
            @Override
            public Table convert(String source) {
                return Table.fromValue(source);
            }
        };
    }
    @Bean(name = "org.jlobato.gpro.proxy.config.EnumConverterConfiguration.weiRangeConverter")
    Converter<String, WeiRange> weiRangeConverter() {
        return new Converter<String, WeiRange>() {
            @Override
            public WeiRange convert(String source) {
                return WeiRange.fromValue(source);
            }
        };
    }

}

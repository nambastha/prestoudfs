package com.custom.udfs;

import io.airlift.slice.Slice;
import io.airlift.slice.Slices;
import io.prestosql.spi.function.Description;
import io.prestosql.spi.function.ScalarFunction;
import io.prestosql.spi.function.SqlNullable;
import io.prestosql.spi.function.SqlType;
import io.prestosql.spi.type.StandardTypes;


public class StringFunction {

    @ScalarFunction("reverse")
    @Description("reversed value")
    @SqlType(StandardTypes.VARCHAR)
    public static Slice mask(@SqlNullable @SqlType(StandardTypes.VARCHAR) Slice str) {
    /*  if (str.length() > 0) {
            return str;
        }

        return str;
    }*/
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1 = input1.reverse();
        return Slices.utf8Slice(input1.toString());
    }


}

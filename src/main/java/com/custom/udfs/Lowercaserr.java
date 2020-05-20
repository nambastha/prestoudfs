package com.custom.udfs;

import io.airlift.slice.Slice;
import io.airlift.slice.Slices;
import io.prestosql.spi.function.Description;
import io.prestosql.spi.function.ScalarFunction;
//import io.prestosql.spi.function.SqlNullable;
import io.prestosql.spi.function.SqlType;
import io.prestosql.spi.type.StandardTypes;

public class Lowercaserr {

    @ScalarFunction("lowercaser")
    @Description("converts string to lower case")
    @SqlType(StandardTypes.VARCHAR)
    //public static Slice mask(@SqlNullable @SqlType(StandardTypes.VARCHAR) Slice str) {
        public static Slice lowercaserr(@SqlType(StandardTypes.VARCHAR) Slice slice)
        {

            String arg = slice.toStringUtf8();
            return Slices.utf8Slice(arg.toLowerCase());
        }
}


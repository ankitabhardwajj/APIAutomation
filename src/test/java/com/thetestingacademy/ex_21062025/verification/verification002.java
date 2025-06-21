package com.thetestingacademy.ex_21062025.verification;

import org.testng.annotations.Test;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class verification002 {
    @Test
    public void test_verify_assertj(){
        String s = "ankita";
        assertThat(s).isEqualTo("ankita").isNotEmpty().isNotNull();

        List<String> names = Arrays.asList("john", "jane", "doe");
        assertThat(names).hasSize(3).isNotNull();

        LocalDate date = LocalDate.now();
        System.out.println(date);

        assertThat(date)
                .isAfterOrEqualTo(LocalDate.of(2021, 1, 13))
                .isBeforeOrEqualTo(LocalDate.of(2024, 12, 13))
                .isBetween(
                        LocalDate.of(2023, 1, 1),
                        LocalDate.of(2023, 12, 31)
                );


        File file = new File("Testdata.json");
        assertThat(file).exists().isFile().canRead();

        Map<String, Integer> ages = new HashMap<>();
        ages.put("ankita", 20);
        ages.put("tillu", 30);

        assertThat(ages).hasSize(3).containsEntry("priya", 25).doesNotContainValue(40);








    }
}

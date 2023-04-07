package com.zrober.school.dto;

import com.zrober.school.entity.Setmeal;
import com.zrober.school.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

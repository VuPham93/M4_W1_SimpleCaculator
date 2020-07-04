package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam double firstOperator, double secondOperator, String operator) {
        ModelAndView modelAndView = new ModelAndView("index");

        String result = "";

        switch (operator) {
            case "Addition(+)":
                result = String.valueOf(firstOperator + secondOperator);
                break;
            case "Subtraction(-)":
                result = String.valueOf(firstOperator - secondOperator);
                break;
            case "Multiplication(x)":
                result = String.valueOf(firstOperator * secondOperator);
                break;
            case "Division(/)":
                if (secondOperator == 0) {
                    result = "Can't divide by 0";
                } else
                    result = String.valueOf(firstOperator/secondOperator);
                break;
        }

        modelAndView.addObject("operator", operator);
        modelAndView.addObject("result", result);

        return modelAndView;
    }
}

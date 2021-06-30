package com.projects.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@PostMapping("welcome")
	@ResponseBody
	public String welcome(@RequestParam(required = false, name = "param") String[] paramArray) {
		String mensaje = "";
		int i = 0;

		if (paramArray == null) {
			mensaje = "El array esta vacio";
		} else {
			for (String paramArrayItem : paramArray) {
				mensaje += "param[" + i + "]" + paramArrayItem + "\n";
			}
		}
		return mensaje;

	}
}

package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/course")
@Api(description="课程相关接口")
public class CourseController {
	@Autowired
	private ICourseService courseServie;
	@GetMapping("findALLCourse")
	List<Course> findAllCourse(){
		try {
			List<Course> list=new ArrayList<>();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}

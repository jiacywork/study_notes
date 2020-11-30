package com.jiacy.app.设计模式.行为型.迭代器模式;

public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}

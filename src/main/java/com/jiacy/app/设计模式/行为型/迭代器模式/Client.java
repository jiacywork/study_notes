package com.jiacy.app.设计模式.行为型.迭代器模式;

public class Client {

    public static void main(String[] args) {
        Course course1 = new Course("设计模式");
        Course course2 = new Course("数据结构");
        Course course3 = new Course("JVM");
        Course course4 = new Course("高并发");
        Course course5 = new Course("分布式事务");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);

        System.out.println("-----列表-----");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("-----删除之后的列表-----");
        printCourses(courseAggregate);
    }


    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator= courseAggregate.getCourseIterator();
        while(!courseIterator.isLastCourse()){
            Course course=courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }


}

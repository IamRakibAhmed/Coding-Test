select teachers.name as "Teachers Name", courses.name as "Courses Name" from courses
inner join teachers on teachers.id = courses.teacher_id;

with teacher_highest_course as (
    select teachers.name, rank()
    over(order by count(courses.id) desc) as teacher_rank from teachers
    left join courses on teachers.id = courses.teacher_id
    group by teachers.id, teachers.name
)
select name as "Teachers Name" from teacher_highest_course
where teacher_rank = 1;

select name as "Teachers Name" from teachers where teachers.id not in(select teacher_id from courses);

SELECT 
    s.student_id,
    s.student_name,
    su.subject_name,
   count(e.student_id) AS attended_exams
FROM Students s
CROSS JOIN Subjects su
LEFT JOIN Examinations e
ON s.Student_id = e.Student_id
AND su.Subject_name = e.Subject_name
Group by
s.student_name,
s.student_id,
su.subject_name
order by 
s.student_id,
su.subject_name;



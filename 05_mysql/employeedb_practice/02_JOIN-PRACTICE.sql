-- JOIN을 이용하여 여러 테이블을 조회 시에는 모든 컬럼에 테이블 별칭을 사용하는 것이 좋다.
select * from employee;
select * from location;
select * from nation;
select * from job;
select * from sal_grade;
select * from department;
-- 1. 직급이 대리이면서 아시아 지역에 근무하는 직원의 사번, 이름, 직급명, 부서명, 지역명, 급여를 조회하세요
select 
    a.EMP_ID AS '사번',
    a.EMP_NAME AS '이름',
    b.JOB_NAME AS '직급명',
    c.DEPT_TITLE AS '부서명',
    d.LOCAL_NAME AS '지역명',
    a.SALARY AS '급여'
FROM 
    employee a
LEFT JOIN job b ON a.JOB_CODE = b.JOB_CODE
LEFT JOIN department c ON a.DEPT_code = c.DEPT_ID
LEFT JOIN location d ON c.LOCATION_ID = d.LOCAL_CODE
WHERE d.LOCAL_NAME like 'ASIA%' AND b.JOB_NAME like '%대리%';
-- 2. 주민번호가 70년대 생이면서 성별이 여자이고, 성이 전씨인 직원의 이름, 주민등록번호, 부서명, 직급명을 조회하세요.
select
	a.EMP_NAME as '이름'
    ,a.EMP_NO as '주민등록번호'
    ,b.DEPT_TITLE as '부서명'
    ,c.JOB_name as '직급명'
from
	employee a
LEFT JOIN department b ON a.DEPT_CODE = b.DEPT_ID
LEFT JOIN job c ON a.JOB_CODE = c.JOB_CODE
where a.EMP_NAME like'전%' AND a.EMP_NO like '7%' AND a.EMP_NO like '_______2%'
    
-- 3. 이름에 '형'자가 들어가는 직원의 사번, 이름, 직급명을 조회하세요.
select EMP_CODE a
	,EMP_NAME
-- 4. 해외영업팀에 근무하는 직원의 이름, 직급명, 부서코드, 부서명을 조회하세요.

-- 5. 보너스포인트를 받는 직원의 이름, 보너스, 부서명, 지역명을 조회하세요.

-- 6. 부서코드가 D2인 직원의 이름, 직급명, 부서명, 지역명을 조회하세오.

-- 7. 한국(KO)과 일본(JP)에 근무하는 직원의 이름, 부서명, 지역명, 국가명을 조회하세요.
/*

    날짜시간 함수
    
    sysdate
    - 시스템의 시각을 반환
    - date sysdate


*/

select sysdate from dual;

/*

    날짜 연산
    1. 시각 - 시각 = 시간
    2. 시각 + 시간 = 시각
    3. 시각 - 시간 = 시각

*/


-- 1. 시각 - 시각 = 시간(일)
-- 현재 - 입사일 = 근무시간
select
    name, to_char(ibsadate, 'yyyy-mm-dd') as 입사일,
    round(sysdate - ibsadate) as 근무일수,
    round((sysdate - ibsadate) * 24) as 근무시수,
    round((sysdate - ibsadate) * 24 * 60) as 근무분수,
    round((sysdate - ibsadate) * 24 * 60 * 60) as 근무초수,
    round((sysdate - ibsadate) / 30.4) as 근무개월수, --사용금지
    round((sysdate - ibsadate) / 365) as 근무년수 --사용금지
from tblInsa;


select
    title, adddate, completedate,
    round((completedate - adddate) * 24) as "실행하기까지 걸린 시간"
from tblTodo
    --order by 4 asc;
    --order by "실행하기까지 걸린 시간" asc;
    order by round((completedate - adddate) * 24) asc;




-- 2. 시각 + 시간(일) = 시각
-- 3. 시각 - 시간(일) = 시각
select
    sysdate,
    sysdate + 100 as "100일 후",
    sysdate - 100 as "100일 전",
    to_char(sysdate + (3 / 24), 'hh24:mi:ss') as "3시간 뒤",
    to_char(sysdate - (30 / 60 / 24), 'hh24:mi:ss') as "30분 전"
from dual;


/*

    날짜 연산(월, 년)
    - 시각 - 시각 = 시간(월)
    - number months_between(date, date)

*/

select 
    name,
    round(sysdate - ibsadate) as 근무일수,
    round(months_between(sysdate, ibsadate)) as 근무개월수,
    round(months_between(sysdate, ibsadate) / 12) as 근무년수
from tblInsa;



/*

    add_months()
    시각 + 시간(일) = 시각
    시각 - 시간(일) = 시각

*/

select
    sysdate,
    sysdate + 3,
    add_months(sysdate, 3),
    add_months(sysdate, -2),
    add_months(sysdate, 3 * 12)
from dual;

/*

    시각 - 시각 = 시간
    1. 일, 시, 분, 초 > 연산자(-)
    2. 월, 년 > months_between()
    
    시각 + 시간, 시각 - 시간 = 시각
    1. 일, 시, 분, 초 > 연산자(+)
    2. 월, 년 > add_months()

*/

-- null 함수 > null value
-- 1. nvl > 값이 있으면 그 값을 사용하고, 없으면 대체값을 사용한다.
-- 2. nvl2 > 값이 있으면 첫 번째 값을 사용하고, 없으면 두 번째 값을 사용한다.
select
    name, population,
    case
        when population is not null then population
        when population is null then 0
    end,
    nvl(population, 0),
    nvl2(population, 1, 2)
from tblCountry;


































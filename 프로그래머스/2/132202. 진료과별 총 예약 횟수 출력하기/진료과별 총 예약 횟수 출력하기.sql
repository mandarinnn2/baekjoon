-- 코드를 입력하세요
SELECT MCDP_CD 진료과코드, COUNT(MCDP_CD) AS "5월예약건수"
FROM APPOINTMENT
WHERE APNT_YMD > TO_DATE('2022-05', 'YYYY-MM') AND APNT_YMD < TO_DATE('2022-06', 'YYYY-MM')
GROUP BY MCDP_CD
ORDER BY COUNT(MCDP_CD), MCDP_CD
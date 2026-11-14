# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-03ae6ff9-d151-4024-b03a-a7af07c3654a` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-24bc1029-8b55-44ab-a969-bfcd1896f38f` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-15ae1996-3692-40fb-a97d-4ccdf8c692e7` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 17 | `qa-c40cf8c0-db7b-47bc-9a7c-09647c011b17` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-5d2217dd-7dbc-4441-96da-97af2ce17fe0` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-94c15ac5-8bbf-4909-93a3-210d774205a5` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-0d771b15-6c5c-4aff-8e82-d0706d9f5a06` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-86b55026-a458-4b0f-9247-bdcc60b96652` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-15ba433d-e0e8-49ba-95bc-d6a9a686143e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-81ea0e6b-d698-4c8e-a147-434be3278d73` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-ba6474c5-c81d-4abf-9f70-9feaa7683791` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-03ae6ff9-d151-4024-b03a-a7af07c3654a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ae6ff9-d151-4024-b03a-a7af07c3654a
Content-Type: application/json

--- request body ---
{"handle":"qa-65abb9b49d08","displayName":"QA 65abb9b49d08","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-03ae6ff9-d151-4024-b03a-a7af07c3654a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-65abb9b49d08
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27c58333-cc32-4fc1-b71d-21a3d8d15765","handle":"qa-65abb9b49d08","displayName":"QA 65abb9b49d08","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.953528496Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-24bc1029-8b55-44ab-a969-bfcd1896f38f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24bc1029-8b55-44ab-a969-bfcd1896f38f
Content-Type: application/json

--- request body ---
{"handle":"qa-d6e0248e5450","displayName":"QA d6e0248e5450","password":"****","region":"us"}

--- response: 201 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-24bc1029-8b55-44ab-a969-bfcd1896f38f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-d6e0248e5450
X-Served-Region: us
Content-Length: 181

{"id":"acc_2ecc7b53-68f9-4da2-ab77-0603b0004e2c","handle":"qa-d6e0248e5450","displayName":"QA d6e0248e5450","region":"us","role":"user","createdAt":"2026-11-13T09:42:07.984842911Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-15ae1996-3692-40fb-a97d-4ccdf8c692e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ae1996-3692-40fb-a97d-4ccdf8c692e7
Content-Type: application/json

--- request body ---
{"handle":"qa-65abb9b49d08","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-15ae1996-3692-40fb-a97d-4ccdf8c692e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27c58333-cc32-4fc1-b71d-21a3d8d15765"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-d6e0248e5450
correlation: qa-c40cf8c0-db7b-47bc-9a7c-09647c011b17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40cf8c0-db7b-47bc-9a7c-09647c011b17
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-c40cf8c0-db7b-47bc-9a7c-09647c011b17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-d6e0248e5450","displayName":"QA d6e0248e5450","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-d6e0248e5450
correlation: qa-5d2217dd-7dbc-4441-96da-97af2ce17fe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d2217dd-7dbc-4441-96da-97af2ce17fe0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d2217dd-7dbc-4441-96da-97af2ce17fe0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-d6e0248e5450","displayName":"QA d6e0248e5450","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-d6e0248e5450
correlation: qa-94c15ac5-8bbf-4909-93a3-210d774205a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c15ac5-8bbf-4909-93a3-210d774205a5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-94c15ac5-8bbf-4909-93a3-210d774205a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-d6e0248e5450","displayName":"QA d6e0248e5450","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-0d771b15-6c5c-4aff-8e82-d0706d9f5a06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d771b15-6c5c-4aff-8e82-d0706d9f5a06
Content-Type: application/json

--- request body ---
{"handle":"qa-d6e0248e5450","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d771b15-6c5c-4aff-8e82-d0706d9f5a06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ecc7b53-68f9-4da2-ab77-0603b0004e2c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-86b55026-a458-4b0f-9247-bdcc60b96652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b55026-a458-4b0f-9247-bdcc60b96652
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-86b55026-a458-4b0f-9247-bdcc60b96652
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-15ba433d-e0e8-49ba-95bc-d6a9a686143e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ba433d-e0e8-49ba-95bc-d6a9a686143e
Content-Type: application/json

--- request body ---
{"handle":"qa-d6e0248e5450","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15ba433d-e0e8-49ba-95bc-d6a9a686143e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15ba433d-e0e8-49ba-95bc-d6a9a686143e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81ea0e6b-d698-4c8e-a147-434be3278d73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ea0e6b-d698-4c8e-a147-434be3278d73
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81ea0e6b-d698-4c8e-a147-434be3278d73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-ba6474c5-c81d-4abf-9f70-9feaa7683791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba6474c5-c81d-4abf-9f70-9feaa7683791
Content-Type: application/json

--- request body ---
{"handle":"qa-65abb9b49d08","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba6474c5-c81d-4abf-9f70-9feaa7683791
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba6474c5-c81d-4abf-9f70-9feaa7683791"}
```

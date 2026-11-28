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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-9b25228e-58b0-4edd-a0c2-07c34bf5f8b8` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-7ef8deda-0bd9-421e-bd5c-c57c790e265c` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-74c67601-624d-420f-804f-b076e75b46c4` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-688a8126-6322-4728-915e-28be31ceaf95` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-cc421de9-d6f1-426b-963a-9c13d485f98e` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-8fd7ad35-d39c-4ca7-852d-0e2e71009e3b` |
| 7 | `POST /v1/auth/token` | 200 | 11 | `qa-db97a68c-436d-436b-810e-ecaf133d1b9b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-fce54189-10c1-40cd-8863-12cbb65d3988` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-46f60843-a45e-4853-a7e4-199bfb319977` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0247d7aa-c618-4195-b13f-0321a6ce0f95` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-9359ec1b-08db-47bb-a8c0-e2a4fde2cc9a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b25228e-58b0-4edd-a0c2-07c34bf5f8b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b25228e-58b0-4edd-a0c2-07c34bf5f8b8
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc13f07ad1d","displayName":"QA 9bc13f07ad1d","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b25228e-58b0-4edd-a0c2-07c34bf5f8b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-9bc13f07ad1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_612d8174-7575-4e1a-a3c1-2ba168281d2f","handle":"qa-9bc13f07ad1d","displayName":"QA 9bc13f07ad1d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.899538813Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7ef8deda-0bd9-421e-bd5c-c57c790e265c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ef8deda-0bd9-421e-bd5c-c57c790e265c
Content-Type: application/json

--- request body ---
{"handle":"qa-e0f8f87ba53d","displayName":"QA e0f8f87ba53d","password":"****","region":"us"}

--- response: 201 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ef8deda-0bd9-421e-bd5c-c57c790e265c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-e0f8f87ba53d
X-Served-Region: us
Content-Length: 181

{"id":"acc_50f48017-7315-4ac6-bb8f-33099a82ff6e","handle":"qa-e0f8f87ba53d","displayName":"QA e0f8f87ba53d","region":"us","role":"user","createdAt":"2026-11-27T10:59:46.915518771Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-74c67601-624d-420f-804f-b076e75b46c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74c67601-624d-420f-804f-b076e75b46c4
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc13f07ad1d","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-74c67601-624d-420f-804f-b076e75b46c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_612d8174-7575-4e1a-a3c1-2ba168281d2f"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-e0f8f87ba53d
correlation: qa-688a8126-6322-4728-915e-28be31ceaf95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-688a8126-6322-4728-915e-28be31ceaf95
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-688a8126-6322-4728-915e-28be31ceaf95
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

{"handle":"qa-e0f8f87ba53d","displayName":"QA e0f8f87ba53d","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-e0f8f87ba53d
correlation: qa-cc421de9-d6f1-426b-963a-9c13d485f98e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc421de9-d6f1-426b-963a-9c13d485f98e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc421de9-d6f1-426b-963a-9c13d485f98e
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

{"handle":"qa-e0f8f87ba53d","displayName":"QA e0f8f87ba53d","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-e0f8f87ba53d
correlation: qa-8fd7ad35-d39c-4ca7-852d-0e2e71009e3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fd7ad35-d39c-4ca7-852d-0e2e71009e3b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fd7ad35-d39c-4ca7-852d-0e2e71009e3b
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

{"handle":"qa-e0f8f87ba53d","displayName":"QA e0f8f87ba53d","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-db97a68c-436d-436b-810e-ecaf133d1b9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db97a68c-436d-436b-810e-ecaf133d1b9b
Content-Type: application/json

--- request body ---
{"handle":"qa-e0f8f87ba53d","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-db97a68c-436d-436b-810e-ecaf133d1b9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50f48017-7315-4ac6-bb8f-33099a82ff6e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fce54189-10c1-40cd-8863-12cbb65d3988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fce54189-10c1-40cd-8863-12cbb65d3988
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fce54189-10c1-40cd-8863-12cbb65d3988
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
correlation: qa-46f60843-a45e-4853-a7e4-199bfb319977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46f60843-a45e-4853-a7e4-199bfb319977
Content-Type: application/json

--- request body ---
{"handle":"qa-e0f8f87ba53d","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46f60843-a45e-4853-a7e4-199bfb319977
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46f60843-a45e-4853-a7e4-199bfb319977"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0247d7aa-c618-4195-b13f-0321a6ce0f95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0247d7aa-c618-4195-b13f-0321a6ce0f95
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0247d7aa-c618-4195-b13f-0321a6ce0f95
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
correlation: qa-9359ec1b-08db-47bb-a8c0-e2a4fde2cc9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9359ec1b-08db-47bb-a8c0-e2a4fde2cc9a
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc13f07ad1d","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9359ec1b-08db-47bb-a8c0-e2a4fde2cc9a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9359ec1b-08db-47bb-a8c0-e2a4fde2cc9a"}
```

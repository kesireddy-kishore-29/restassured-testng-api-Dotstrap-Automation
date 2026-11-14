# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-60570e43-e3ca-480f-8a53-13f3ecf34247` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-2569eed3-5960-4c9d-b291-abd6ffbbbfd3` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-8979399b-01b1-40e1-9b32-9b47fd9458d9` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-c98994be-d366-4ded-b5ea-4db4620327b5` |
| 5 | `POST /v1/auth/token` | 503 | 5 | `qa-4e201677-7ae3-4397-880a-748c93d8dfc1` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-8b77be0a-79b0-4a4f-8424-2c223ce29870` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-68190f7d-f4b9-4b2b-a55b-72b3d94211a8` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-34432602-bbb7-4771-9ebe-5130ff885087` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c10379a9-8acd-4615-89f2-85d988cf01ae` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-b4a8bb74-5d82-405e-a972-0c966feea4cb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-60570e43-e3ca-480f-8a53-13f3ecf34247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60570e43-e3ca-480f-8a53-13f3ecf34247
Content-Type: application/json

--- request body ---
{"handle":"qa-409c0000b793","displayName":"QA 409c0000b793","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-60570e43-e3ca-480f-8a53-13f3ecf34247
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-409c0000b793
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c52d370c-4999-4394-888d-112c59d0bf90","handle":"qa-409c0000b793","displayName":"QA 409c0000b793","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.059031334Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2569eed3-5960-4c9d-b291-abd6ffbbbfd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2569eed3-5960-4c9d-b291-abd6ffbbbfd3
Content-Type: application/json

--- request body ---
{"handle":"qa-b7f5895b189e","displayName":"QA b7f5895b189e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2569eed3-5960-4c9d-b291-abd6ffbbbfd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Location: /v1/accounts/qa-b7f5895b189e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f2d0067f-0e54-4b76-8b4e-593eed7e8c17","handle":"qa-b7f5895b189e","displayName":"QA b7f5895b189e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.111842211Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8979399b-01b1-40e1-9b32-9b47fd9458d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8979399b-01b1-40e1-9b32-9b47fd9458d9
Content-Type: application/json

--- request body ---
{"handle":"qa-409c0000b793","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8979399b-01b1-40e1-9b32-9b47fd9458d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c52d370c-4999-4394-888d-112c59d0bf90"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c98994be-d366-4ded-b5ea-4db4620327b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c98994be-d366-4ded-b5ea-4db4620327b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b7f5895b189e","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c98994be-d366-4ded-b5ea-4db4620327b5
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
Location: /v1/conversations/cnv_14139d4c-2d47-45ed-a18e-c70d2270ac75
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_14139d4c-2d47-45ed-a18e-c70d2270ac75","subject":"Error contract","status":"open","region":"eu","participants":["qa-409c0000b793","qa-b7f5895b189e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.168194877Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4e201677-7ae3-4397-880a-748c93d8dfc1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9b2d79a5-43bf-4078-99a8-8537b0ac2251
X-Correlation-Id: qa-4e201677-7ae3-4397-880a-748c93d8dfc1
Content-Type: application/json

--- request body ---
{"handle":"qa-409c0000b793","password":"****"}

--- response: 503 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e201677-7ae3-4397-880a-748c93d8dfc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-4e201677-7ae3-4397-880a-748c93d8dfc1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b77be0a-79b0-4a4f-8424-2c223ce29870

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b77be0a-79b0-4a4f-8424-2c223ce29870
Content-Type: application/json

--- request body ---
{"handle":"qa-b7f5895b189e","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b77be0a-79b0-4a4f-8424-2c223ce29870
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f2d0067f-0e54-4b76-8b4e-593eed7e8c17"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68190f7d-f4b9-4b2b-a55b-72b3d94211a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68190f7d-f4b9-4b2b-a55b-72b3d94211a8
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68190f7d-f4b9-4b2b-a55b-72b3d94211a8
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-34432602-bbb7-4771-9ebe-5130ff885087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34432602-bbb7-4771-9ebe-5130ff885087
Content-Type: application/json

--- request body ---
{"handle":"qa-b7f5895b189e","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34432602-bbb7-4771-9ebe-5130ff885087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34432602-bbb7-4771-9ebe-5130ff885087"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c10379a9-8acd-4615-89f2-85d988cf01ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c10379a9-8acd-4615-89f2-85d988cf01ae
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c10379a9-8acd-4615-89f2-85d988cf01ae
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b4a8bb74-5d82-405e-a972-0c966feea4cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4a8bb74-5d82-405e-a972-0c966feea4cb
Content-Type: application/json

--- request body ---
{"handle":"qa-409c0000b793","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4a8bb74-5d82-405e-a972-0c966feea4cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4a8bb74-5d82-405e-a972-0c966feea4cb"}
```

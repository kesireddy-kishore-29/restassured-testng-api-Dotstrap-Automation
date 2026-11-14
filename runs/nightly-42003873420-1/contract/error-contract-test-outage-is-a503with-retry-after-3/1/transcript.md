# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-699358f1-81e5-4d7c-9061-210f98105ea5` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-33b04056-1fee-4088-8a04-fe1dda94b6c5` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-5808bd7d-d91c-4dab-93aa-675b3c56318c` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-2426adba-7357-4819-b617-cdc047c0bab5` |
| 5 | `PATCH /v1/accounts/me` | 503 | 14 | `qa-35b17eeb-11e7-4a33-98cb-79bb07de0378` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-379839ec-6968-4605-8158-0d089dad8f94` |
| 7 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-61e30a40-ab5a-4a21-be67-db7b3a9178c0` |
| 8 | `POST /v1/auth/token` | 401 | 35 | `qa-49b1d666-96cc-454f-8c43-38c0b157e692` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-49ca9461-7096-4d21-a880-476c2dd2d0c3` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-5da60c20-2d09-41ee-8a63-7ca8a7a022e8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-699358f1-81e5-4d7c-9061-210f98105ea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-699358f1-81e5-4d7c-9061-210f98105ea5
Content-Type: application/json

--- request body ---
{"handle":"qa-ed2fce9e1164","displayName":"QA ed2fce9e1164","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-699358f1-81e5-4d7c-9061-210f98105ea5
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
Location: /v1/accounts/qa-ed2fce9e1164
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f36727ff-518d-41a3-b3ee-0f1b0296e3db","handle":"qa-ed2fce9e1164","displayName":"QA ed2fce9e1164","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.827573450Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33b04056-1fee-4088-8a04-fe1dda94b6c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33b04056-1fee-4088-8a04-fe1dda94b6c5
Content-Type: application/json

--- request body ---
{"handle":"qa-ce27922132e7","displayName":"QA ce27922132e7","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-33b04056-1fee-4088-8a04-fe1dda94b6c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-ce27922132e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce0963f0-09bb-4497-8d33-64745a8317aa","handle":"qa-ce27922132e7","displayName":"QA ce27922132e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.858081875Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5808bd7d-d91c-4dab-93aa-675b3c56318c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5808bd7d-d91c-4dab-93aa-675b3c56318c
Content-Type: application/json

--- request body ---
{"handle":"qa-ed2fce9e1164","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5808bd7d-d91c-4dab-93aa-675b3c56318c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f36727ff-518d-41a3-b3ee-0f1b0296e3db"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2426adba-7357-4819-b617-cdc047c0bab5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2426adba-7357-4819-b617-cdc047c0bab5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ce27922132e7","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2426adba-7357-4819-b617-cdc047c0bab5
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
Location: /v1/conversations/cnv_0666fe3a-088b-4d72-b5b8-f12b8fe97cf3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0666fe3a-088b-4d72-b5b8-f12b8fe97cf3","subject":"Error contract","status":"open","region":"eu","participants":["qa-ed2fce9e1164","qa-ce27922132e7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.977900863Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-35b17eeb-11e7-4a33-98cb-79bb07de0378

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f90fcf4d-22ef-478f-a7d6-093cfa1c1612
X-Correlation-Id: qa-35b17eeb-11e7-4a33-98cb-79bb07de0378
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35b17eeb-11e7-4a33-98cb-79bb07de0378
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-35b17eeb-11e7-4a33-98cb-79bb07de0378"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-379839ec-6968-4605-8158-0d089dad8f94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-379839ec-6968-4605-8158-0d089dad8f94
Content-Type: application/json

--- request body ---
{"handle":"qa-ce27922132e7","password":"****"}

--- response: 200 in 53 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-379839ec-6968-4605-8158-0d089dad8f94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0963f0-09bb-4497-8d33-64745a8317aa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61e30a40-ab5a-4a21-be67-db7b3a9178c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61e30a40-ab5a-4a21-be67-db7b3a9178c0
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61e30a40-ab5a-4a21-be67-db7b3a9178c0
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
correlation: qa-49b1d666-96cc-454f-8c43-38c0b157e692

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49b1d666-96cc-454f-8c43-38c0b157e692
Content-Type: application/json

--- request body ---
{"handle":"qa-ce27922132e7","password":"****"}

--- response: 401 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49b1d666-96cc-454f-8c43-38c0b157e692
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49b1d666-96cc-454f-8c43-38c0b157e692"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49ca9461-7096-4d21-a880-476c2dd2d0c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49ca9461-7096-4d21-a880-476c2dd2d0c3
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49ca9461-7096-4d21-a880-476c2dd2d0c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5da60c20-2d09-41ee-8a63-7ca8a7a022e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da60c20-2d09-41ee-8a63-7ca8a7a022e8
Content-Type: application/json

--- request body ---
{"handle":"qa-ed2fce9e1164","password":"****"}

--- response: 401 in 32 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5da60c20-2d09-41ee-8a63-7ca8a7a022e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5da60c20-2d09-41ee-8a63-7ca8a7a022e8"}
```

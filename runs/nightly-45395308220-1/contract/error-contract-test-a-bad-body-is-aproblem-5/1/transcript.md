# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-ae93eace-50e0-4671-8011-a090898469a2` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-f9affea5-133e-4a40-a446-92527631259c` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-0fe33f94-171b-42c5-a7f6-ac2b80fa08f6` |
| 4 | `POST /v1/conversations` | 201 | 57 | `qa-1b9cb21a-c87a-422d-a240-246e841e5915` |
| 5 | `POST /v1/accounts` | 422 | 35 | `qa-c8b14a5e-143c-4bf3-b013-c7c6ab11592a` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-fc6c37ae-26ce-4417-974d-6c5681b9cb09` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-9498478d-eb0d-43d2-bf3e-549f7cce3358` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-bf4d46f4-5140-4151-bdca-0be93813880a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-53f48833-abcf-4781-86a2-8894fb44decf` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-443fce91-a799-4db4-ac0c-b52f6f2654ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ae93eace-50e0-4671-8011-a090898469a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae93eace-50e0-4671-8011-a090898469a2
Content-Type: application/json

--- request body ---
{"handle":"qa-106b03c15051","displayName":"QA 106b03c15051","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae93eace-50e0-4671-8011-a090898469a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-106b03c15051
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a952c61c-8d42-48e0-8f68-accb4a4dfc37","handle":"qa-106b03c15051","displayName":"QA 106b03c15051","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.546379709Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f9affea5-133e-4a40-a446-92527631259c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9affea5-133e-4a40-a446-92527631259c
Content-Type: application/json

--- request body ---
{"handle":"qa-bbcd24de9cef","displayName":"QA bbcd24de9cef","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9affea5-133e-4a40-a446-92527631259c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-bbcd24de9cef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e5995fc3-c3f3-4c46-8b56-cda39738b8d8","handle":"qa-bbcd24de9cef","displayName":"QA bbcd24de9cef","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.604652189Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0fe33f94-171b-42c5-a7f6-ac2b80fa08f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fe33f94-171b-42c5-a7f6-ac2b80fa08f6
Content-Type: application/json

--- request body ---
{"handle":"qa-106b03c15051","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fe33f94-171b-42c5-a7f6-ac2b80fa08f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a952c61c-8d42-48e0-8f68-accb4a4dfc37"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1b9cb21a-c87a-422d-a240-246e841e5915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b9cb21a-c87a-422d-a240-246e841e5915
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bbcd24de9cef","subject":"Error contract","message":"Hi"}

--- response: 201 in 57 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b9cb21a-c87a-422d-a240-246e841e5915
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
Location: /v1/conversations/cnv_3de8de07-d1d9-41c4-84a6-f7d3ad721448
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3de8de07-d1d9-41c4-84a6-f7d3ad721448","subject":"Error contract","status":"open","region":"eu","participants":["qa-106b03c15051","qa-bbcd24de9cef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.729854308Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c8b14a5e-143c-4bf3-b013-c7c6ab11592a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b14a5e-143c-4bf3-b013-c7c6ab11592a
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8b14a5e-143c-4bf3-b013-c7c6ab11592a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-c8b14a5e-143c-4bf3-b013-c7c6ab11592a","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fc6c37ae-26ce-4417-974d-6c5681b9cb09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc6c37ae-26ce-4417-974d-6c5681b9cb09
Content-Type: application/json

--- request body ---
{"handle":"qa-bbcd24de9cef","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc6c37ae-26ce-4417-974d-6c5681b9cb09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5995fc3-c3f3-4c46-8b56-cda39738b8d8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9498478d-eb0d-43d2-bf3e-549f7cce3358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9498478d-eb0d-43d2-bf3e-549f7cce3358
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9498478d-eb0d-43d2-bf3e-549f7cce3358
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
correlation: qa-bf4d46f4-5140-4151-bdca-0be93813880a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf4d46f4-5140-4151-bdca-0be93813880a
Content-Type: application/json

--- request body ---
{"handle":"qa-bbcd24de9cef","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf4d46f4-5140-4151-bdca-0be93813880a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf4d46f4-5140-4151-bdca-0be93813880a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53f48833-abcf-4781-86a2-8894fb44decf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53f48833-abcf-4781-86a2-8894fb44decf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53f48833-abcf-4781-86a2-8894fb44decf
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
correlation: qa-443fce91-a799-4db4-ac0c-b52f6f2654ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443fce91-a799-4db4-ac0c-b52f6f2654ad
Content-Type: application/json

--- request body ---
{"handle":"qa-106b03c15051","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-443fce91-a799-4db4-ac0c-b52f6f2654ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-443fce91-a799-4db4-ac0c-b52f6f2654ad"}
```

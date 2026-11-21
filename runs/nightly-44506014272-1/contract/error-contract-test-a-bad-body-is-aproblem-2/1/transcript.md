# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-cdc0291d-4a0f-47b2-8eae-3f245658be23` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-352d031c-df9c-414d-997f-003802d1ec4a` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-2713a545-0ffe-4887-87d4-1ec2f0ed1174` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-d43d0162-8342-402a-b45c-f267c1ca0bb2` |
| 5 | `POST /v1/auth/token` | 422 | 33 | `qa-f4e2e06e-572d-4528-bc4e-48de5427721b` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-7417bc28-887a-43b3-85d6-536cd4cbf9d0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-60083c43-da40-4258-a512-33f7a8dd09c8` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-996057d5-c90e-4c4d-8373-9339fd7b212f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4dc1ae09-45bd-49e3-9335-84ef120dbf9b` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-06b4d3e7-883b-4a7d-9bcc-381bfd2cd889` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cdc0291d-4a0f-47b2-8eae-3f245658be23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdc0291d-4a0f-47b2-8eae-3f245658be23
Content-Type: application/json

--- request body ---
{"handle":"qa-9c807bd3b4c8","displayName":"QA 9c807bd3b4c8","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdc0291d-4a0f-47b2-8eae-3f245658be23
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
Location: /v1/accounts/qa-9c807bd3b4c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb346873-99aa-43c4-8a85-84124951875c","handle":"qa-9c807bd3b4c8","displayName":"QA 9c807bd3b4c8","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.511944366Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-352d031c-df9c-414d-997f-003802d1ec4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352d031c-df9c-414d-997f-003802d1ec4a
Content-Type: application/json

--- request body ---
{"handle":"qa-be474d536120","displayName":"QA be474d536120","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-352d031c-df9c-414d-997f-003802d1ec4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-be474d536120
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edb65c60-a26b-447f-8636-797719de554f","handle":"qa-be474d536120","displayName":"QA be474d536120","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.606612500Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2713a545-0ffe-4887-87d4-1ec2f0ed1174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2713a545-0ffe-4887-87d4-1ec2f0ed1174
Content-Type: application/json

--- request body ---
{"handle":"qa-9c807bd3b4c8","password":"****"}

--- response: 200 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-2713a545-0ffe-4887-87d4-1ec2f0ed1174
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb346873-99aa-43c4-8a85-84124951875c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d43d0162-8342-402a-b45c-f267c1ca0bb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d43d0162-8342-402a-b45c-f267c1ca0bb2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-be474d536120","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-d43d0162-8342-402a-b45c-f267c1ca0bb2
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
Location: /v1/conversations/cnv_b79194c1-1864-4400-ad24-c68f47890dc6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b79194c1-1864-4400-ad24-c68f47890dc6","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c807bd3b4c8","qa-be474d536120"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.707582102Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f4e2e06e-572d-4528-bc4e-48de5427721b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4e2e06e-572d-4528-bc4e-48de5427721b
Content-Type: application/json

--- request body ---
{"handle":"qa-9c807bd3b4c8","password":"****","ttlSeconds":0}

--- response: 422 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4e2e06e-572d-4528-bc4e-48de5427721b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-f4e2e06e-572d-4528-bc4e-48de5427721b","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7417bc28-887a-43b3-85d6-536cd4cbf9d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7417bc28-887a-43b3-85d6-536cd4cbf9d0
Content-Type: application/json

--- request body ---
{"handle":"qa-be474d536120","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-7417bc28-887a-43b3-85d6-536cd4cbf9d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edb65c60-a26b-447f-8636-797719de554f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60083c43-da40-4258-a512-33f7a8dd09c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60083c43-da40-4258-a512-33f7a8dd09c8
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60083c43-da40-4258-a512-33f7a8dd09c8
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
correlation: qa-996057d5-c90e-4c4d-8373-9339fd7b212f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-996057d5-c90e-4c4d-8373-9339fd7b212f
Content-Type: application/json

--- request body ---
{"handle":"qa-be474d536120","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-996057d5-c90e-4c4d-8373-9339fd7b212f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-996057d5-c90e-4c4d-8373-9339fd7b212f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4dc1ae09-45bd-49e3-9335-84ef120dbf9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dc1ae09-45bd-49e3-9335-84ef120dbf9b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4dc1ae09-45bd-49e3-9335-84ef120dbf9b
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
correlation: qa-06b4d3e7-883b-4a7d-9bcc-381bfd2cd889

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b4d3e7-883b-4a7d-9bcc-381bfd2cd889
Content-Type: application/json

--- request body ---
{"handle":"qa-9c807bd3b4c8","password":"****"}

--- response: 401 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06b4d3e7-883b-4a7d-9bcc-381bfd2cd889
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06b4d3e7-883b-4a7d-9bcc-381bfd2cd889"}
```

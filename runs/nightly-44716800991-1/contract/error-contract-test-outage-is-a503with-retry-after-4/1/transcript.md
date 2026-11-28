# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-99fbc11d-fcee-4437-81f9-b3334ec3d32c` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-cc315eaf-a270-4e8f-a3f5-54678348e644` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-7f333199-414c-4a07-84fe-6c8e268eac25` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-e4d40621-07a9-4e60-8d98-2a9ffe8263c1` |
| 5 | `DELETE /v1/accounts/me` | 503 | 50 | `qa-6150f548-8e58-48c2-b2a3-ac53dbd81d81` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-ee20e55c-82d0-4ef6-ba09-79abd657faa5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-bdb3221f-c6c4-4293-840d-20e0d9e05b7c` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-e190150c-e3c8-42bd-9bea-4374abe11fec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-c2c4b979-4280-4592-9155-56cc74d96e0e` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-8a16638d-2b69-4c18-8d46-8fe8ce33a0f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99fbc11d-fcee-4437-81f9-b3334ec3d32c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99fbc11d-fcee-4437-81f9-b3334ec3d32c
Content-Type: application/json

--- request body ---
{"handle":"qa-77f9ca225fbd","displayName":"QA 77f9ca225fbd","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-99fbc11d-fcee-4437-81f9-b3334ec3d32c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Location: /v1/accounts/qa-77f9ca225fbd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8f2b437-5693-4d56-bd9d-720cb1901190","handle":"qa-77f9ca225fbd","displayName":"QA 77f9ca225fbd","region":"eu","role":"user","createdAt":"2026-11-20T10:10:01.974057075Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cc315eaf-a270-4e8f-a3f5-54678348e644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc315eaf-a270-4e8f-a3f5-54678348e644
Content-Type: application/json

--- request body ---
{"handle":"qa-3090675a85e0","displayName":"QA 3090675a85e0","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc315eaf-a270-4e8f-a3f5-54678348e644
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Location: /v1/accounts/qa-3090675a85e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bfca5cee-dba2-411b-b3e2-54eef008f0ad","handle":"qa-3090675a85e0","displayName":"QA 3090675a85e0","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.085825282Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7f333199-414c-4a07-84fe-6c8e268eac25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f333199-414c-4a07-84fe-6c8e268eac25
Content-Type: application/json

--- request body ---
{"handle":"qa-77f9ca225fbd","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f333199-414c-4a07-84fe-6c8e268eac25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8f2b437-5693-4d56-bd9d-720cb1901190"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e4d40621-07a9-4e60-8d98-2a9ffe8263c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4d40621-07a9-4e60-8d98-2a9ffe8263c1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3090675a85e0","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4d40621-07a9-4e60-8d98-2a9ffe8263c1
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
Location: /v1/conversations/cnv_20e63ea1-2b4a-434e-9ea5-246c247e987e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_20e63ea1-2b4a-434e-9ea5-246c247e987e","subject":"Error contract","status":"open","region":"eu","participants":["qa-77f9ca225fbd","qa-3090675a85e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.194133321Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6150f548-8e58-48c2-b2a3-ac53dbd81d81

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 27ed0e2f-92b1-4b08-b1f3-b02808acd9f0
X-Correlation-Id: qa-6150f548-8e58-48c2-b2a3-ac53dbd81d81
Content-Type: application/json

--- response: 503 in 50 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6150f548-8e58-48c2-b2a3-ac53dbd81d81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-6150f548-8e58-48c2-b2a3-ac53dbd81d81"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ee20e55c-82d0-4ef6-ba09-79abd657faa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee20e55c-82d0-4ef6-ba09-79abd657faa5
Content-Type: application/json

--- request body ---
{"handle":"qa-3090675a85e0","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee20e55c-82d0-4ef6-ba09-79abd657faa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bfca5cee-dba2-411b-b3e2-54eef008f0ad"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bdb3221f-c6c4-4293-840d-20e0d9e05b7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdb3221f-c6c4-4293-840d-20e0d9e05b7c
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bdb3221f-c6c4-4293-840d-20e0d9e05b7c
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
correlation: qa-e190150c-e3c8-42bd-9bea-4374abe11fec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e190150c-e3c8-42bd-9bea-4374abe11fec
Content-Type: application/json

--- request body ---
{"handle":"qa-3090675a85e0","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e190150c-e3c8-42bd-9bea-4374abe11fec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e190150c-e3c8-42bd-9bea-4374abe11fec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2c4b979-4280-4592-9155-56cc74d96e0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2c4b979-4280-4592-9155-56cc74d96e0e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2c4b979-4280-4592-9155-56cc74d96e0e
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
correlation: qa-8a16638d-2b69-4c18-8d46-8fe8ce33a0f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a16638d-2b69-4c18-8d46-8fe8ce33a0f3
Content-Type: application/json

--- request body ---
{"handle":"qa-77f9ca225fbd","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a16638d-2b69-4c18-8d46-8fe8ce33a0f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a16638d-2b69-4c18-8d46-8fe8ce33a0f3"}
```

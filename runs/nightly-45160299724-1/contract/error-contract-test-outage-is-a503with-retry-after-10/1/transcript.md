# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-808515f9-f368-4e07-991e-4b331ac83ae7` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-0591fe6d-d72b-4f46-95f9-1b7c72f0532c` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-df3c2a29-b75a-4c47-8b44-d2d1fcd6abd6` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-d1f39684-8c03-4abe-becd-bbda1fb1090c` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 9 | `qa-aa1e2bd9-836a-4e62-bc09-4b485d3314e8` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-0cb5ff52-a84a-483f-b162-7bfea7ce3719` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-857ca199-be75-4e8e-ac1c-17094539e66b` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-f1060fca-9f51-4f1d-aa0d-de14d83635cd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c3fa3e82-43bc-421f-bd5c-15ead75465bd` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-1c9d2d77-192e-4cf1-97d4-0a2e72a62c07` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-808515f9-f368-4e07-991e-4b331ac83ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-808515f9-f368-4e07-991e-4b331ac83ae7
Content-Type: application/json

--- request body ---
{"handle":"qa-1692e0594af8","displayName":"QA 1692e0594af8","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-808515f9-f368-4e07-991e-4b331ac83ae7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Location: /v1/accounts/qa-1692e0594af8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c448c42e-350b-4813-bbf2-a5833760ca2e","handle":"qa-1692e0594af8","displayName":"QA 1692e0594af8","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.366387346Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0591fe6d-d72b-4f46-95f9-1b7c72f0532c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0591fe6d-d72b-4f46-95f9-1b7c72f0532c
Content-Type: application/json

--- request body ---
{"handle":"qa-72ef54e95910","displayName":"QA 72ef54e95910","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0591fe6d-d72b-4f46-95f9-1b7c72f0532c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-72ef54e95910
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cda89543-3946-4500-882b-f377d312a963","handle":"qa-72ef54e95910","displayName":"QA 72ef54e95910","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.390502187Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-df3c2a29-b75a-4c47-8b44-d2d1fcd6abd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df3c2a29-b75a-4c47-8b44-d2d1fcd6abd6
Content-Type: application/json

--- request body ---
{"handle":"qa-1692e0594af8","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-df3c2a29-b75a-4c47-8b44-d2d1fcd6abd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c448c42e-350b-4813-bbf2-a5833760ca2e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d1f39684-8c03-4abe-becd-bbda1fb1090c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1f39684-8c03-4abe-becd-bbda1fb1090c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-72ef54e95910","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1f39684-8c03-4abe-becd-bbda1fb1090c
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
Location: /v1/conversations/cnv_ad05e448-f8c1-48b1-8288-97c140d5bc65
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ad05e448-f8c1-48b1-8288-97c140d5bc65","subject":"Error contract","status":"open","region":"eu","participants":["qa-1692e0594af8","qa-72ef54e95910"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.459910133Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ad05e448-f8c1-48b1-8288-97c140d5bc65/messages
correlation: qa-aa1e2bd9-836a-4e62-bc09-4b485d3314e8

--- request headers ---
Accept: application/json
X-Fault-Key: 4e885563-7fec-4ff1-af2d-fb2cf16e0c6c
X-Fault: unavailable-once
X-Correlation-Id: qa-aa1e2bd9-836a-4e62-bc09-4b485d3314e8
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa1e2bd9-836a-4e62-bc09-4b485d3314e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ad05e448-f8c1-48b1-8288-97c140d5bc65/messages","correlationId":"qa-aa1e2bd9-836a-4e62-bc09-4b485d3314e8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0cb5ff52-a84a-483f-b162-7bfea7ce3719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cb5ff52-a84a-483f-b162-7bfea7ce3719
Content-Type: application/json

--- request body ---
{"handle":"qa-72ef54e95910","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cb5ff52-a84a-483f-b162-7bfea7ce3719
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cda89543-3946-4500-882b-f377d312a963"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-857ca199-be75-4e8e-ac1c-17094539e66b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-857ca199-be75-4e8e-ac1c-17094539e66b
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-857ca199-be75-4e8e-ac1c-17094539e66b
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
correlation: qa-f1060fca-9f51-4f1d-aa0d-de14d83635cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1060fca-9f51-4f1d-aa0d-de14d83635cd
Content-Type: application/json

--- request body ---
{"handle":"qa-72ef54e95910","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1060fca-9f51-4f1d-aa0d-de14d83635cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1060fca-9f51-4f1d-aa0d-de14d83635cd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3fa3e82-43bc-421f-bd5c-15ead75465bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3fa3e82-43bc-421f-bd5c-15ead75465bd
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3fa3e82-43bc-421f-bd5c-15ead75465bd
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
correlation: qa-1c9d2d77-192e-4cf1-97d4-0a2e72a62c07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9d2d77-192e-4cf1-97d4-0a2e72a62c07
Content-Type: application/json

--- request body ---
{"handle":"qa-1692e0594af8","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c9d2d77-192e-4cf1-97d4-0a2e72a62c07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c9d2d77-192e-4cf1-97d4-0a2e72a62c07"}
```

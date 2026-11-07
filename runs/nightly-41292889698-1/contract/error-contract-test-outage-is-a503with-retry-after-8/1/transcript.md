# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-c37b000e-d901-4506-8fe4-1951c5ec2c61` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-bfa70030-a242-4ac6-973d-21be3eb2fc91` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-8d1dc13a-adfc-4cf6-bd79-aa8cba727743` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-1ab08ed2-7f67-441c-be62-0cf1ee47bca9` |
| 5 | `GET /v1/conversations/{id}` | 503 | 20 | `qa-ee1c87f7-71d4-437d-9304-b080b6f356dc` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-c7712aa8-1109-49c2-9472-ff8dceaa11d6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-fe01eedc-6073-4733-8f47-f979cb795066` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-b3fa3e4c-6a5a-47d4-a0fa-faa6376ac098` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-cf28dd5d-10c7-4b58-acf4-8a27a875fd56` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-c9a6a077-065a-4bb7-b6af-1c6f52df1436` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c37b000e-d901-4506-8fe4-1951c5ec2c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c37b000e-d901-4506-8fe4-1951c5ec2c61
Content-Type: application/json

--- request body ---
{"handle":"qa-5726907e4df7","displayName":"QA 5726907e4df7","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c37b000e-d901-4506-8fe4-1951c5ec2c61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Location: /v1/accounts/qa-5726907e4df7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55e76b1c-b17d-49ad-91b3-6b578e5436f0","handle":"qa-5726907e4df7","displayName":"QA 5726907e4df7","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.936149150Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bfa70030-a242-4ac6-973d-21be3eb2fc91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa70030-a242-4ac6-973d-21be3eb2fc91
Content-Type: application/json

--- request body ---
{"handle":"qa-791b3ced0b1d","displayName":"QA 791b3ced0b1d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfa70030-a242-4ac6-973d-21be3eb2fc91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Location: /v1/accounts/qa-791b3ced0b1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_233fcd77-7295-405c-ad8f-fcf48d0e7a0d","handle":"qa-791b3ced0b1d","displayName":"QA 791b3ced0b1d","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.985609779Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8d1dc13a-adfc-4cf6-bd79-aa8cba727743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d1dc13a-adfc-4cf6-bd79-aa8cba727743
Content-Type: application/json

--- request body ---
{"handle":"qa-5726907e4df7","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d1dc13a-adfc-4cf6-bd79-aa8cba727743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55e76b1c-b17d-49ad-91b3-6b578e5436f0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1ab08ed2-7f67-441c-be62-0cf1ee47bca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ab08ed2-7f67-441c-be62-0cf1ee47bca9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-791b3ced0b1d","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ab08ed2-7f67-441c-be62-0cf1ee47bca9
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
Location: /v1/conversations/cnv_b4fb35d1-327c-45e7-b4ca-67c3c44c6115
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b4fb35d1-327c-45e7-b4ca-67c3c44c6115","subject":"Error contract","status":"open","region":"eu","participants":["qa-5726907e4df7","qa-791b3ced0b1d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.047576039Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_b4fb35d1-327c-45e7-b4ca-67c3c44c6115
correlation: qa-ee1c87f7-71d4-437d-9304-b080b6f356dc

--- request headers ---
Accept: application/json
X-Fault-Key: ce04b540-0a98-43d5-8ba8-5fd20f704633
X-Fault: unavailable-once
X-Correlation-Id: qa-ee1c87f7-71d4-437d-9304-b080b6f356dc
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee1c87f7-71d4-437d-9304-b080b6f356dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_b4fb35d1-327c-45e7-b4ca-67c3c44c6115","correlationId":"qa-ee1c87f7-71d4-437d-9304-b080b6f356dc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c7712aa8-1109-49c2-9472-ff8dceaa11d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7712aa8-1109-49c2-9472-ff8dceaa11d6
Content-Type: application/json

--- request body ---
{"handle":"qa-791b3ced0b1d","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7712aa8-1109-49c2-9472-ff8dceaa11d6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_233fcd77-7295-405c-ad8f-fcf48d0e7a0d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe01eedc-6073-4733-8f47-f979cb795066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe01eedc-6073-4733-8f47-f979cb795066
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe01eedc-6073-4733-8f47-f979cb795066
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
correlation: qa-b3fa3e4c-6a5a-47d4-a0fa-faa6376ac098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3fa3e4c-6a5a-47d4-a0fa-faa6376ac098
Content-Type: application/json

--- request body ---
{"handle":"qa-791b3ced0b1d","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3fa3e4c-6a5a-47d4-a0fa-faa6376ac098
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b3fa3e4c-6a5a-47d4-a0fa-faa6376ac098"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf28dd5d-10c7-4b58-acf4-8a27a875fd56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf28dd5d-10c7-4b58-acf4-8a27a875fd56
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf28dd5d-10c7-4b58-acf4-8a27a875fd56
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
correlation: qa-c9a6a077-065a-4bb7-b6af-1c6f52df1436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9a6a077-065a-4bb7-b6af-1c6f52df1436
Content-Type: application/json

--- request body ---
{"handle":"qa-5726907e4df7","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9a6a077-065a-4bb7-b6af-1c6f52df1436
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9a6a077-065a-4bb7-b6af-1c6f52df1436"}
```

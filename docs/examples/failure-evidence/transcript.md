# Transcript: DEMO: a polled condition that never becomes true

| | |
|---|---|
| Test | `com.qaautomation.tests.demo.DeliberateFailureTest#conditionNeverMetFails` |
| Features | FEAT-DEMO-01 |
| Attempt | 2 |
| Status | failed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-34a5dc18-485e-4fe0-95e6-1d061d821f11` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-ae63702d-e397-45bd-a23b-fb274f11804c` |
| 3 | `GET /v1/credits/balance` | 200 | 8 | `qa-26d2c0e1-fb06-427b-8d47-256e88101d85` |
| 4 | `GET /v1/credits/balance` | 200 | 6 | `qa-b43d3111-5729-4f49-ab03-55df05f7bff2` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-61d50acf-3ba4-4fa7-8ff5-c74f54301654` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-1ef0584e-49b0-4b21-8f7c-4e06aa5d2b12` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-840fc4fe-991c-4c5e-9722-5a2f07e24100` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34a5dc18-485e-4fe0-95e6-1d061d821f11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a5dc18-485e-4fe0-95e6-1d061d821f11
Content-Type: application/json

--- request body ---
{"handle":"qa-063c89aae353","displayName":"QA 063c89aae353","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Thu, 22 Oct 2026 04:40:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-34a5dc18-485e-4fe0-95e6-1d061d821f11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 8
Location: /v1/accounts/qa-063c89aae353
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fcef6e88-3bc8-4f03-b33f-bf48577ad0e2","handle":"qa-063c89aae353","displayName":"QA 063c89aae353","region":"eu","role":"user","createdAt":"2026-10-22T04:40:54.792073900Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ae63702d-e397-45bd-a23b-fb274f11804c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae63702d-e397-45bd-a23b-fb274f11804c
Content-Type: application/json

--- request body ---
{"handle":"qa-063c89aae353","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 22 Oct 2026 04:40:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae63702d-e397-45bd-a23b-fb274f11804c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fcef6e88-3bc8-4f03-b33f-bf48577ad0e2"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-26d2c0e1-fb06-427b-8d47-256e88101d85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d2c0e1-fb06-427b-8d47-256e88101d85
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 22 Oct 2026 04:40:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-26d2c0e1-fb06-427b-8d47-256e88101d85
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_fcef6e88-3bc8-4f03-b33f-bf48577ad0e2"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-b43d3111-5729-4f49-ab03-55df05f7bff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b43d3111-5729-4f49-ab03-55df05f7bff2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 22 Oct 2026 04:40:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b43d3111-5729-4f49-ab03-55df05f7bff2
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_fcef6e88-3bc8-4f03-b33f-bf48577ad0e2"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-61d50acf-3ba4-4fa7-8ff5-c74f54301654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d50acf-3ba4-4fa7-8ff5-c74f54301654
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 22 Oct 2026 04:40:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-61d50acf-3ba4-4fa7-8ff5-c74f54301654
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_fcef6e88-3bc8-4f03-b33f-bf48577ad0e2"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ef0584e-49b0-4b21-8f7c-4e06aa5d2b12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ef0584e-49b0-4b21-8f7c-4e06aa5d2b12
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 22 Oct 2026 04:40:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ef0584e-49b0-4b21-8f7c-4e06aa5d2b12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-840fc4fe-991c-4c5e-9722-5a2f07e24100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-840fc4fe-991c-4c5e-9722-5a2f07e24100
Content-Type: application/json

--- request body ---
{"handle":"qa-063c89aae353","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 22 Oct 2026 04:40:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-840fc4fe-991c-4c5e-9722-5a2f07e24100
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-840fc4fe-991c-4c5e-9722-5a2f07e24100"}
```

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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-04996e5c-939f-4a64-8479-3880df5cf025` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-2654789c-2da4-4adc-9188-15643ca89de1` |
| 3 | `GET /v1/credits/balance` | 200 | 5 | `qa-dfe85eac-f77c-4f15-b62c-76ec83efd298` |
| 4 | `GET /v1/credits/balance` | 200 | 5 | `qa-f0e388e8-a2be-4e90-86a5-46b64e55ceb3` |
| 5 | `GET /v1/credits/balance` | 200 | 5 | `qa-e5f81fe8-044c-4bcc-bf6f-48ef69f378e5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-7f93798f-1c96-4a53-be66-28b1101b6444` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-8601101d-c6a9-40ed-9a96-cf7a3a3efbbe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04996e5c-939f-4a64-8479-3880df5cf025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04996e5c-939f-4a64-8479-3880df5cf025
Content-Type: application/json

--- request body ---
{"handle":"qa-97f5a016198c","displayName":"QA 97f5a016198c","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Wed, 21 Oct 2026 16:02:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-04996e5c-939f-4a64-8479-3880df5cf025
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
Location: /v1/accounts/qa-97f5a016198c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e60a7f4f-fd90-4b18-b162-74e2ed1b2a9f","handle":"qa-97f5a016198c","displayName":"QA 97f5a016198c","region":"eu","role":"user","createdAt":"2026-10-21T16:02:54.875613300Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2654789c-2da4-4adc-9188-15643ca89de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2654789c-2da4-4adc-9188-15643ca89de1
Content-Type: application/json

--- request body ---
{"handle":"qa-97f5a016198c","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 21 Oct 2026 16:02:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2654789c-2da4-4adc-9188-15643ca89de1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e60a7f4f-fd90-4b18-b162-74e2ed1b2a9f"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-dfe85eac-f77c-4f15-b62c-76ec83efd298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfe85eac-f77c-4f15-b62c-76ec83efd298
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 21 Oct 2026 16:02:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfe85eac-f77c-4f15-b62c-76ec83efd298
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

{"balance":5,"currency":"credits","accountId":"acc_e60a7f4f-fd90-4b18-b162-74e2ed1b2a9f"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-f0e388e8-a2be-4e90-86a5-46b64e55ceb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0e388e8-a2be-4e90-86a5-46b64e55ceb3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 21 Oct 2026 16:02:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0e388e8-a2be-4e90-86a5-46b64e55ceb3
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

{"balance":5,"currency":"credits","accountId":"acc_e60a7f4f-fd90-4b18-b162-74e2ed1b2a9f"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-e5f81fe8-044c-4bcc-bf6f-48ef69f378e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5f81fe8-044c-4bcc-bf6f-48ef69f378e5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 21 Oct 2026 16:02:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5f81fe8-044c-4bcc-bf6f-48ef69f378e5
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

{"balance":5,"currency":"credits","accountId":"acc_e60a7f4f-fd90-4b18-b162-74e2ed1b2a9f"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f93798f-1c96-4a53-be66-28b1101b6444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f93798f-1c96-4a53-be66-28b1101b6444
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 21 Oct 2026 16:02:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f93798f-1c96-4a53-be66-28b1101b6444
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
correlation: qa-8601101d-c6a9-40ed-9a96-cf7a3a3efbbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8601101d-c6a9-40ed-9a96-cf7a3a3efbbe
Content-Type: application/json

--- request body ---
{"handle":"qa-97f5a016198c","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 21 Oct 2026 16:02:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8601101d-c6a9-40ed-9a96-cf7a3a3efbbe
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8601101d-c6a9-40ed-9a96-cf7a3a3efbbe"}
```

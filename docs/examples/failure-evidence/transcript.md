# Transcript: DEMO: a polled condition that never becomes true

| | |
|---|---|
| Test | `com.kishore.qa.tests.demo.DeliberateFailureTest#conditionNeverMetFails` |
| Features | FEAT-DEMO-01 |
| Attempt | 2 |
| Status | failed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-d527abdb-09fc-44f9-8851-1c9a105f12ef` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-23f7c0de-1095-4612-b1a0-149e6560dac0` |
| 3 | `GET /v1/credits/balance` | 200 | 6 | `qa-7f6df1a3-f801-489f-addb-74bf3e0741a6` |
| 4 | `GET /v1/credits/balance` | 200 | 7 | `qa-fd057206-fc0d-447b-aa1a-a90e8e91790a` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-86fb5cb9-77e8-4b4b-ab7d-fdfd346dc3e1` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fd4a15de-bb87-4b17-87ab-9bd432eeb5a6` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-8239076c-c519-4c68-b1b1-835ab5a2454d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d527abdb-09fc-44f9-8851-1c9a105f12ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d527abdb-09fc-44f9-8851-1c9a105f12ef
Content-Type: application/json

--- request body ---
{"handle":"qa-c94e75b947eb","displayName":"QA c94e75b947eb","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Wed, 21 Oct 2026 06:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-d527abdb-09fc-44f9-8851-1c9a105f12ef
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
Location: /v1/accounts/qa-c94e75b947eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89e0b7b2-e4c6-4b93-b4c2-3971b8235a3b","handle":"qa-c94e75b947eb","displayName":"QA c94e75b947eb","region":"eu","role":"user","createdAt":"2026-10-21T06:40:28.030986100Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-23f7c0de-1095-4612-b1a0-149e6560dac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f7c0de-1095-4612-b1a0-149e6560dac0
Content-Type: application/json

--- request body ---
{"handle":"qa-c94e75b947eb","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 21 Oct 2026 06:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-23f7c0de-1095-4612-b1a0-149e6560dac0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89e0b7b2-e4c6-4b93-b4c2-3971b8235a3b"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-7f6df1a3-f801-489f-addb-74bf3e0741a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f6df1a3-f801-489f-addb-74bf3e0741a6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 21 Oct 2026 06:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f6df1a3-f801-489f-addb-74bf3e0741a6
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

{"balance":5,"currency":"credits","accountId":"acc_89e0b7b2-e4c6-4b93-b4c2-3971b8235a3b"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-fd057206-fc0d-447b-aa1a-a90e8e91790a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd057206-fc0d-447b-aa1a-a90e8e91790a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 21 Oct 2026 06:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd057206-fc0d-447b-aa1a-a90e8e91790a
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

{"balance":5,"currency":"credits","accountId":"acc_89e0b7b2-e4c6-4b93-b4c2-3971b8235a3b"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-86fb5cb9-77e8-4b4b-ab7d-fdfd346dc3e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86fb5cb9-77e8-4b4b-ab7d-fdfd346dc3e1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 21 Oct 2026 06:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-86fb5cb9-77e8-4b4b-ab7d-fdfd346dc3e1
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

{"balance":5,"currency":"credits","accountId":"acc_89e0b7b2-e4c6-4b93-b4c2-3971b8235a3b"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd4a15de-bb87-4b17-87ab-9bd432eeb5a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd4a15de-bb87-4b17-87ab-9bd432eeb5a6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 21 Oct 2026 06:40:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd4a15de-bb87-4b17-87ab-9bd432eeb5a6
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
correlation: qa-8239076c-c519-4c68-b1b1-835ab5a2454d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8239076c-c519-4c68-b1b1-835ab5a2454d
Content-Type: application/json

--- request body ---
{"handle":"qa-c94e75b947eb","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 21 Oct 2026 06:40:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8239076c-c519-4c68-b1b1-835ab5a2454d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8239076c-c519-4c68-b1b1-835ab5a2454d"}
```

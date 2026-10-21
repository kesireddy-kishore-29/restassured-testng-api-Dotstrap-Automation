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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-3ca3388f-2564-4b44-b6db-9ccc746d391c` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-63864ed1-bb9d-4f47-9afe-6b133e0349ff` |
| 3 | `GET /v1/credits/balance` | 200 | 11 | `qa-9b8e7b15-0f5f-4f89-bc01-b0cc87105862` |
| 4 | `GET /v1/credits/balance` | 200 | 8 | `qa-8ef319a5-85bd-4369-98fc-6a8007c208fd` |
| 5 | `GET /v1/credits/balance` | 200 | 14 | `qa-040b134c-31e2-40b7-b816-dc4bd5e758de` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0dfecc5a-cc9d-47f0-b884-25f7bf8f4347` |
| 7 | `POST /v1/auth/token` | 401 | 12 | `qa-84b9f58a-d674-4455-9a65-c7a03df68b27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ca3388f-2564-4b44-b6db-9ccc746d391c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca3388f-2564-4b44-b6db-9ccc746d391c
Content-Type: application/json

--- request body ---
{"handle":"qa-f64ae8090c7f","displayName":"QA f64ae8090c7f","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 21 Oct 2026 14:49:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ca3388f-2564-4b44-b6db-9ccc746d391c
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
Location: /v1/accounts/qa-f64ae8090c7f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0cadb294-2e05-44b3-95ca-2838c4ba5209","handle":"qa-f64ae8090c7f","displayName":"QA f64ae8090c7f","region":"eu","role":"user","createdAt":"2026-10-21T14:49:51.017689400Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-63864ed1-bb9d-4f47-9afe-6b133e0349ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63864ed1-bb9d-4f47-9afe-6b133e0349ff
Content-Type: application/json

--- request body ---
{"handle":"qa-f64ae8090c7f","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 21 Oct 2026 14:49:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-63864ed1-bb9d-4f47-9afe-6b133e0349ff
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0cadb294-2e05-44b3-95ca-2838c4ba5209"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-9b8e7b15-0f5f-4f89-bc01-b0cc87105862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8e7b15-0f5f-4f89-bc01-b0cc87105862
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 21 Oct 2026 14:49:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b8e7b15-0f5f-4f89-bc01-b0cc87105862
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

{"balance":5,"currency":"credits","accountId":"acc_0cadb294-2e05-44b3-95ca-2838c4ba5209"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-8ef319a5-85bd-4369-98fc-6a8007c208fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ef319a5-85bd-4369-98fc-6a8007c208fd
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 21 Oct 2026 14:49:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ef319a5-85bd-4369-98fc-6a8007c208fd
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

{"balance":5,"currency":"credits","accountId":"acc_0cadb294-2e05-44b3-95ca-2838c4ba5209"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-040b134c-31e2-40b7-b816-dc4bd5e758de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-040b134c-31e2-40b7-b816-dc4bd5e758de
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 21 Oct 2026 14:49:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-040b134c-31e2-40b7-b816-dc4bd5e758de
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

{"balance":5,"currency":"credits","accountId":"acc_0cadb294-2e05-44b3-95ca-2838c4ba5209"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0dfecc5a-cc9d-47f0-b884-25f7bf8f4347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dfecc5a-cc9d-47f0-b884-25f7bf8f4347
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 21 Oct 2026 14:49:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0dfecc5a-cc9d-47f0-b884-25f7bf8f4347
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
correlation: qa-84b9f58a-d674-4455-9a65-c7a03df68b27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84b9f58a-d674-4455-9a65-c7a03df68b27
Content-Type: application/json

--- request body ---
{"handle":"qa-f64ae8090c7f","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 21 Oct 2026 14:49:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84b9f58a-d674-4455-9a65-c7a03df68b27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84b9f58a-d674-4455-9a65-c7a03df68b27"}
```

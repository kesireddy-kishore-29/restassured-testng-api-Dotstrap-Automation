# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-02541bad-daab-4ca6-aaac-2317f226dcc8` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-f54764d6-5498-478e-be9e-5f33fa5fbed8` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-16ade59e-ac3f-4832-88ac-baf699107168` |
| 4 | `POST /v1/credits/purchases` | 201 | 15 | `qa-d9651ce7-1f10-43c0-917c-405bfab1f4bf` |
| 5 | `POST /v1/auth/token` | 200 | 15 | `qa-d3bcfa99-a1ef-43e3-945e-2a7ba7c4f398` |
| 6 | `POST /v1/credits/purchases` | 201 | 6 | `qa-2cf0191f-5c0e-44c8-8519-f9b6357172bc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-559a3b18-4caf-4caa-850f-317a57412d7f` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-1c52dce3-ac6f-4483-9730-2efc71a90aac` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-87507d8b-4689-4124-a718-5360235b8e77` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-f8710338-2570-41cc-bac8-396d2665b2cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-02541bad-daab-4ca6-aaac-2317f226dcc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02541bad-daab-4ca6-aaac-2317f226dcc8
Content-Type: application/json

--- request body ---
{"handle":"qa-eccf2a1d9014","displayName":"QA eccf2a1d9014","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-02541bad-daab-4ca6-aaac-2317f226dcc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-eccf2a1d9014
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cbc6e45-0e72-4e84-ab43-d74316d66799","handle":"qa-eccf2a1d9014","displayName":"QA eccf2a1d9014","region":"eu","role":"user","createdAt":"2026-10-25T07:40:29.131180860Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f54764d6-5498-478e-be9e-5f33fa5fbed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f54764d6-5498-478e-be9e-5f33fa5fbed8
Content-Type: application/json

--- request body ---
{"handle":"qa-6fa3ea20e5cf","displayName":"QA 6fa3ea20e5cf","password":"****","region":"us"}

--- response: 201 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-f54764d6-5498-478e-be9e-5f33fa5fbed8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-6fa3ea20e5cf
X-Served-Region: us
Content-Length: 181

{"id":"acc_9b8c9ed4-e702-4512-91a6-3c969829d13c","handle":"qa-6fa3ea20e5cf","displayName":"QA 6fa3ea20e5cf","region":"us","role":"user","createdAt":"2026-10-25T07:40:29.148428895Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-16ade59e-ac3f-4832-88ac-baf699107168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16ade59e-ac3f-4832-88ac-baf699107168
Content-Type: application/json

--- request body ---
{"handle":"qa-eccf2a1d9014","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-16ade59e-ac3f-4832-88ac-baf699107168
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4cbc6e45-0e72-4e84-ab43-d74316d66799"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d9651ce7-1f10-43c0-917c-405bfab1f4bf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e704bd3ce04d49f9946bf8c483d75e3f
X-Correlation-Id: qa-d9651ce7-1f10-43c0-917c-405bfab1f4bf
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9651ce7-1f10-43c0-917c-405bfab1f4bf
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
Location: /v1/credits/purchases/pur_2311dadc-c2c7-449d-b5b5-d66728e57179
Content-Length: 144

{"id":"pur_2311dadc-c2c7-449d-b5b5-d66728e57179","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:29.190302012Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d3bcfa99-a1ef-43e3-945e-2a7ba7c4f398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3bcfa99-a1ef-43e3-945e-2a7ba7c4f398
Content-Type: application/json

--- request body ---
{"handle":"qa-6fa3ea20e5cf","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3bcfa99-a1ef-43e3-945e-2a7ba7c4f398
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b8c9ed4-e702-4512-91a6-3c969829d13c"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2cf0191f-5c0e-44c8-8519-f9b6357172bc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e704bd3ce04d49f9946bf8c483d75e3f
X-Correlation-Id: qa-2cf0191f-5c0e-44c8-8519-f9b6357172bc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cf0191f-5c0e-44c8-8519-f9b6357172bc
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_6387ba7f-916c-4139-b508-383a12040611
Content-Length: 144

{"id":"pur_6387ba7f-916c-4139-b508-383a12040611","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:29.242760717Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-559a3b18-4caf-4caa-850f-317a57412d7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-559a3b18-4caf-4caa-850f-317a57412d7f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-559a3b18-4caf-4caa-850f-317a57412d7f
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-1c52dce3-ac6f-4483-9730-2efc71a90aac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c52dce3-ac6f-4483-9730-2efc71a90aac
Content-Type: application/json

--- request body ---
{"handle":"qa-6fa3ea20e5cf","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c52dce3-ac6f-4483-9730-2efc71a90aac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c52dce3-ac6f-4483-9730-2efc71a90aac"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87507d8b-4689-4124-a718-5360235b8e77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87507d8b-4689-4124-a718-5360235b8e77
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87507d8b-4689-4124-a718-5360235b8e77
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
correlation: qa-f8710338-2570-41cc-bac8-396d2665b2cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8710338-2570-41cc-bac8-396d2665b2cc
Content-Type: application/json

--- request body ---
{"handle":"qa-eccf2a1d9014","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8710338-2570-41cc-bac8-396d2665b2cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8710338-2570-41cc-bac8-396d2665b2cc"}
```

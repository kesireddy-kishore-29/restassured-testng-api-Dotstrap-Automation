# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-9c560e14-1a23-454a-892c-b26286211b2a` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-48ef21a2-120f-48b6-ab13-e266dda6c361` |
| 3 | `GET /v1/accounts/me` | 200 | 58 | `qa-24a4011a-83ad-486d-a65b-ce657b0f5f39` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-9a0bffbb-dc26-4620-9a5f-d9a94a079d03` |
| 5 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-27b21b70-9ce4-4246-9823-e23ae653df32` |
| 6 | `POST /v1/auth/token` | 401 | 20 | `qa-68cd5c10-24ee-4d3e-baaf-7be7dbdab5f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c560e14-1a23-454a-892c-b26286211b2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c560e14-1a23-454a-892c-b26286211b2a
Content-Type: application/json

--- request body ---
{"handle":"qa-013b9ccaf9f3","displayName":"QA 013b9ccaf9f3","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c560e14-1a23-454a-892c-b26286211b2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-013b9ccaf9f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7ead5ba-3b49-4da2-9f6a-9f7bfa05f99a","handle":"qa-013b9ccaf9f3","displayName":"QA 013b9ccaf9f3","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.879162710Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-48ef21a2-120f-48b6-ab13-e266dda6c361

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ef21a2-120f-48b6-ab13-e266dda6c361
Content-Type: application/json

--- request body ---
{"handle":"qa-013b9ccaf9f3","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-48ef21a2-120f-48b6-ab13-e266dda6c361
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7ead5ba-3b49-4da2-9f6a-9f7bfa05f99a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-24a4011a-83ad-486d-a65b-ce657b0f5f39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24a4011a-83ad-486d-a65b-ce657b0f5f39
Content-Type: application/json

--- response: 200 in 58 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-24a4011a-83ad-486d-a65b-ce657b0f5f39
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
Content-Length: 181

{"id":"acc_e7ead5ba-3b49-4da2-9f6a-9f7bfa05f99a","handle":"qa-013b9ccaf9f3","displayName":"QA 013b9ccaf9f3","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.879162710Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a0bffbb-dc26-4620-9a5f-d9a94a079d03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a0bffbb-dc26-4620-9a5f-d9a94a079d03
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a0bffbb-dc26-4620-9a5f-d9a94a079d03
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
Content-Length: 181

{"id":"acc_e7ead5ba-3b49-4da2-9f6a-9f7bfa05f99a","handle":"qa-013b9ccaf9f3","displayName":"QA 013b9ccaf9f3","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.879162710Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27b21b70-9ce4-4246-9823-e23ae653df32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b21b70-9ce4-4246-9823-e23ae653df32
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27b21b70-9ce4-4246-9823-e23ae653df32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-68cd5c10-24ee-4d3e-baaf-7be7dbdab5f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68cd5c10-24ee-4d3e-baaf-7be7dbdab5f7
Content-Type: application/json

--- request body ---
{"handle":"qa-013b9ccaf9f3","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68cd5c10-24ee-4d3e-baaf-7be7dbdab5f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68cd5c10-24ee-4d3e-baaf-7be7dbdab5f7"}
```

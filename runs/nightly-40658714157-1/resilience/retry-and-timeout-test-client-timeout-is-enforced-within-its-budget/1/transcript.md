# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 299 | `qa-2a66f696-b9fb-4981-bf16-b285cf0aa730` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-4472eee8-9312-49f9-9915-afe395077df2` |
| 3 | `GET /v1/accounts/me` | error | 830 | `qa-340cfb03-5533-4a26-a5b5-b626507f211c` |
| 4 | `GET /v1/accounts/me` | error | 808 | `qa-b869dc83-e1e7-472b-ac11-e0692ef0bcd2` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fd9ccf2f-8e28-4198-85fd-c2247e1ced6b` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-cf7fb87d-dab7-409c-80cd-9967712de8dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2a66f696-b9fb-4981-bf16-b285cf0aa730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a66f696-b9fb-4981-bf16-b285cf0aa730
Content-Type: application/json

--- request body ---
{"handle":"qa-846be3f36353","displayName":"QA 846be3f36353","password":"****","region":"eu"}

--- response: 201 in 299 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a66f696-b9fb-4981-bf16-b285cf0aa730
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-846be3f36353
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6e4bb2e-9a99-4a2c-961c-9964522cbfe3","handle":"qa-846be3f36353","displayName":"QA 846be3f36353","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.265589866Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4472eee8-9312-49f9-9915-afe395077df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4472eee8-9312-49f9-9915-afe395077df2
Content-Type: application/json

--- request body ---
{"handle":"qa-846be3f36353","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4472eee8-9312-49f9-9915-afe395077df2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6e4bb2e-9a99-4a2c-961c-9964522cbfe3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-340cfb03-5533-4a26-a5b5-b626507f211c

--- request headers ---
Accept: application/json
X-Fault-Key: a3e0bc5c-96ea-4f7f-9fdd-ca9f465c6acd
X-Fault: latency=4000
X-Correlation-Id: qa-340cfb03-5533-4a26-a5b5-b626507f211c
Content-Type: application/json

--- response: none in 830 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b869dc83-e1e7-472b-ac11-e0692ef0bcd2

--- request headers ---
Accept: application/json
X-Fault-Key: a3e0bc5c-96ea-4f7f-9fdd-ca9f465c6acd
X-Fault: latency=4000
X-Correlation-Id: qa-b869dc83-e1e7-472b-ac11-e0692ef0bcd2
Content-Type: application/json

--- response: none in 808 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd9ccf2f-8e28-4198-85fd-c2247e1ced6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd9ccf2f-8e28-4198-85fd-c2247e1ced6b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd9ccf2f-8e28-4198-85fd-c2247e1ced6b
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cf7fb87d-dab7-409c-80cd-9967712de8dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf7fb87d-dab7-409c-80cd-9967712de8dc
Content-Type: application/json

--- request body ---
{"handle":"qa-846be3f36353","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf7fb87d-dab7-409c-80cd-9967712de8dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf7fb87d-dab7-409c-80cd-9967712de8dc"}
```

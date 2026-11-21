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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-f942211c-d130-45aa-83d6-fb00dbe0adeb` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-25633dc9-5450-4ae4-916e-076c18d80801` |
| 3 | `GET /v1/accounts/me` | error | 811 | `qa-dae94405-547e-4a7a-ad04-e14514821270` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-82d743c3-9eee-493d-b6d4-7d47d7223287` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-273835b0-0f4d-48d3-9fb7-b94c1d42bb1e` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-d9779399-777d-42df-8bb4-0241be5e102f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f942211c-d130-45aa-83d6-fb00dbe0adeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f942211c-d130-45aa-83d6-fb00dbe0adeb
Content-Type: application/json

--- request body ---
{"handle":"qa-047c9a5aec29","displayName":"QA 047c9a5aec29","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f942211c-d130-45aa-83d6-fb00dbe0adeb
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
Location: /v1/accounts/qa-047c9a5aec29
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7724ed40-b386-43c6-8818-e04a141948c2","handle":"qa-047c9a5aec29","displayName":"QA 047c9a5aec29","region":"eu","role":"user","createdAt":"2026-11-15T09:36:14.616434405Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-25633dc9-5450-4ae4-916e-076c18d80801

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25633dc9-5450-4ae4-916e-076c18d80801
Content-Type: application/json

--- request body ---
{"handle":"qa-047c9a5aec29","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-25633dc9-5450-4ae4-916e-076c18d80801
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7724ed40-b386-43c6-8818-e04a141948c2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-dae94405-547e-4a7a-ad04-e14514821270

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 584cf04c-2a0f-43fe-9a98-d7d13169b58d
X-Correlation-Id: qa-dae94405-547e-4a7a-ad04-e14514821270
Content-Type: application/json

--- response: none in 811 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-82d743c3-9eee-493d-b6d4-7d47d7223287

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 584cf04c-2a0f-43fe-9a98-d7d13169b58d
X-Correlation-Id: qa-82d743c3-9eee-493d-b6d4-7d47d7223287
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-273835b0-0f4d-48d3-9fb7-b94c1d42bb1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-273835b0-0f4d-48d3-9fb7-b94c1d42bb1e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-273835b0-0f4d-48d3-9fb7-b94c1d42bb1e
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
correlation: qa-d9779399-777d-42df-8bb4-0241be5e102f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9779399-777d-42df-8bb4-0241be5e102f
Content-Type: application/json

--- request body ---
{"handle":"qa-047c9a5aec29","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9779399-777d-42df-8bb4-0241be5e102f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9779399-777d-42df-8bb4-0241be5e102f"}
```

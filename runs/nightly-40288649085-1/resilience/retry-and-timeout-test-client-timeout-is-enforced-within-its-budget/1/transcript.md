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
| 1 | `POST /v1/accounts` | 201 | 404 | `qa-d1704c10-39eb-427a-ae70-370d3eb9f1ad` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-672cd284-9c92-4516-a612-86790d7a7e67` |
| 3 | `GET /v1/accounts/me` | error | 848 | `qa-acaeaa3a-243b-4b75-92be-2352d90ef829` |
| 4 | `GET /v1/accounts/me` | error | 814 | `qa-fdcd2428-7b13-4485-8c6b-0b3ab1981fba` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-dbe6fe77-366a-487a-a70a-a7f22cc41fb2` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-31f8a3cc-9fd9-45e9-9e5c-4ce6950150b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d1704c10-39eb-427a-ae70-370d3eb9f1ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1704c10-39eb-427a-ae70-370d3eb9f1ad
Content-Type: application/json

--- request body ---
{"handle":"qa-3107c592fb66","displayName":"QA 3107c592fb66","password":"****","region":"eu"}

--- response: 201 in 404 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1704c10-39eb-427a-ae70-370d3eb9f1ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-3107c592fb66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee8fd84a-c522-4836-827a-b03fd8c1f688","handle":"qa-3107c592fb66","displayName":"QA 3107c592fb66","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.643006319Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-672cd284-9c92-4516-a612-86790d7a7e67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672cd284-9c92-4516-a612-86790d7a7e67
Content-Type: application/json

--- request body ---
{"handle":"qa-3107c592fb66","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-672cd284-9c92-4516-a612-86790d7a7e67
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee8fd84a-c522-4836-827a-b03fd8c1f688"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-acaeaa3a-243b-4b75-92be-2352d90ef829

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 8cd48017-482c-4431-bd87-884ee851977e
X-Correlation-Id: qa-acaeaa3a-243b-4b75-92be-2352d90ef829
Content-Type: application/json

--- response: none in 848 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdcd2428-7b13-4485-8c6b-0b3ab1981fba

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 8cd48017-482c-4431-bd87-884ee851977e
X-Correlation-Id: qa-fdcd2428-7b13-4485-8c6b-0b3ab1981fba
Content-Type: application/json

--- response: none in 814 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbe6fe77-366a-487a-a70a-a7f22cc41fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbe6fe77-366a-487a-a70a-a7f22cc41fb2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbe6fe77-366a-487a-a70a-a7f22cc41fb2
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
correlation: qa-31f8a3cc-9fd9-45e9-9e5c-4ce6950150b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31f8a3cc-9fd9-45e9-9e5c-4ce6950150b0
Content-Type: application/json

--- request body ---
{"handle":"qa-3107c592fb66","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31f8a3cc-9fd9-45e9-9e5c-4ce6950150b0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31f8a3cc-9fd9-45e9-9e5c-4ce6950150b0"}
```

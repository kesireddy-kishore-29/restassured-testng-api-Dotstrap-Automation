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
| 1 | `POST /v1/accounts` | 201 | 439 | `qa-0a651e99-833b-49f4-b729-b48951aaa93c` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-df0767f5-c274-4ba6-98d3-6a67bcf247a5` |
| 3 | `GET /v1/accounts/me` | error | 824 | `qa-aab9c961-21b3-4a59-ad6a-0f9f07293853` |
| 4 | `GET /v1/accounts/me` | error | 807 | `qa-bda8d134-bfa9-41eb-8958-6200bfed04a3` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c4b8973a-b820-4598-8c92-26aac2f07579` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-704d7e1c-0101-43a4-bed2-ddf15f748fdd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0a651e99-833b-49f4-b729-b48951aaa93c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a651e99-833b-49f4-b729-b48951aaa93c
Content-Type: application/json

--- request body ---
{"handle":"qa-3a37ff82dc0f","displayName":"QA 3a37ff82dc0f","password":"****","region":"eu"}

--- response: 201 in 439 ms ---
Date: Fri, 23 Oct 2026 07:41:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a651e99-833b-49f4-b729-b48951aaa93c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-3a37ff82dc0f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1bd18a88-824b-4d69-bbef-f893766150f3","handle":"qa-3a37ff82dc0f","displayName":"QA 3a37ff82dc0f","region":"eu","role":"user","createdAt":"2026-10-23T07:41:15.021851931Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-df0767f5-c274-4ba6-98d3-6a67bcf247a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df0767f5-c274-4ba6-98d3-6a67bcf247a5
Content-Type: application/json

--- request body ---
{"handle":"qa-3a37ff82dc0f","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-df0767f5-c274-4ba6-98d3-6a67bcf247a5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1bd18a88-824b-4d69-bbef-f893766150f3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-aab9c961-21b3-4a59-ad6a-0f9f07293853

--- request headers ---
Accept: application/json
X-Fault-Key: e361dfaf-ba70-42a0-a9b4-7371d3fdbe37
X-Fault: latency=4000
X-Correlation-Id: qa-aab9c961-21b3-4a59-ad6a-0f9f07293853
Content-Type: application/json

--- response: none in 824 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-bda8d134-bfa9-41eb-8958-6200bfed04a3

--- request headers ---
Accept: application/json
X-Fault-Key: e361dfaf-ba70-42a0-a9b4-7371d3fdbe37
X-Fault: latency=4000
X-Correlation-Id: qa-bda8d134-bfa9-41eb-8958-6200bfed04a3
Content-Type: application/json

--- response: none in 807 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4b8973a-b820-4598-8c92-26aac2f07579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b8973a-b820-4598-8c92-26aac2f07579
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4b8973a-b820-4598-8c92-26aac2f07579
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
correlation: qa-704d7e1c-0101-43a4-bed2-ddf15f748fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-704d7e1c-0101-43a4-bed2-ddf15f748fdd
Content-Type: application/json

--- request body ---
{"handle":"qa-3a37ff82dc0f","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-704d7e1c-0101-43a4-bed2-ddf15f748fdd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-704d7e1c-0101-43a4-bed2-ddf15f748fdd"}
```
